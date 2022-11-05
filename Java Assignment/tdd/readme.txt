= You are going to write Employee HR system with the following 
functional requirements

Mandatory requirements
======================

(Domain classes)
-Employee has employeeId, firstName, and lastName fields
-Retiree has firstName and lastName fields
-There are two employee types: Hourly employee and Salaried employee

(employee monthly payment)
-Hourly employees are paid hourly while salaried employees are paid 
 with monthly salary
-The monthly payment for the hourly employee is computed by "hourly rate"
 times "number of hours worked in a month"
 
(company-wide operation)
-Company want to compute the total amount of payment made to employees

(charitable giving)
-All employees give money to charity in the same way
-The amount of Charitable giving has to be minimum $10, otherwise,
 the system should throw IllegalArgumentException
-Retirees don't make charitable contribution through the system
 
(pension plan)
-Only salaried employees and Retirees can contribute to a pension.
 (In other words, hourly employees do not participate in pension plan) 
-The same logic is used for both salaried employees and retirees
 (They can contribute only up to $200 per month. If higher amount
 is given, it will be set to $200.)
-Make sure there is no duplicate code between SalariedEmployee
 and Retiree classes

(life insurance)
-We also need to offer life insurance to all employees and Retirees
-Hourly employees can buy up to $50,000 of coverage
-Salaried employees can buy up to $100,000 of coverage
-Retirees can also purchase life insurance up to $70,000 of coverage

Optional requirements
=====================

-Contractors are paid per project basis
-Contractors can give money to charity
-Contractors do not participate in the pension plan, and they do
 not buy life insurance through the system
 
Development guideline
=====================

-Develop the application using TDD style
-Make sure you are following OO design principles and best practices
 such as "Open Close principle", "Favor composition over Inheritance",
 "Use interface whenever possible"
-Refactor the code along the way handling code smells
 

 
