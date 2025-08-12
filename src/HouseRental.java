import java.util.*;

class HouseRental {
    Scanner sc = new Scanner(System.in);
    List<House> houses = new ArrayList<>();
    Map<String, House> myhouse = new HashMap<>();
    Map<String, House> map = new HashMap<>();
    List<User> users = new ArrayList<>();

    int idcounter = 1;
    int uidcounter = 1;

    public void listMyHouse() {
        String houseId = "H" + idcounter++;
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the location: ");
        String location = sc.nextLine();
        System.out.print("Enter the rent amount: ");
        int rent = sc.nextInt();
        sc.nextLine();

        House house = new House(houseId, name, location, rent);
        houses.add(house);
        myhouse.put(houseId, house);
        map.put(houseId, house);

        System.out.println("House listed successfully: " + house);
    }

    public void myListedHouse(String id) {
        if (myhouse.containsKey(id)) {
            System.out.println("Your listed house: " + myhouse.get(id));
        } else {
            System.out.println("No house found with ID: " + id);
        }
    }

    public void viewAvailableHouse() {
        boolean available = false;
        for (House house : houses) {
            if (!house.isRented) {
                System.out.print(house);
                available = true;
            }
        }
        if (!available) {
            System.out.println("No available houses currently.");
        }
    }

    public void rentAHouse() {
        String userId = "U" + uidcounter++;
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        viewAvailableHouse();
        System.out.print("Enter the house ID you want to rent: ");
        String houseId = sc.nextLine();

        if (map.containsKey(houseId)) {
            House house = map.get(houseId);
            if (!house.isRented) {
                house.isRented = true;
                User user = new User(userId, name, houseId, house.location);
                users.add(user);
                System.out.println("House rented successfully!\n" + user);
            } else {
                System.out.println("Sorry, this house is already rented.");
            }
        } else {
            System.out.println("Invalid house ID.");
        }
    }
}
