package Task1;


public class Main {

	
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("John Doe", 986532, 125.35, BankAccount.Currency.USD);
        BankAccount account2 = new BankAccount("Sub Zero", 12354, 560012.02, BankAccount.Currency.BLR);
        BankAccount account3 = new BankAccount("Kitana Smith", 12841, -6941.124, BankAccount.Currency.EUR);
        
        System.out.println("Hashcode of the account1 " + account1 + " is " + account1.hashCode());
        System.out.println("Hashcode of the account2 " + account2 + " is " + account2.hashCode());
        System.out.println("Hashcode of the account3 " + account3 + " is " + account3.hashCode());
        System.out.println("--------------------------------------");
        
        if (account1.equals(account2)) {
        	System.out.println("BankAccount1 is equal to BankAccount2");
        }
        else {
        	System.out.println("BankAccount1 is not equal to BankAccount2");
        }
        if (account2.equals(account3)) {
        	System.out.println("BankAccount2 is equal to BankAccount3");
        }
        else {
        	System.out.println("BankAccount2 is not equal to BankAccount3");
        }
        if (account3.equals(account1)) {
        	System.out.println("BankAccount3 is equal to BankAccount1");
        }
        else {
        	System.out.println("BankAccount3 is not equal to BankAccount1");
        }      
    }
}
