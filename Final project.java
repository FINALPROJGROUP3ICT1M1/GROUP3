package Groupings;

import java.util.Scanner;

public class Finalproject {

	 // ANSI escape codes for text and background colors
    // Background colors (use with ANSI escape codes)
    private static final String RESET = "\033[0m";
    private static final String BLACK = "\033[30m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String YELLOW = "\033[33m";
    private static final String BLUE = "\033[34m";
    private static final String MAGENTA = "\033[35m";
    private static final String CYAN = "\033[36m";
    private static final String WHITE = "\033[37m";

    private static final String BG_BLACK = "\033[40m";
    private static final String BG_RED = "\033[41m";
    private static final String BG_GREEN = "\033[42m";
    private static final String BG_YELLOW = "\033[43m";
    private static final String BG_BLUE = "\033[44m";
    private static final String BG_MAGENTA = "\033[45m";
    private static final String BG_CYAN = "\033[46m";
    private static final String BG_WHITE = "\033[47m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Setting the background color for the terminal
        System.out.println(BG_CYAN + BLACK + "Welcome to the Menu Program!" + RESET);

        while (running) {
            // Display menu with colored text
            System.out.println(BG_YELLOW + BLUE + "\nMenu:" + RESET);
            System.out.println(RED + "1. Basic Calculator" + RESET);
            System.out.println(RED + "2. Area and Circumference of Circle" + RESET);
            System.out.println(RED + "3. Area and Perimeter of Rectangle" + RESET);
            System.out.println(RED + "4. Convert cm to mm" + RESET);
            System.out.println(RED + "5. Convert cm to m" + RESET);
            System.out.println(RED + "6. Exit" + RESET);

            System.out.print(BLUE + "Select an option (1-6): " + RESET);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print(WHITE + "Enter first number: " + RESET);
                    double num1 = scanner.nextDouble();
                    System.out.print(WHITE + "Enter second number: " + RESET);
                    double num2 = scanner.nextDouble();
                    System.out.println(WHITE + "Select operation: 1. Add 2. Subtract 3. Multiply 4. Divide" + RESET);
                    int operation = scanner.nextInt();
                    try {
                        switch (operation) {
                            case 1:
                                System.out.println(GREEN + "Result: " + (num1 + num2) + RESET);
                                break;
                            case 2:
                                System.out.println(GREEN + "Result: " + (num1 - num2) + RESET);
                                break;
                            case 3:
                                System.out.println(GREEN + "Result: " + (num1 * num2) + RESET);
                                break;
                            case 4:
                                if (num2 != 0) {
                                    System.out.println(GREEN + "Result: " + (num1 / num2) + RESET);
                                } else {
                                    System.out.println(RED + "Error! Division by zero." + RESET);
                                }
                                break;
                            default:
                                System.out.println(RED + "Invalid operation selected." + RESET);
                        }
                    } catch (Exception e) {
                        System.out.println(RED + e.getMessage() + RESET);
                    }
                    break;

                case 2:
                    System.out.print(WHITE + "Enter radius of the circle: " + RESET);
                    double radius = scanner.nextDouble();
                    System.out.println(GREEN + "Area: " + (Math.PI * radius * radius) + RESET);
                    System.out.println(GREEN + "Circumference: " + (2 * Math.PI * radius) + RESET);
                    break;

                case 3:
                    System.out.print(WHITE + "Enter length of the rectangle: " + RESET);
                    double length = scanner.nextDouble();
                    System.out.print(WHITE + "Enter width of the rectangle: " + RESET);
                    double width = scanner.nextDouble();
                    System.out.println(GREEN + "Area: " + (length * width) + RESET);
                    System.out.println(GREEN + "Perimeter: " + (2 * (length + width)) + RESET);
                    break;

                case 4:
                    System.out.print(WHITE + "Enter length in cm: " + RESET);
                    double cmValue = scanner.nextDouble();
                    System.out.println(GREEN + cmValue + " cm = " + (cmValue * 10) + " mm" + RESET);
                    break;

                case 5:
                    System.out.print(WHITE + "Enter length in cm: " + RESET);
                    double cmValue2 = scanner.nextDouble();
                    System.out.println(GREEN + cmValue2 + " cm = " + (cmValue2 / 100) + " m" + RESET);
                    break;

                case 6:
                    System.out.println(BG_RED + WHITE + "Exiting the application." + RESET);
                    running = false;
                    break;

                default:
                    System.out.println(RED + "Invalid option selected." + RESET);
            }
        }
    }
}