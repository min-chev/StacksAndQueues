import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s++");

        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, tokens);

        while(stack.size() > 2){
            Integer first = Integer.valueOf(stack.pop());
            String operator = stack.pop();
            Integer second = Integer.valueOf(stack.pop());
            Integer result = 0;
            if (operator.equals("+")){
                stack.push(String.valueOf(first+second));
            }else if (operator.equals("-")){
                stack.push(String.valueOf(first-second));
            }
        }
        System.out.println(stack.getFirst());
    }
}
