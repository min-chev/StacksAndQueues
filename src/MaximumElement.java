import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayDeque<Integer> mainstack = new ArrayDeque<>();
        ArrayDeque<Integer> maxnums = new ArrayDeque<>();

        Integer maxvalue = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            byte comm1 = scanner.nextByte();
            if (comm1 == 1) {
                int num = scanner.nextInt();

                if (num > maxvalue) {
                    maxvalue = num;
                    maxnums.push(maxvalue);
                }

                mainstack.push(num);

            } else if (comm1 == 2) {
                int deleted = mainstack.pop();
                if (deleted == maxvalue) {
                    maxnums.pop();
                    if (!maxnums.isEmpty()) {
                        maxvalue = maxnums.peek();
                    }
                    else {
                        maxvalue = Integer.MIN_VALUE;
                    }
                }

            } else if (comm1 == 3) {

                System.out.println(maxnums.peek());

            }


        }
    }

}

