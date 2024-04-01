import java.util.Arrays;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class myStream {
    public static int largestEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
    }

    public static int countNegatives(int[] numbers) {
        return (int) Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .count();
    }

    public static void printDoubled(int[] numbers) {
        Arrays.stream(numbers)
                .map(n -> n * 2).forEach(System.out::println);
    }

    public static String pigLatin(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> {
                    if (!word.isEmpty() && word.matches("[a-zA-Z]+")) {
                        return word.substring(1) + "-" + word.charAt(0) + "ay";
                    } else {
                        return word;
                    }
                })
                .collect(Collectors.joining(" "));
    }

    public static int fourLetterWords(String fileName) {
        try {
            return (int) Files.lines(Paths.get(fileName))
                    .filter(line -> line.trim().length() == 4)
                    .distinct()
                    .count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {

        // Q.4
        System.out.println("Question number 4");
        int[] nnnb = { 5, -1, 12, 10, 29, 2, 8 };
        System.out.println(largestEven(nnnb));

        // Q.5
        System.out.println("Question number 5");
        int[] countNegative = { 5, -1, -3, 12, -10, 29, -8, -4, 2, 8 };
        System.out.println(countNegative.length);

        // Q.6
        System.out.println("Question number 6");
        int[] printDouble = { 2, -1, 4, 16 };
        printDoubled(printDouble);

        // Q.7
        String inputOne = "Hello Students of AASTU";
        String pigLatinString = pigLatin(inputOne);
        System.out.println(pigLatinString);

        // Q.8
        System.out.println("Question number 8");
        int countFourLetterWords = fourLetterWords("file.txt");
        System.out.println(countFourLetterWords);

        // Example
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        // System.out.println(sum);

        // // Q.4
        // List<Integer> numbersTwo = Arrays.asList(5, -1, 12, 10, 29, 2, 8);
        // int sumTwo = numbersTwo.stream().filter(n -> n % 2 == 0).max(Integer::compareTo).orElse(0);
        // System.out.println(sumTwo);

        // // Q.5
        // List<Integer> countNegatives = Arrays.asList(5, -1, -3, 12, -10, 29, -8, -4, 2, 8);
        // int countOutput = (int) countNegatives.stream().filter(n -> n < 0).mapToInt(n -> n).count();
        // System.out.println(countOutput);

        // // Q.6
        // List<Integer> printDoubled = Arrays.asList(2, -1, 4, 16);
        // printDoubled.stream().map(n -> n * 2).forEach(System.out::println);

        // // Q.7
        // String input = "Hello Students of AASTU";
        // String pigLatin = Arrays.stream(input.split(" "))
        //         .map(word -> word.substring(1) + "-" + word.charAt(0) + "ay")
        //         .collect(Collectors.joining(" "));
        // System.out.println(pigLatin);

        
    }

    
}
