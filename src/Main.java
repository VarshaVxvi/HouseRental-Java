import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HouseRental app = new HouseRental();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- House Rental Menu ---");
            System.out.println("1. List My House (Owner)");
            System.out.println("2. View My Listed House");
            System.out.println("3. View Available Houses");
            System.out.println("4. Rent a House (Tenant)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> app.listMyHouse();
                case 2 -> {
                    System.out.print("Enter your house ID: ");
                    String id = sc.nextLine();
                    app.myListedHouse(id);
                }
                case 3 -> app.viewAvailableHouse();
                case 4 -> app.rentAHouse();
                case 5 -> {
                    System.out.println("Thanks for using House Rental App!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
