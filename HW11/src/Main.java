
public class Main {
    public static void main(String[] args) {
        RomanToArabian romanToArabian = new RomanToArabian();
        romanToArabian.setRoman("V");
        System.out.println(romanToArabian.romanToArabian());

        Converter converter = new Converter();
        converter.setRoman("I");
        System.out.println(converter.convert());

        Roman romanAdapter = new ConverterAdapter(converter);
        romanAdapter.setRoman("V");
        System.out.println(romanAdapter.getRoman());

        Roman romanProxy = new RomanToArabianProxy();
        romanProxy.setRoman("X");
        System.out.println(romanProxy.getRoman());
    }
}
