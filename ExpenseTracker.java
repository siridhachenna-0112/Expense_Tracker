import java.util.ArrayList;
import java.util.Scanner;

class Expense_Tracker {
    String category;
    double amount;
    String date;

    public Expense_Tracker(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String toString() {
        return "Category: " + category + ", Amount: ₹" + amount + ", Date: " + date;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Expense_Tracker> expenses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    expenses.add(new Expense_Tracker(category, amount, date));
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded.");
                    } else {
                        System.out.println("\nYour Expenses:");
                        for (int i = 0; i < expenses.size(); i++) {
                            System.out.println((i + 1) + ". " + expenses.get(i));
                        }
                    }
                    break;

                case 3:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses to delete.");
                    } else {
                        System.out.println("Enter expense number to delete: ");
                        int index = sc.nextInt();
                        if (index > 0 && index <= expenses.size()) {
                            expenses.remove(index - 1);
                            System.out.println("Expense deleted successfully.");
                        } else {
                            System.out.println("Invalid expense number.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using Expense Tracker!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
 }
}
}