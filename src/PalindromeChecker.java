import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (char c : input) {
queue.add(c);
        }

        boolean isPalindrome = true;


        while (queue.size() > 1) {
            char first = queue.poll();
            char last = queue.pollLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
