public class Main {
    public static void main(String[] args) {
        String colonyName = "MyMarsColony";
        int shipPopulation = 3000;
        double meals = 4000.00;
        boolean landing = true;

        //Calculate meals left after landing
        meals -= (2 * 0.75 * shipPopulation);

        //Print the number of meals left
        System.out.println("Meals left after landing: " + meals);

        //Increase meals by 50%
        meals *= 1.5;

        // Print the updated number of meals
        System.out.println("Updated number of meals: " + meals);

        // Update shipPopulation with new births
        shipPopulation += 5;

        // Choose the landing location
        String landingLocation = "The Plain";

        // Check if the landingLocation is "The Plain" (ignoring case)
        if(landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        // Run the MarsExpedition
        MarsExpedition expedition = new MarsExpedition();

        // Run the GuessingGame
        GuessingGame guessingGame = new GuessingGame();

        // Reassign the value of landing by invoking landingCheck method
        landing = landingCheck(10); // Replace 10 with any desired number of minutes until landing
    }

    public static boolean landingCheck(int minutesLeft){
        for(int minute = 0; minute < minutesLeft; minute++){
            if(minute % 2 == 0){
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else if (minute % 3 == 0 && minute % 2 == 0) {
                System.out.println("Keep Center");
            } else {
                System.out.println("Calculating");
            }

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Landed");
        return false;
    }
}