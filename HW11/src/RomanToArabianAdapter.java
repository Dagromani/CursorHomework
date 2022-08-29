public class RomanToArabianAdapter implements Number {

    RomanNumber romanNumber;
    private String roman;

    public RomanToArabianAdapter(RomanNumber romanNumber) {
        this.romanNumber = romanNumber;
        this.roman = romanNumber.getRoman();
    }

    public int romanToArabian() {
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
    public int getNumber() {
        return romanToArabian();
    }
}
