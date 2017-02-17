import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        ArrayDeque<Character> openBraces = new ArrayDeque<>();

        boolean isEqual = false;

        if(input.length%2!=0){
            System.out.println("NO");
            return;
        }

        for (char c : input) {
            if(c=='(' || c=='{' || c=='['  ){
                openBraces.add(c);
            }
            else if( c==']' || c=='}' || c==')'){

                char currentBrace = openBraces.pop();

                if(currentBrace == '(' && c == ')'){
                        isEqual = true;
                }
                if(currentBrace == '{' && c == '}'){
                    isEqual = true;

                }
                if(currentBrace == '[' && c == ']'){
                    isEqual = true;

                }
            }
        }




        if(isEqual){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

