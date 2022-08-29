public class RomanToArabianProxy implements Roman {
    private String roman;
    private RomanToArabian romanToArabian;

    public RomanToArabianProxy(String roman) {
        this.roman = roman;
    }

    @Override
    public void setRoman(String rom) {
        if (romanToArabian == null) {
            romanToArabian = new RomanToArabian(roman);
        }
        romanToArabian.setRoman(rom);
    }

    @Override
    public String getRoman() {
        if (romanToArabian == null) {
            romanToArabian = new RomanToArabian(roman);
        }
        return romanToArabian.getRoman();
    }

    @Override
    public int getArabian() {
        if (romanToArabian == null) {
            romanToArabian = new RomanToArabian(roman);
        }
        return romanToArabian.romanToArabian(roman);
    }
}
