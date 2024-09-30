import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {
        Vehicle [] vehicles = getVehicleFromUser();
        writeVehiclesToFile(args[0], vehicles);
        writeVehiclesSummaryToFile(args[1], vehicles);
    }

    public static Vehicle[] getVehicleFromUser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many vehicles do you want?");
        Vehicle [] vehicles = new Vehicle[sc.nextInt()];
        System.out.println("what vehicle do you want? for JEEP write 'jeep' for Boat write 'boat' for HoverCraft write 'hovercraft' AND 'X' to exit");
        String str = sc.nextLine(), name;
        int speed, passengers, numOfWheels, i = 0, x, y;
        while(!str.equalsIgnoreCase("X") && i < vehicles.length) {
            if (str.equalsIgnoreCase("boat")) {
                System.out.println("write the name");
                name = sc.nextLine();
                System.out.println("write the speed");
                speed = sc.nextInt();
                System.out.println("write the passengers");
                passengers = sc.nextInt();
                System.out.println("write the x");
                x = sc.nextInt();
                System.out.println("write the y");
                y = sc.nextInt();
                vehicles[i] = new Boat(passengers, name, speed, x, y);
            } else if (str.equalsIgnoreCase("hovercraft") || str.equalsIgnoreCase("jeep")) {
                System.out.println("write the name");
                name = sc.nextLine();
                System.out.println("write the speed");
                speed = sc.nextInt();
                System.out.println("write the passengers");
                passengers = sc.nextInt();
                System.out.println("write the numOfWheels");
                numOfWheels = sc.nextInt();
                System.out.println("write the x");
                x = sc.nextInt();
                System.out.println("write the y");
                y = sc.nextInt();
                if (str.equalsIgnoreCase("hovercraft"))
                    vehicles[i] = new Hovercraft(passengers, name, speed, numOfWheels, x, y);
                else
                    vehicles[i] = new Jeep(passengers, name, speed, numOfWheels, x, y);
            }
            else {
                System.out.println("Unknown command. Please try again.");
                i--;
            }
            i++;
            System.out.println("what vehicle do you want? for JEEP write 'jeep' for Boat write 'boat' for HoverCraft write 'hovercraft' AND 'X' to exit");
            str = sc.nextLine();
        }
        return vehicles;
    }

    public static void writeVehiclesToFile(String outputFilename, Vehicle[] vehicles)
    {
        //TODO
    }

    public static void writeVehiclesSummaryToFile(String outputFilename, Vehicle[] vehicles)
    {
        //TODO
    }

}
