SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
   UPDATE Accounts
   SET Balance = Balance + (Balance * 0.01)
   WHERE AccountType = 'SAVINGS';

   DBMS_OUTPUT.PUT_LINE('Scenario 1: Interest applied to all savings accounts.');
END;
/
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
   dept_id IN NUMBER,
   bonus_pct IN NUMBER
) IS
BEGIN
   UPDATE Employees
   SET Salary = Salary + (Salary * bonus_pct)
   WHERE DepartmentID = dept_id;

   DBMS_OUTPUT.PUT_LINE('Scenario 2: Bonus updated for department ' || dept_id);
END;
/
CREATE OR REPLACE PROCEDURE TransferFunds(
   from_account IN NUMBER,
   to_account IN NUMBER,
   amount IN NUMBER
) IS
   from_balance NUMBER;
BEGIN
   SELECT Balance INTO from_balance
   FROM Accounts
   WHERE AccountID = from_account
   FOR UPDATE;

   IF from_balance < amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Scenario 3: Insufficient funds in source account.');
   END IF;

   UPDATE Accounts
   SET Balance = Balance - amount
   WHERE AccountID = from_account;

   UPDATE Accounts
   SET Balance = Balance + amount
   WHERE AccountID = to_account;

   DBMS_OUTPUT.PUT_LINE('Scenario 3: ₹' || amount || ' transferred from Account ' || from_account || ' to Account ' || to_account);
END;
/
BEGIN
   ProcessMonthlyInterest;
   UpdateEmployeeBonus(101, 0.10);
   TransferFunds(2001, 2002, 1000);
END;
/
