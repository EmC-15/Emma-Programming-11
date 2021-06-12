import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;


public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance; //how much checking deposit
    private double savingBalance; //how much saving deposit
    private double savingRate; //rate of savings?
    private String name; //name of customer
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        accountNumber = 0;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
        checkBalance = 0.0;
        savingBalance = 0.0;
        savingRate = 0.0;
        name = "name";
        for (int i = 0; i<deposits.size(); i++){
            deposits.add(new Deposit(0.0, new Date(),"Account name"));
        }
        for (int o = 0; o<withdraws.size(); o++){
            withdraws.add(new Withdraw(0.0, new Date(), "Account name"));
        }
    }

    //customer constructor
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        checkDeposit = 400.00;
        checkBalance = checkDeposit;
        savingDeposit = 500.00;
        savingBalance = savingDeposit;

    }

    //Requires: amount >= 0, date, account type (checking or saving)
    //Modifies: changes the size of the deposit arrayList, and changes the check and saving balance
    //Effects: creates a new Deposit object and adds it to the list of deposits
    public double deposit(double amt, Date date, String account){
        //your code here
        deposits.add(new Deposit(400.00, new Date(), CHECKING));
        deposits.add(new Deposit(500.00, new Date(), SAVING));
        checkBalance = 400.00;
        savingBalance = 500.00;
        return 0;
    }


    //Requires: amount >= 0, date, account type (checking or saving)
    //Modifies: changes the size of the withdraw arrayList, and changes the check and saving balance
    //Effects: creates a new Withdraw object and adds it to the list of withdraws
    public double withdraw(double amt, Date date, String account){
        //your code here
        withdraws.add(new Withdraw(400.00, new Date(), CHECKING));
        withdraws.add(new Withdraw(500.00, new Date(), SAVING));
        deposits.remove(1);
        deposits.remove(2);
        checkBalance = 0.0;
        savingBalance = 0.0;
        return 0;
    }

    //Requires: amount, account type
    //Effects: checks if the balance - withdraw amount is  greater then or equal to 0.  If it is, then there is no overdraft. (returns false)
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if (checkBalance - amt >= 0 && savingBalance - amt >= 0){
            System.out.println("no overdraft");
        }
        return false;
    }


    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }
}
