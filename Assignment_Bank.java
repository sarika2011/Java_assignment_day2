package testExeercise;

public class Assignment_Bank {
    public static void main(String[] args) {
    	BANK_Assignment_mainclass bank = new BANK_Assignment_mainclass("Noida", 1.2f);
        SBI sbiBranch = new SBI("Kanpur",1.0f,"121");
        BOI boiBranch = new BOI("Delhi",1.5f,"863");
        ICICI iciciBranch = new ICICI("Gwalior",2.0f,"765");
        bank.getDetails();
        sbiBranch.getDetails();
        boiBranch.getDetails();
        iciciBranch.getDetails();
    }
}