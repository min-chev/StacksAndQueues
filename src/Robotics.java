import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotsLine = scanner.nextLine().split(";");
        String[] robots = new String[robotsLine.length];
        Integer[] times = new Integer[robotsLine.length];

        int[] robotscounter = new int[robotsLine.length];

        for (int i = 0; i < robotsLine.length; i++) {
            String[] robotsToken = robotsLine[i].split("-");
            robots[i] = robotsToken[0];
            times[i] = Integer.parseInt(robotsToken[1]);
        }


        String[] startTime = scanner.nextLine().split(":");
        long currentSeconds = Integer.parseInt(startTime[0]) * 60 * 60 + Integer.parseInt(startTime[1]) * 60 + Integer.parseInt(startTime[2]);

        String product = scanner.nextLine();

        ArrayDeque<String> products = new ArrayDeque<>();
        while (!product.equals("End")) {
            products.add(product);
            product = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            currentSeconds++;

            for (int i = 0; i < robots.length; i++) {
                if (robotscounter[i] > 0) {
                    robotscounter[i]--;
                }
            }

            String currentProduct = products.poll();
            Boolean isTaken = false;

            for (int i = 0; i < robots.length; i++) {
                if (robotscounter[i] == 0) {
                    robotscounter[i] = times[i];
                    isTaken = true;
                    System.out.printf("%s - %s %s", robots[i], currentProduct, getCurrentTime(currentSeconds));
                    break;
                }
            }
            if (!isTaken) {
                products.offer(currentProduct);
            }


        }
    }

    private static String getCurrentTime(long currentSeconds) {
        long hours = ((int) (currentSeconds / 3600)) % 24;
        long remainder = currentSeconds % 3600;
        long minutes = remainder / 60;
        long seconds = remainder % 60;

        return String.format("[%02d:%02d:%02d]%n", hours, minutes, seconds);
    }

}