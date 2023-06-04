import java.sql.SQLOutput;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        // Print "bootup" message
        System.out.println("Initializing Mars Expedition...");
        System.out.println("Preparing for launch sequence...");
        System.out.println("Countdown begins in 3...2...1...");
        System.out.println("Ignition! Liftoff!");

        // Ask for the user's name
        System.out.println("Hi, what is your name?");
        String name = input.nextLine();

        // Welcome the user and ask if they're ready to begin
        System.out.println("Welcome, " + name + " to the Expedition prep program. Are you ready to head out into the new World? Type Y or N: ");
        String response = input.nextLine();

        // Check user's response
        if (response.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are a team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        // Ask how many people they want on their team
        System.out.println("How many people do you want on your team? ");
        int teamSize = input.nextInt();

        // Check if team size is greater than 2
        if(teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need at least 2 members.");
            teamSize = 2;
        }

        // Consume the remaining newline character
        input.nextLine();

        // Present the list of vehicles
        System.out.println("Choose a vehicle from the list:");
        System.out.println("A. Mars Rover");
        System.out.println("B. Lunar Lander");
        System.out.println("C. Solar-Powered Buggy");
        System.out.println("D. Rocket-Powered Hovercraft");

        // Ask for the vehicle choice
        System.out.println("Enter the letter of your chosen vehicle: ");
        String vehicleChoice = input.nextLine();

        // Store the vehicle name based on the choice
        String vehicleName;
        switch (vehicleChoice.toUpperCase()){
            case "A":
                vehicleName = "Mars Rover";
                break;
            case "B":
                vehicleName = "Lunar Lander";
                break;
            case "C":
                vehicleName = "Solar-Powered Buggy";
                break;
            case "D":
                vehicleName = "Rocket-Powered Hovercraft";
                break;
            default:
                System.out.println("Invalid vehicle choice. Defaulting to Mars Rover.");
                vehicleName = "Mars Rover";
                break;
        }

        // Ask for the snack choice
        input.nextLine();
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();

        //Confirm the snack choice
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        // Print the final message with user's information
        System.out.println("\nMission Summary:");
        System.out.println("User: " + name);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Snack: " + snack);
        System.out.println("Vehicle: " + vehicleName);

        // Countdown
        System.out.println("\nCountdown to Launch:");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
