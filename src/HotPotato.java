import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s++");
        Integer n = scanner.nextInt();

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        while (queue.size()>1) {
            for (int i = 1; i < n; i++) {
                String firstchild = queue.poll();//remove
                queue.offer(firstchild);//add
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
