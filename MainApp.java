import controller.ApiController;
import java.util.Scanner;

// main class
public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ApiController controller = new ApiController();

        int choice;

        do {
            System.out.println("\n--- REST API CLIENT ---");
            System.out.println("1. Fetch Age Data");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    controller.fetchData();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 2);
    }
}
