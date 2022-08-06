import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.*;

public class SortText {

    String currentLine;

    public void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D://Java//VoinaIMir.txt", Charset.forName("UTF-8")));
        while ((currentLine = reader.readLine()) != null) {
            System.out.println(currentLine);
        }
    }

    public void longest() throws IOException {
        String longest = "";
        int wordLength = 0;
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader("D://Java//VoinaIMir.txt", Charset.forName("UTF-8")));
        while ((currentLine = reader.readLine()) != null) {
            List<String> textLine = new ArrayList<String>(Arrays.asList(currentLine.split("[^абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ]")));

            for (String string : textLine) {
                if (string.length() > wordLength) {
                    wordLength = string.length();
                    longest = string;
                }
            }
        }
        List<String> listOfLongest = new ArrayList<String>();
        BufferedReader reader2 = new BufferedReader(new FileReader("D://Java//VoinaIMir.txt", Charset.forName("UTF-8")));
        while ((currentLine = reader2.readLine()) != null) {
            List<String> textLine = new ArrayList<String>(Arrays.asList(currentLine.split("[^абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ]")));

            for (String string : textLine) {
                if (string.length() == longest.length()) {
                    listOfLongest.add(string);
                    count++;
                }
            }
        }
        Collator collator = Collator.getInstance(new Locale("ru", "RU"));
        Collections.sort(listOfLongest, collator);
        Collections.reverse(listOfLongest);
        System.out.println("Cамое длинное слово: " + listOfLongest.get(0) + ". Повторяется " + count + " раз.");
    }

    public void shortest() throws IOException {
        String shortest = "";
        int wordLength = 3;
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader("D://Java//VoinaIMir.txt", Charset.forName("UTF-8")));
        while ((currentLine = reader.readLine()) != null) {
            List<String> textLine = new ArrayList<String>(Arrays.asList(currentLine.split("[^абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ]")));

            for (String string : textLine) {
                if (string.length() >= 1 && string.length() <= wordLength) {
                    wordLength = string.length();
                    shortest = string;
                }
            }
        }
        List<String> listOfShortest = new ArrayList<String>();
        BufferedReader reader2 = new BufferedReader(new FileReader("D://Java//VoinaIMir.txt", Charset.forName("UTF-8")));
        while ((currentLine = reader2.readLine()) != null) {
            List<String> textLine = new ArrayList<String>(Arrays.asList(currentLine.split("[^абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ]")));

            for (String string : textLine) {
                if (string.length() == shortest.length()) {
                    listOfShortest.add(string);
                    count++;
                }
            }
        }
        Collator collator = Collator.getInstance(new Locale("ru", "RU"));
        Collections.sort(listOfShortest, collator);
        System.out.println("Cамое короткое слово: " + listOfShortest.get(0) + ". Повторяется " + count + " раз.");
    }
}





