import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Integer> mainstack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == '('){
                mainstack.push(i);
            }else if(ch == ')'){
                int startIndex = mainstack.pop();
                System.out.println(input.substring(startIndex,i+1));
            }

        }


    }
}
