package Task2;

public class Main {
    public static void main(String[] args) {
        MyList listInteger = new MyList<Integer>();
        listInteger.add(5);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(0);
        listInteger.add(-1);
        listInteger.add(-2);
        for (int i = 0 ; i < listInteger.arrayList.size() ; i++) {
            System.out.println(listInteger.arrayList.get(i));
        }

        MyList listStrings = new MyList<String>();
        listStrings.add("What is your plans for today?");
        listStrings.add("How are you?");
        listStrings.add("Hello!");

        for (int i = 0 ; i < listStrings.arrayList.size() ; i++) {
            System.out.println(listStrings.arrayList.get(i));
        }



    }
}
