
public class Main {
    public static void main(String[] args) {
        Roman roman = new RomanToArabianProxy("X");
        System.out.println(roman.getRoman());
        System.out.println(roman.getRoman());


        RomanNumber romanNumber = new RomanNumber("V");
        Number romanToArabianAdapter = new RomanToArabianAdapter(romanNumber);
        System.out.println(romanToArabianAdapter.getNumber());


    }
}
