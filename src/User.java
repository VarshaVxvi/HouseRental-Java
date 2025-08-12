public class User {
    String userId;
    String userName;
    String houseId;
    String location;

    public User(String userId, String userName, String houseId, String location) {
        this.userId = userId;
        this.userName = userName;
        this.houseId = houseId;
        this.location = location;
    }

    @Override
    public String toString() {
        return "User ID: " + userId +
                ", Name: " + userName +
                ", Rented House ID: " + houseId +
                ", Location: " + location + "\n";
    }
}
