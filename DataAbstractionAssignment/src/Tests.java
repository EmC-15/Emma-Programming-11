import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void testDepositToString(){
        //code here
        Deposit d = new Deposit(400.00, new Date(), "Checking");
        String expected = d.toString();
        System.out.println(d.toString());
        assertEquals(expected, expected.toString());
    }

    @Test
    public void testWithdrawToString(){
        //code here
        Withdraw w = new Withdraw(500.00, new Date(), "Saving");
        String expected = w.toString();
        System.out.println(w.toString());
        assertEquals(expected, expected.toString());
    }

    @Test
    public void testCustomerWithdraw(){
        //code here
        ArrayList<Withdraw> withdrawss = new ArrayList<>();
        Withdraw one = new Withdraw(400.00, new Date(), "Checking");
        withdrawss.add(one);
        assertEquals(withdrawss.size(), 1);
        assertTrue(withdrawss.contains(one));
        Withdraw two = new Withdraw(500.00, new Date(), "Saving");
        withdrawss.add(two);
        assertEquals(withdrawss.size(), 2);
        assertTrue(withdrawss.contains(two));
    }

    @Test
    public void testCustomerDeposit(){
        //code here
        ArrayList<Deposit> depositss = new ArrayList<>();
        Deposit one = new Deposit(400.00, new Date(), "Checking");
        depositss.add(one);
        assertEquals(depositss.size(), 1);
        assertTrue(depositss.contains(one));
        Deposit two = new Deposit(500.00, new Date(), "Saving");
        depositss.add(two);
        assertEquals(depositss.size(), 2);
        assertTrue(depositss.contains(two));
    }
}
