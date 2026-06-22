package com.main;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Expense;
import com.util.HibernateUtil;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                sc.nextLine();

                System.out.print("Category : ");
                String category = sc.nextLine();

                System.out.print("Amount : ");
                double amount = sc.nextDouble();

                sc.nextLine();

                System.out.print("Description : ");
                String description = sc.nextLine();

                System.out.print("Date (yyyy-mm-dd) : ");
                String date = sc.nextLine();

                Expense expense = new Expense();

                expense.setCategory(category);
                expense.setAmount(amount);
                expense.setDescription(description);
                expense.setExpenseDate(Date.valueOf(date));

                Session session =
                        HibernateUtil.getFactory().openSession();

                Transaction tx =
                        session.beginTransaction();

                session.save(expense);

                tx.commit();

                session.close();

                System.out.println("Expense Added Successfully");
                break;

            case 2:

                Session session2 =
                        HibernateUtil.getFactory().openSession();

                List<Expense> expenses =
                        session2.createQuery(
                                "from Expense",
                                Expense.class)
                                .list();

                System.out.println("\n----- Expenses -----");

                for (Expense e : expenses) {

                    System.out.println(
                            e.getExpenseId()
                                    + " | "
                                    + e.getCategory()
                                    + " | "
                                    + e.getAmount()
                                    + " | "
                                    + e.getDescription()
                                    + " | "
                                    + e.getExpenseDate());
                }

                session2.close();

                break;

            case 3:

                System.out.print("Enter Expense ID : ");
                int id = sc.nextInt();

                Session session3 =
                        HibernateUtil.getFactory().openSession();

                Transaction tx3 =
                        session3.beginTransaction();

                Expense exp =
                        session3.get(Expense.class, id);

                if (exp != null) {

                    session3.delete(exp);

                    System.out.println("Expense Deleted");
                } else {

                    System.out.println("Expense Not Found");
                }

                tx3.commit();

                session3.close();

                break;

            case 4:

                HibernateUtil.getFactory().close();

                sc.close();

                System.exit(0);

                break;

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}