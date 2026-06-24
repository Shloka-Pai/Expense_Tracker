# Expense Tracker - Console Based Application

## Overview

Expense Tracker is a console-based Java application developed using Hibernate ORM and MySQL database in Eclipse IDE. The application allows users to efficiently manage their daily expenses by performing CRUD (Create, Read, Update, Delete) operations. Hibernate is used for object-relational mapping, making database interactions simpler and more efficient.

---

## Features

- Add new expenses
- View all expenses
- Update existing expense details
- Delete expense records
- Search expenses by category
- Calculate total expenses
- Store and retrieve data from MySQL database
- Hibernate ORM integration

---

## Technologies Used

- Java
- Hibernate ORM
- MySQL
- JDBC
- Eclipse IDE

---

## Project Structure

ExpenseTracker/

├── src/

│ ├── entity/

│ │ └── Expense.java

│ ├── dao/

│ │ └── ExpenseDAO.java

│ ├── util/

│ │ └── HibernateUtil.java

│ └── main/

│ └── ExpenseTrackerApp.java

├── resources/

│ └── hibernate.cfg.xml

└── README.md

---

---

## How to Run

1. Open the project in Eclipse IDE.
2. Configure MySQL database.
3. Add Hibernate and MySQL JDBC libraries.
4. Update database credentials in `hibernate.cfg.xml`.
5. Run `ExpenseTrackerApp.java`.
6. Use the console menu to manage expenses.

---

## Sample Menu

```text
==============================
      EXPENSE TRACKER
==============================

1. Add Expense
2. View Expenses
3. Update Expense
4. Delete Expense
5. Search Expense
6. Calculate Total Expenses
7. Exit



## Learning Outcomes

- Understanding Hibernate ORM
- Performing CRUD operations
- Managing Hibernate Sessions and Transactions
- Integrating Java with MySQL
- Developing console-based Java applications
- Entity mapping and database configuration

---

## Future Enhancements

- User Authentication
- Monthly Expense Reports
- Budget Management
- Expense Analytics
- Export Reports to PDF/Excel
- Graphical User Interface (GUI)

---

## Conclusion

This Expense Tracker project demonstrates the implementation of a console-based expense management system using Java, Hibernate, and MySQL. It provides practical experience with ORM concepts, database connectivity, and CRUD operations while maintaining a simple and user-friendly interface.

---

## Author

Developed as a Java Hibernate Mini Project using MySQL Database and Eclipse IDE.
