package testExeercise;
/* Implement a banking system using java.
Create 3 sub class of Bank : SBI,BOI,ICICI
All 4 should have following methods:
getDetails which provide their specific details like rateofinterest etc
printDetails of every bank.
Every bank account should have a type (enum): SAVINGS, CURRENT
Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is less than the current balance.
Every banking transaction should be saved in a file of each bank's transaction log which would have all details of the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any)*/

public class BANK_Assignment_mainclass {


    String city;
    Float roi;
    BANK_Assignment_mainclass(String city, float roi) {
        this.city = city;
        this.roi = roi;
    }
    public void getDetails() {
        System.out.println("City " + city);
        System.out.println("Rate of interest " + roi);
    }
}
class SBI extends BANK_Assignment_mainclass {
    String branchId;
    public SBI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
class BOI extends BANK_Assignment_mainclass {
    String branchId;
    public BOI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
class ICICI extends BANK_Assignment_mainclass {
    String branchId;
    public ICICI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
