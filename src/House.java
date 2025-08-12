public class House {
    String houseId;
    String ownerName;
    String location;
    int rent;
    boolean isRented;


    public House(String houseId, String ownerName, String location, int rent) {
        this.houseId = houseId;
        this.ownerName = ownerName;
        this.location = location;
        this.rent = rent;
        this.isRented = false;
    }
    public void setRented(boolean value){
        this.isRented=value;
    }

    @Override
    public String toString() {
        return "[House ID: " + houseId +
                ", Owner: " + ownerName +
                ", Location: " + location +
                ", Rent: ₹" + rent +
                ", Rented: " + isRented + "]\n";
    }
}
