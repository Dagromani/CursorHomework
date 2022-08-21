public class ConverterAdapter implements Roman{

    Converter converter;

    public ConverterAdapter(Converter newConverter) {
        converter = newConverter;
    }
    @Override
    public void setRoman(String roman) {
        converter.setRoman(roman);
    }

    @Override
    public String getRoman() {
        return converter.getRoman();
    }
}
