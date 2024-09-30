import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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
    public static double getTravelTime(VehicleInSpace[] vehicles, int source_x,
                                       int source_y, int dest_x, int dest_y, int passengers, boolean land)
    {
        int x, y;
        double speed, minTimeLand = 1.7976931348623157E308, minTimeSea = 1.7976931348623157E308, dis = sqrt(pow(dest_y - source_y, 2) + pow(dest_x - source_x, 2)), time = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if(vehicles[i] instanceof Hovercraft)
            {
                Hovercraft hovercraft = (Hovercraft) vehicles[i];
                x = hovercraft.getX();
                y = hovercraft.getY();
                speed = hovercraft.getMaxSpeed();
                time = sqrt(pow(dest_y - y, 2) + pow(dest_x - x, 2)) / speed + dis / speed;
                if(time < minTimeSea)
                {
                    minTimeSea = time;
                }
                if(time < minTimeLand)
                {
                    minTimeLand = time;
                }
            }
            else if ( vehicles[i] instanceof Jeep) {
                Jeep jeep = (Jeep) vehicles[i];
                x = jeep.getX();
                y = jeep.getY();
                speed = jeep.getMaxSpeed();
                time = sqrt(pow(dest_y - y, 2) + pow(dest_x - x, 2)) / speed + dis / speed;
                if(time < minTimeLand)
                {
                    minTimeLand = time;
                }
            }
            else {
                Boat boat = (Boat) vehicles[i];
                x = boat.getX();
                y = boat.getY();
                speed = boat.getMaxSpeed();
                time = sqrt(pow(dest_y - y, 2) + pow(dest_x - x, 2)) / speed + dis / speed;
                if(time < minTimeSea)
                {
                    minTimeSea = time;
                }
            }

        }
        return land ? minTimeLand : minTimeSea;
    }


}
