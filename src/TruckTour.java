import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Deque<Pump> pumps = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] inp = scanner.nextLine().split(" ");
            int petrol = Integer.parseInt(inp[0]);
            int distanceNext = Integer.parseInt(inp[1]);

            Pump pump = new Pump(petrol, distanceNext);

            pumps.addLast(pump);

        }

        int resultIndex = 0;
        boolean solutionFound = false;

        while (true) {
            Pump startStation = pumps.removeFirst();
            pumps.addLast(startStation);

            int petrol = startStation.petrol;
            petrol -= startStation.distanceNext;
            int currentStationsCount = 1;
            while (petrol >= 0) {
                Pump currentStation = pumps.removeFirst();
                if (currentStation == startStation) {
                    solutionFound = true;
                    break;
                }

                pumps.addLast(currentStation);
                petrol += currentStation.petrol;
                petrol -= currentStation.distanceNext;
                currentStationsCount++;
            }

            if (solutionFound) {
                break;
            }

            resultIndex += currentStationsCount;
        }

        System.out.println(resultIndex);
    }


    private static class Pump {
        Integer petrol;

        Integer distanceNext;


        private Pump(Integer petrol, Integer distanceNext) {
            this.petrol = petrol;
            this.distanceNext = distanceNext;

        }

    }


}
