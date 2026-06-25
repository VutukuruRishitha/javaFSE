DECLARE
    CURSOR cur_discount IS
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
        FOR UPDATE OF InterestRate;
    CURSOR cur_vip IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
        FOR UPDATE OF IsVIP;
    CURSOR cur_reminder IS
        SELECT l.LoanID, l.CustomerID, c.Name, l.DueDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate <= SYSDATE + 30;

BEGIN
    FOR rec IN cur_discount LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CURRENT OF cur_discount;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Scenario 1: Discount applied for customers above 60.');
    FOR rec IN cur_vip LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CURRENT OF cur_vip;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Scenario 2: VIP status updated for eligible customers.');
    FOR rec IN cur_reminder LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || ' for customer ' || rec.Name || ' is due on ' || TO_CHAR(rec.DueDate, 'DD-Mon-YYYY'));
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Scenario 3: Loan reminders sent.');
END;