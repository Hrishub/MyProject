import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Destination {
    private String name;
    private String description;

    public Destination(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class Trip {
    private String travelerName;
    private List<Destination> destinations;
    private List<String> itemsToPack;

    public Trip(String travelerName) {
        this.travelerName = travelerName;
        this.destinations = new ArrayList<>();
        this.itemsToPack = new ArrayList<>();
        initializeDestinations();
    }

    private void initializeDestinations() {
        destinations.add(new Destination("Goa", "A beautiful beach destination."));
        destinations.add(new Destination("Mussourie", "A lovely hill station."));
        destinations.add(new Destination("Ooty", "A picturesque hill station in the Nilgiris."));
    }

    public void displayDestinations() {
        System.out.println("Choose your destination:");
        for (int i = 0; i < destinations.size(); i++) {
            System.out.printf("%d. %s - %s%n", i + 1, destinations.get(i).getName(), destinations.get(i).getDescription());
        }
    }

    public void selectDestination(int choice) {
        if (choice > 0 && choice <= destinations.size()) {
            System.out.printf("Great choice! You selected %s.%n", destinations.get(choice - 1).getName());
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void packItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many items do you want to pack? ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String item = scanner.nextLine();
            itemsToPack.add(item);
        }

        System.out.println("Items packed: " + itemsToPack);
    }

    public void displaySummary() {
        System.out.println("Traveler: " + travelerName);
        System.out.println("Items to pack: " + itemsToPack);
    }
}

public class TripPlanningApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String travelerName = scanner.nextLine();
        Trip trip = new Trip(travelerName);

        trip.displayDestinations();
        System.out.print("Select your destination (enter the number): ");
        int destinationChoice = scanner.nextInt();
        trip.selectDestination(destinationChoice);
        trip.packItems();
        trip.displaySummary();

        scanner.close();
    }
}
