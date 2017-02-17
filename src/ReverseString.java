import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Admin on 22.01.2017 г..
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> reversed = new ArrayDeque<>();

        for (Character s : input.toCharArray()) {
            reversed.push(s);
        }

        while(!reversed.isEmpty())
            System.out.print(reversed.pop());
        System.out.println();
    }
}
