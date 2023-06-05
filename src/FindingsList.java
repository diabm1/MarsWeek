import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() {
        try {
            // Loading Time
            System.out.println("Loading fossil data...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Storing fossils in a HashMap
        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish", "The fossil is vaguely fish-shaped implying there was once water");
        fossils.put("Tooth", "The tooth from an unknown fossil");

        // Print confirmation message
        System.out.println("Fossil data downloaded");

        // Fossil information
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth):");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        // Supplies brought
        System.out.println("Loading special supplies...");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an empty HashSet to store special supplies
        HashSet<String> supplies = new HashSet<>();

        // Add at least 3 super important items
        supplies.add("Portable Oxygen Generator");
        supplies.add("Advanced Communication Device");
        supplies.add("Emergency Medical Kit");

        // Print the contents of the set before expedition
        System.out.println("Supplies Before Expedition:");
        for (String item : supplies) {
            System.out.println(item);
        }

        // Remove one item from the set
        supplies.remove("Emergency Medical Kit");

        // Print the remaining supplies after expedition
        System.out.println("Supplies After Expedition:");
        for (String item : supplies) {
            System.out.println(item);
        }

        // Print information about the chosen fossil
        String description = fossils.get(choice);
        if (description != null) {
            System.out.println("Fossil: " + choice);
            System.out.println("Description: " + description);
        } else {
            System.out.println("Invalid fossil choice.");
        }

        try {
            // Expedition time
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a welcome back message
        System.out.println("Welcome back from the expedition!");

        // Create an array to store the samples
        String[] samples = new String[4];

        // Add rocks into the array
        samples[0] = "rock";
        samples[1] = "weird rock";
        samples[2] = "smooth rock";
        samples[3] = "not rock";

        // Print confirmation and list of rocks
        System.out.println("Everything downloaded successfully.");
        System.out.println("List of rocks:");
        for (String sample : samples) {
            System.out.println(sample);
        }

        // Remove non-rock from the list
        System.out.println("Removing non-rock from the list...");
        for (int i = 0; i < samples.length; i++) {
            if (samples[i].equals("not rock")) {
                samples[i] = null;
                break;
            }
        }

        // Print the updated list of rocks
        System.out.println("Updated list of rocks:");
        for (String sample : samples) {
            if (sample != null) {
                System.out.println(sample);
            }
        }

        // Print "Perfect" message
        System.out.println("Perfect");
    }
}
