import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.*;

public class SortText {

    String currentLine;

    public void readFile() throws IOException {
//        File file = new File("VoinaIMir.txt");
//        System.out.println(file.getCanonicalPath());
        String filePath = "HW7/src/VoinaIMir.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath, Charset.forName("UTF-8")));
        while ((currentLine = reader.readLine()) != null) {
            System.out.println(currentLine);
        }
    }

    public void longestAndShortestWord() throws IOException {
        String longest = "";
        String shortest = "";
        int wordLengthMin = 1;
        int wordLengthMax = 5;
        List<String> words = new ArrayList<>();
        HashMap<String , Integer> allWords = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\HW7\\src\\VoinaIMir.txt", Charset.forName("UTF-8")));
        while ((currentLine = reader.readLine()) != null) {
            List<String> textLine = new ArrayList<String>(Arrays.asList(currentLine.split("[^a-zA-Zа-яА-Я]")));
            for (int i = 0 ; i < textLine.size() ; i++) {
                words.add(textLine.get(i));
            }
        }
        for (int i = 0 ; i < words.size() ; i++) {
            if (words.get(i).length() != 0) {
                if(!allWords.containsKey(words.get(i))) {
                    String currentWord = words.get(i).toLowerCase(Locale.ROOT);
                    allWords.put(currentWord , 1);
                } else {
                    String currentWord = words.get(i).toLowerCase(Locale.ROOT);
                    int oldCount = allWords.get(currentWord);
                    int newCount = oldCount + 1;
                    allWords.put(currentWord , newCount);
                }
            }
        }
        for (String string : words) {
            if (string.length() > longest.length()) {
                longest = string;
            } else if (string.length() >= wordLengthMin && string.length() <= wordLengthMax) {
                wordLengthMax = string.length();
                shortest = string;
            }
        }
        List<String> listOfLongest = new ArrayList<String>();
        List<String> listOfShortest = new ArrayList<String>();
        for (String string : words) {
            if (string.length() == longest.length()) {
                    listOfLongest.add(string);
            } else if (string.length() == shortest.length()) {
                    listOfShortest.add(string);
            }
        }
        Collator collator = Collator.getInstance(new Locale("ru", "RU"));
        Collections.sort(listOfLongest, collator);
        Collections.reverse(listOfLongest);
        System.out.println("Cамое длинное слово: " + listOfLongest.get(0) + ". Повторяется " + allWords.get(listOfLongest.get(0)) + " раз.");
        Collections.sort(listOfShortest, collator);
        System.out.println("Cамое короткое слово: " + listOfShortest.get(0) + ". Повторяется " + allWords.get(listOfShortest.get(0)) + " раз.");
    }
}





