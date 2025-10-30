package app;

import entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Address[] addresses = new Address[5];

        for (int i = 0; i < addresses.length; i++) {
            System.out.println("Enter details for address " + (i + 1) + ":");

            System.out.print("Address ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Street: ");
            String street = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("ZIP Code: ");
            String zipCode = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("House number: ");
            int houseNumber = scanner.nextInt();
            scanner.nextLine();

            addresses[i] = new Address(id, street, city, zipCode, state, houseNumber);
        }

        for (Address address : addresses) {
            System.out.println(
                    "ID: " + address.getAddressId() +
                            ", " + address.getStreet() + " " + address.getHouseNumber() +
                            ", " + address.getCity() + ", " + address.getState() +
                            " " + address.getZipCode()
            );
        }

        User[] users = new User[5];

        for (int i = 0; i < users.length; i++) {
            System.out.println("Enter details for user " + (i + 1) + ":");

            System.out.print("User ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("First name: ");
            String name = scanner.nextLine();

            System.out.print("Surname: ");
            String surname = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();


            users[i] = new User(id, name, surname, email, phone, addresses[1]);

        }

        for (User user : users) {
            Address a = user.getUserAddress();
            System.out.println(
                    "ID: " + user.getUserId() +
                            ", Name: " + user.getUserName() + " " + user.getUserSurname() +
                            ", Email: " + user.getUserEmail() +
                            ", Phone: " + user.getUserPhone() +
                            ", Address: " + a.getStreet() + " " + a.getHouseNumber() + ", " +
                            a.getCity() + ", " + a.getState() + " " + a.getZipCode()
            );
        }

        MenuItem[] menuItems = new MenuItem[5];
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println("Enter details for menu item " + (i + 1) + ":");

            System.out.print("Item ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Item name: ");
            String name = scanner.nextLine();

            System.out.print("Item description: ");
            String description = scanner.nextLine();

            System.out.print("Item price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            menuItems[i] = new MenuItem(id, name, description, price);
        }

        Restaurant[] restaurants = new Restaurant[5];
        for (int i = 0; i < restaurants.length; i++) {
            System.out.println("Enter details for restaurant " + (i + 1) + ":");
            System.out.print("Restaurant ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Restaurant name: ");
            String name = scanner.nextLine();

            restaurants[i] = new Restaurant(id, name, addresses[2], menuItems);


        }

        for (Restaurant r : restaurants) {
            Address a = r.getRestaurantAddress();
            System.out.println(
                    "ID: " + r.getRestaurantId() +
                            ", Name: " + r.getRestaurantName() +
                            ", Address: " + a.getStreet() + " " + a.getHouseNumber() + ", " +
                            a.getCity() + ", " + a.getState() + " " + a.getZipCode()
            );
        }

        Order[] orders = new Order[5];
        for (int i = 0; i < orders.length; i++) {

            System.out.println("Enter details for order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            int orderId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Customer ID: ");
            int customerId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Restaurant id: ");
            int restaurantId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Price");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Order time ");
            int orderTime = scanner.nextInt();
            scanner.nextLine();

            orders[i] = new Order(orderId,customerId, restaurantId, menuItems, price, orderTime);

        }

    }
}