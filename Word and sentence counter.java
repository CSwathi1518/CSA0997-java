import java.util.Scanner;
public class WordAndSentenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        int wordCount = countWords(inputText);
        int sentenceCount = countSentences(inputText);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
    }
    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    private static int countSentences(String text) {
         String[] sentences = text.split("[.!?]");
        return sentences.length;
    }
}
