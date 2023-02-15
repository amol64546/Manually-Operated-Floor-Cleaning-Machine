import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManuallyOperatedFloorCleaningMachine machine = new ManuallyOperatedFloorCleaningMachine();



        Scanner sc = new Scanner(System.in);
        int input;

        do{
            System.out.println("Enter push or pull to move machine");
            String action = sc.next();
            System.out.println("Enter on or off to switch valve");
            String valve = sc.next();

            machine.start(action);
            machine.toggleTapValve(valve);


            System.out.println("Press 1 to change direction or 0 to stop machine");
            input = sc.nextInt();
        }while(input!=0);

        machine.stop();
        machine.toggleTapValve("off");

    }
}