import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements AtmOperateInterface{
    
    Atm atm= new Atm();
    Map<Double,String> ministmt=new HashMap<>();

    @Override
    public void viewBalance(){
        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmout(double withdrawAmout){
        if(withdrawAmout % 500==0){
            if(withdrawAmout <= atm.getBalance()){
            ministmt.put(withdrawAmout, " Amount Withdrwan");
            System.out.println("Collect the cash: " +withdrawAmout);
            atm.setBalance(atm.getBalance() - withdrawAmout);
            viewBalance();
        }else{
            System.out.println("Insufficient Balance");
        }
        }
        else{
            System.out.println("Please enter the amount in multiple of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount){
        ministmt.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement(){
        for(Map.Entry<Double, String> m:ministmt.entrySet()){
            System.out.println(m.getKey() +"" + m.getValue());
        }
    }

}