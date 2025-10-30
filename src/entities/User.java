package entities;

public class User {

    private int userId;
    private String userName;
    private  String userSurname;
    private String userEmail;
    private String userPhone;
    private Address userAddress;

    public User(int userId, String userName, String userSurname, String userEmail, String userPhone, Address userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }
}
