import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer decimal = scanner.nextInt();

        if (decimal==0){
            System.out.println(0);
        }else{

            ArrayDeque<Integer> mainstack = new ArrayDeque<>();

            while(decimal!=0){

                mainstack.push(decimal%2);
                decimal /= 2;
            }

            while(!mainstack.isEmpty()){
                System.out.print(mainstack.pop());
            }
        }
    }
}
