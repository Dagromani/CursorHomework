import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1to6 {
    public static void main(String[] args) {
        //Task1
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0 ; i < 10 ; i++) {
            int newRand = rand.nextInt(1000);
            list.add(newRand);
        }
        System.out.println(list);
        int sum = (int) list.stream()
                .filter(l -> l % 2 == 0)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
        System.out.println("");

        //Task2
        int count = (int) list.stream()
                .filter(l -> l % 2 != 0)
                .count();
        System.out.println(count);
        System.out.println("");

        //Task3
        List<String> strings = new ArrayList<>();
        strings.add("asdfadd");
        strings.add("qwertyu");
        strings.add("zxc");
        strings.add("asdagh");
        strings.add("van");
        strings.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out :: println);
        System.out.println("");

        //Task4
        strings.stream()
                .filter(s -> s.contains("a"))
                .forEach(System.out :: println);
        System.out.println("");

        //Task5
        List<String> sortString = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortString);
        System.out.println("");

        //Task6
        char aa = 'a';
        int a = (int) strings.stream()
                .filter(s -> s.contains("a"))
                        .collect(Collectors.joining())
                                .chars()
                .filter(c -> c == aa)
                        .count();
        System.out.println(a);
    }
}
