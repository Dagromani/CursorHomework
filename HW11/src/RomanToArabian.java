public class RomanToArabian implements Roman {

    private String roman;

    public RomanToArabian(String roman) {
        this.roman = roman;
        System.out.println(getArabian());
    }

    public int romanToArabian(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("X")) {
            return 10;
        } else if (roman.equals("L")) {
            return 50;
        } else if (roman.equals("C")) {
            return 100;
        } else if (roman.equals("D")) {
            return 500;
        } else if (roman.equals("M")) {
            return 1000;
        }
        return 0;
    }

    @Override
    public void setRoman(String rom) {
        roman = rom;
    }

    @Override
    public String getRoman() {
        return roman;
    }

    @Override
    public int getArabian() {
        return romanToArabian(roman);
    }
}
