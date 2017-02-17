import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String num : nums) {
            stack.push(Integer.parseInt(num));
        }


        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
