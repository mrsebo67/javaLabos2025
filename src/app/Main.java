package app;

import entities.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Runs the whole project
 */
public class Main {

    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(Main.class);


        Scanner scanner = new Scanner(System.in);
        Address[] addresses = new Address[5];

        for (int i = 0; i < addresses.length; i++) {
            System.out.println("Enter details for address " + (i + 1) + ":");

            try {
                System.out.print("Address ID: ");
                int id = 0;
                try {
                    id = scanner.nextInt();
                } catch (InputMismatchException e) {
                    logger.error("Address ID must be a valid number!");
                    throw new WrongNumberFormatException(id);

                }
                scanner.nextLine(); // clear buffer

                System.out.print("Street: ");
                String street = scanner.nextLine().trim();
                if (street.matches("\\d+")) {
                    logger.error("Street cannot contain only numbers!");
                    throw new NumbersInStringException("Street cannot contain numbers!");

                }

                System.out.print("City: ");
                String city = scanner.nextLine().trim();
                if (city.matches("\\d+")) {
                    logger.error("Wrong city format!");
                    throw new NumbersInStringException("City cannot contain numbers!");

                }

                System.out.print("ZIP Code: ");
                int zipCode = 0;
                try {
                    zipCode = scanner.nextInt();
                } catch (InputMismatchException e) {
                    logger.error("Wrong zip code!");
                    throw new WrongNumberFormatException(zipCode);

                }
                scanner.nextLine(); // clear buffer

                System.out.print("State: ");
                String state = scanner.nextLine().trim();
                if (state.matches("\\d+")) {
                    logger.error("Wrong state!");
                    throw new NumbersInStringException("State cannot contain numbers!");

                }

                System.out.print("House number: ");
                int houseNumber = 0;
                try {
                    houseNumber = scanner.nextInt();
                } catch (InputMismatchException e) {
                    logger.error("Wrong house number!");
                    throw new WrongNumberFormatException(houseNumber);

                }
                scanner.nextLine(); // clear buffer

                addresses[i] = new Address(id, street, city, zipCode, state, houseNumber);
                System.out.println(" Address saved successfully!\n");
                logger.info("Added new address");

            } catch (NegativeIdException | NumbersInStringException e) {
                System.out.println(" Input error: " + e.getMessage());
                i--;
                scanner.nextLine();
            }
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

            try {
                System.out.print("User ID: ");
                int id = 0;
                try {
                    id = scanner.nextInt();
                    if (id < 0) {
                        throw new NegativeIdException(id);
                    }
                } catch (InputMismatchException e) {
                    logger.error("Wrong user ID!");
                    throw new WrongNumberFormatException(id);

                }
                scanner.nextLine();

                System.out.print("First name: ");
                String name = scanner.nextLine();

                System.out.print("Surname: ");
                String surname = scanner.nextLine();

                System.out.print("Email: ");
                String email = scanner.nextLine();
                if (!email.contains("@")) {
                    logger.error("Invalid email!");
                    throw new WrongEmailException("Email must contain '@'!");

                }

                System.out.print("Phone: ");
                String phone = scanner.nextLine();

                users[i] = new User(id, name, surname, email, phone, addresses[0]);
                System.out.println(" User saved successfully!\n");
                logger.info("Added new user");

            } catch (WrongEmailException | WrongNumberFormatException e) {
                System.out.println(" Input error: " + e.getMessage());
                i--;
                scanner.nextLine();
            }
        }
        for (User user : users) {
            Address a = user.userAddress();
            System.out.println(
                    "ID: " + user.userId() +
                            ", Name: " + user.userName() + " " + user.userSurname() +
                            ", Email: " + user.userEmail() +
                            ", Phone: " + user.userPhone() +
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

            menuItems[i] = new Food(id, name, description, price, 100, 100);
            logger.info("Added menu item");
        }

        for (MenuItem menuItem : menuItems) {
            System.out.println(
                   "ID: " + menuItem.getMenuItemId() +
                           " Item name: " + menuItem.getMenuItemName() +
                           " Item description: " + menuItem.getMenuItemDescription() +
                           " Item price: " + menuItem.getMenuItemPrice()
            );
        }

        Restaurant[] restaurants = new Restaurant[5];
        for (int i = 0; i < restaurants.length; i++) {
            System.out.println("Enter details for restaurant " + (i + 1) + ":");
            System.out.print("Restaurant ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Restaurant name: ");
            String name = scanner.nextLine();

            restaurants[i] = new Restaurant.Builder()
                    .restaurantId(id)
                    .restaurantName(name)
                    .restaurantAddress(addresses[2])
                    .menuItems(menuItems)
                    .build();


            logger.info("Added new restaurant");
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
            logger.info("Added new order");

        }

        for (Order order : orders) {
            System.out.println(
                   "Order ID: " + order.getOrderId() +
                           " Customer ID: " + order.getCustomerId() +
                           " Restaurant ID:  " + order.getRestaurantId() +
                           " Order time: " + order.getOrderTime()

            );
        }

    }
}