public class Main {
    public static void main(String[] args) {
        //Task1
        Task1 maxInt = (x , y) -> {
            if (x > y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        };
        maxInt.maxOfTwo(1 , 5);
        System.out.println("");

        //Task2
        Task2 string = ((s0, s1, s2, s3, s4, s5, s6) -> System.out.println((s0 + s1 + s2 + s3 + s4 + s5 + s6).toUpperCase()));
        string.stringUnion("hello " , "my name " , "is " , "niko " , "i " , "like " , "books");
        System.out.println("");

        //Task3
        Task3 range = (x , y) -> {
            int prod = 1;
            while (x <= y) {
                prod = prod * x;
                x++;
            }
            System.out.println(prod);
        };
        range.rangeProduction(3 , 6);
        System.out.println("");

        //Task4
        Task4 prime = x -> {
            int i = 2;
            boolean b = false;
            while (i < x) {
                if (x % i == 0) {
                    b = false;
                    i ++;
                    break;
                } else {
                    b = true;
                    i++;
                }
            }
            return b;
        };
        System.out.println(prime.IsNumberPrime(5));
        System.out.println(prime.IsNumberPrime(6));
        System.out.println(prime.IsNumberPrime(9));
        System.out.println(prime.IsNumberPrime(37));
        System.out.println(prime.IsNumberPrime(57));
        System.out.println("");

        //Task5
        Task5 fact = x -> {
            int i = 1;
            int factorial = 1;
            while (x >= i) {
                factorial = factorial * i;
                i++;
            }
            System.out.println(factorial);
        };
        fact.factorial(4);
        fact.factorial(6);
    }
}
