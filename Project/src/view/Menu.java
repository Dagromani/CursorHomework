package view;

import dao.BlockedUsers;
import dao.UsersDB;
import services.BlockUnblockUser;
import services.Order;
import services.Validation;

import java.util.Scanner;

public class Menu {

    private Validation validation = new Validation();
    private Order order = new Order();
    private BlockedUsers blockedUsers = new BlockedUsers();
    private BlockUnblockUser blockUnblockUser = new BlockUnblockUser();


    public void loginMenu() {
        System.out.println("Choose how to login:");
        System.out.println("1.Login as user.");
        System.out.println("2.Register new user.");
        System.out.println("3.Login as admin.");
        System.out.println("4.Exit");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if (var == 1) {
            if (validation.loginAsUser() == true) {
                System.out.println("Login successful!");
                userMenu();
            } else {
                System.out.println("Invalid name or password!Try again.");
                loginMenu();
            }
        } else if (var == 2) {
            validation.registerNewUser();
            System.out.println("Now you can login with your name and password.");
            loginMenu();
        } else if (var == 3) {
            if (validation.loginAsAdmin() == true) {
                adminMenu();
            } else {
                System.out.println("Invalid name or password!Try again.");
                loginMenu();
            }
        } else if (var == 4) {
            System.out.println("Good bye!");
        } else  {
            System.out.println("There is no choice on this position , choose between 1 to 3");
            loginMenu();
        }
    }

    public void userMenu() {
        System.out.println("Choose one of following menus:");
        System.out.println("1.Products menu.");
        System.out.println("2.My orders menu.");
        System.out.println("3.Previous.");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if (var == 1) {
            productMenu();
        } else if (var == 2) {
            myOrdersMenu();
        } else if (var == 3) {
            loginMenu();
        } else {
            System.out.println("There is no choice on this position , choose between 1 to 3");
            userMenu();
        }
    }

    public void productMenu() {
        System.out.println("Choose one of following options:");
        System.out.println("1.Product list.");
        System.out.println("2.Search for specific product.");
        System.out.println("3.Order checkout.");
        System.out.println("4.Previous.");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if (var == 1) {
            productListAndOrder();
        } else if (var == 2) {
            searchProduct();
        } else if (var == 3) {
            orderCheckout();
        } else if (var == 4) {
            userMenu();
        } else {
            System.out.println("There is no choice on this position , choose between 1 to 4");
            productMenu();
        }
    }

    public void myOrdersMenu() {

    }

    public void productListAndOrder() {
        System.out.println("Choose product to order:");
        System.out.println("(0 to finish)");
        order.productList();
        while (true) {
            Scanner scan = new Scanner(System.in);
            int var = scan.nextInt();
            if (var == 0) {
                break;
            }
            order.addToOrder(var - 1);
        }
        productMenu();
    }

    public void searchProduct() {
        System.out.println("Enter product name:");
        Scanner scan = new Scanner(System.in);
        String prod = scan.nextLine();
        System.out.println(order.search(prod));
        productMenu();
    }

    public void orderCheckout() {
        System.out.println(order.getOrder());
        productMenu();
    }


    public void adminMenu() {
        System.out.println("Choose one of following options:");
        System.out.println("1.Users menu.");
        System.out.println("2.Order menu.");
        System.out.println("3.Products menu.");
        System.out.println("4.Previous.");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if (var == 1) {
            usersMenu();
        } else if (var == 2) {
            orderMenu();
        } else if (var == 3) {
            productsMenu();
        } else {
            loginMenu();
        }
    }

    public void usersMenu() {
        System.out.println("Do you wish to block or unblock user?");
        System.out.println("1.Block.");
        System.out.println("2.Unblock.");
        System.out.println("3.Previous.");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if (var == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("List of users:");
            System.out.println(validation.getNewUsers());
            System.out.println("Enter name and password of user to block:");
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();
            if (validation.blockUser(username , password) == true) {
                System.out.println(username + "successfully blocked!");
                usersMenu();
            } else {
                System.out.println("Incorrect username or password.");
                usersMenu();
            }

        } else if (var == 2) {
            System.out.println("List of blocked users:");
            System.out.println(validation.getBlockedUsers());
        } else if (var == 3) {
            adminMenu();
        }

    }

    public void orderMenu() {

    }

    public void productsMenu() {

    }

}
