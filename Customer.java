import java.util.ArrayList;

public class Customer {

    private static int originalId = 1;
    private int id;
    private String fName;
    private String Lname;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private int discount;
    private ArrayList<Item> favoriteItems;
    private Giftable gift;

    public Customer(String fName, String lname, String email,
                    String deliveryAddress, CustomerType customerType, int discount, ArrayList<Item> favoriteItems,
                    Giftable gift) {

        this.id = originalId++;
        this.fName = fName;
        Lname = lname;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.discount = discount;
        this.favoriteItems = favoriteItems;
        this.gift = gift;
    }

    public static int getOriginalId() {
        return originalId;
    }

    public static void setOriginalId(int originalId) {
        Customer.originalId = originalId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return Lname;
    }

    public int getId() {
        return id;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<Item> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(ArrayList<Item> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public void addFavItems(Item item) {
        if (!favoriteItems.contains(item)) {
            favoriteItems.add(item);
        }
    }

    public void removeFavItem(Item item) {
        if (favoriteItems.contains(item)) {
            favoriteItems.remove(item);
        }
    }

    public void takeGift(Giftable gift) {
        this.gift = gift;
    }

    public void openGift() {
        this.gift.openGift();
    }
}
