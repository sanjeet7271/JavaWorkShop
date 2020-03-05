# JavaWorkShop
Database management system in java


School Data Simple Query System

The access to the system is password protected. The password will be stored in a file on the Desktop. When user will start the application it will ask user to enter the password and the application will only go ahead if the password is correct, i.e, it matches the password stored in the password file on the desktop. If the password entered is incorrect, it shows the message of incorrect password with a number of attempts left. In total a user gets 4 attempts to enter the correct password after which the system exits. After a user enters correct password he is shown with the following Menu.

1. Add Student Details - Add the details of a new student
2. Remove Student Details - Remove a student from records
3. Add Teacher Details - Add the details of a new teacher
4. Remove Teacher Details- Remove a teacher from records
5. Query Data- Ask user to enter a query and show the results
6. Exit

The Query will be in the format below.
SELECT <columnName>,<columnName>,... FROM <tableName> WHERE <columnName><operator><comparisonValue>

Operator can be any of the following:
=
>
<
>=
<=

Table Name can be any of the following:
Person - Show results across Students and Teachers
Student - Show results from Student table only
Teacher - Show results from teachers table only

Please Validate the query String input by the user.
Use exception handling wherever applicable.

Person
FirstName
MiddleName
LastName
ContactNumber
Address

Student extends Person
RollNumber
Marks

Teacher
employeeId
Salary
Bonus
