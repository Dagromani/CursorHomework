package view;

import services.ProductsServices;
import services.UserServices;

import java.util.Scanner;

public class Menu {
    static final int MENU_POINT_ONE = 1;
    static final int MENU_POINT_TWO = 2;
    static final int MENU_POINT_THREE = 3;
    static final int MENU_POINT_FOUR = 4;

    private UserServices userServices = new UserServices();
    private ProductsServices productsServices = new ProductsServices();

    public void start() {
        loginMenu();
    }

    public void loginMenu() {
        System.out.println("Choose how to login:");
        System.out.println("1.Login as user.");
        System.out.println("2.Register new user.");
        System.out.println("3.Login as admin.");
        System.out.println("4.Exit");
        Scanner scan = new Scanner(System.in);
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            if (userServices.loginAsUser() == true) {
                System.out.println("Login successful!");
                userMenu();
            } else {
                loginMenu();
            }
        } else if (menuPoint == MENU_POINT_TWO) {
            userServices.registerNewUser();
            System.out.println("Now you can login with your name and password.");
            loginMenu();
        } else if (menuPoint == MENU_POINT_THREE) {
            if (userServices.loginAsAdmin() == true) {
                adminMenu();
            } else {
                System.out.println("Invalid name or password!Try again.");
                loginMenu();
            }
        } else if (menuPoint == MENU_POINT_FOUR) {
            System.out.println("Good bye!");
        } else {
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
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            userProductMenu();
        } else if (menuPoint == MENU_POINT_TWO) {
            myOrdersMenu();
        } else if (menuPoint == MENU_POINT_THREE) {
            loginMenu();
        } else {
            System.out.println("There is no choice on this position , choose between 1 to 3");
            userMenu();
        }
    }

    public void userProductMenu() {
        System.out.println("Choose one of following options:");
        System.out.println("1.Product list.");
        System.out.println("2.Search for specific product.");
        System.out.println("3.Order checkout.");
        System.out.println("4.Previous.");
        Scanner scan = new Scanner(System.in);
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            System.out.println("Choose product to order:");
            System.out.println("(0 to finish)");
            productList();
            productsServices.productOrder();
            userProductMenu();
        } else if (menuPoint == MENU_POINT_TWO) {
            searchProduct();
        } else if (menuPoint == MENU_POINT_THREE) {
            orderCheckout();
        } else if (menuPoint == MENU_POINT_FOUR) {
            userMenu();
        } else {
            System.out.println("There is no choice on this position , choose between 1 to 4");
            userProductMenu();
        }
    }

    public void myOrdersMenu() {
        productsServices.showOrdersDB();
        userProductMenu();
    }

    public void productList() {
        productsServices.productList();
    }

    public void searchProduct() {
        System.out.println("Enter product name:");
        Scanner scan = new Scanner(System.in);
        String prod = scan.nextLine();
        if (productsServices.search(prod) == true) {
            System.out.println("Would you like to order " + prod + "? (y/n)");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                productsServices.addToOrdersDBWithName(prod);
                userProductMenu();
            }
            if (answer.equalsIgnoreCase("n")) {
                userProductMenu();
            }
        } else {
            System.out.println("Product not found.");
            userProductMenu();
        }

    }

    public void orderCheckout() {
        System.out.println(productsServices.getOrder());
        userProductMenu();
    }


    public void adminMenu() {
        System.out.println("Choose one of following options:");
        System.out.println("1.Users menu.");
        System.out.println("2.Order menu.");
        System.out.println("3.Products menu.");
        System.out.println("4.Previous.");
        Scanner scan = new Scanner(System.in);
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            adminUsersMenu();
        } else if (menuPoint == MENU_POINT_TWO) {
            orderMenu();
        } else if (menuPoint == MENU_POINT_THREE) {
            adminProductsMenu();
        } else {
            loginMenu();
        }
    }

    public void adminUsersMenu() {
        System.out.println("Do you wish to block or unblock user?");
        System.out.println("1.Block.");
        System.out.println("2.Unblock.");
        System.out.println("3.Previous.");
        Scanner scan = new Scanner(System.in);
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("List of users:");
            System.out.println(userServices.getNewUsers());
            System.out.println("Enter name and password of user to block:");
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();
            if (userServices.blockUser(username, password) == true) {
                System.out.println(username + " successfully blocked!");
                adminUsersMenu();
            } else {
                System.out.println("Incorrect username or password.");
                adminUsersMenu();
            }

        } else if (menuPoint == MENU_POINT_TWO) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("List of blocked users:");
            System.out.println(userServices.getBlockedUsers());
            System.out.println("Enter name and password of user to unblock:");
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();
            if (userServices.unblockUser(username, password) == true) {
                System.out.println(username + "successfully unblocked!");
                adminUsersMenu();
            } else {
                System.out.println("Incorrect username or password.");
                adminUsersMenu();
            }

        } else if (menuPoint == MENU_POINT_THREE) {
            adminMenu();
        }

    }

    public void orderMenu() {
        System.out.println("Do you wish to confirm or unconfirm order?");
        System.out.println("1.Confirm.");
        System.out.println("2.Unconfirm.");
        System.out.println("3.Previous.");
        Scanner scan = new Scanner(System.in);
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            System.out.println("Choose order to confirm:");
            productsServices.showOrdersDB();
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            userServices.confirmOrder(i - 1);
            adminMenu();
        } else if(menuPoint == MENU_POINT_TWO) {
            System.out.println("Choose order to unconfirm:");
            userServices.getConfirmedOrders();
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            userServices.unconfirmOrder(i - 1);
            adminMenu();
        } else if (menuPoint == MENU_POINT_THREE) {
            adminMenu();
        }
    }

    public void adminProductsMenu() {
        System.out.println("Choose one of following options:");
        System.out.println("1.Edit product name.");
        System.out.println("2.Add new product.");
        System.out.println("3.Previous.");
        Scanner scan = new Scanner(System.in);
        int menuPoint = scan.nextInt();
        if (menuPoint == MENU_POINT_ONE) {
            editProduct();
        } else if (menuPoint == MENU_POINT_TWO) {
            addProduct();
        } else if (menuPoint == MENU_POINT_THREE) {
            adminMenu();
        }
    }

    public void editProduct() {
        System.out.println("Choose product to edit:");
        productsServices.productList();
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        productsServices.productEdit(var - 1);
        adminProductsMenu();
    }

    public void addProduct() {
        System.out.println("Enter product name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        productsServices.addProduct(name);
        adminProductsMenu();
    }

}
