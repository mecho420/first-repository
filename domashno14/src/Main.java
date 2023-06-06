import java.util.Scanner;

public class Main {

    public static void printMirroredWord(String word) {
//        if (word.equalsIgnoreCase(word.length()-1)) {
//
//        }
    }

    public static void printWordEndingWithYandZ(String words) {
        String[] split = words.split(" ");
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            String last = String.valueOf(split[i].charAt(split[i].length() - 1));
            if (last.equals("z") || last.equals("y")) {
                count++;
            }
        }
        System.out.print(words + " - " + count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String word = scan.next();

        System.out.print("Enter words: ");
        String words = scan.next();
        printWordEndingWithYandZ(words);
    }
}
