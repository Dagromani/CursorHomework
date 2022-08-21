public class RomanToArabianProxy implements Roman {

    RomanToArabian romanToArabian = new RomanToArabian();

    @Override
    public void setRoman(String rom) {
        romanToArabian.setRoman(rom);
    }

    @Override
    public String getRoman() {
        return romanToArabian.getRoman();
    }
}
