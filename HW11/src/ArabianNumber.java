public class ArabianNumber implements Number {
    private int number;

    public ArabianNumber(int number){
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
