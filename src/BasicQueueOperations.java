import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class BasicQueueOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1st string
        String[] nums0 = scanner.nextLine().split(" ");

        int push = Integer.valueOf(nums0[0]);
        int pop = Integer.valueOf(nums0[1]);
        int check = Integer.valueOf(nums0[2]);

        //2nd string
        String[] nums = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (push > 0) {
            for (String num : nums) {

                stack.offer(Integer.valueOf(num));

                push--;
            }

        }

        while (pop > 0) {
            stack.poll();
            pop--;
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            boolean istrue = false;
            for (Integer integer : stack) {
                if (integer == check) {
                    istrue = true;
                }
            }

            if (istrue) {
                System.out.println(istrue);
            } else {
                int minelement = stack.peek();
                for (Integer integer : stack) {

                    if (integer<minelement) {
                        minelement = integer;
                    }
                }

                System.out.println(minelement);

            }


        }

    }


}
