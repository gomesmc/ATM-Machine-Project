import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperateInterface op = new AtmOperation();
        int atmNumber = 12345; 
        int atmPin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!");
        System.out.print("Enter ATM Number: ");
        atmNumber = in.nextInt();  
        System.out.print("Enter Pin Number: ");
        int pin= in.nextInt();
        if((atmNumber == atmNumber) && (atmPin==pin)){
            while (true) { 
                System.out.println("1. View Available Balance\n2. Withdraw Amount \n3. Deposit the Amount\n4. View Ministatement\n5. Exit");
                System.out.println("Enter choice: ");
                int choice = in.nextInt();
                if (choice==1){
                    op.viewBalance();
                }
                else if(choice==2){
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmout(withdrawAmount);
                }
                else if(choice==3){
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = in.nextDouble(); // 5000.00
                    op.depositAmount(depositAmount);
                }
                else if(choice==4){
                    op.viewMiniStatement();
                }
                else if(choice==5){
                    System.out.println("Collect your Atm Card\nThank you for using ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
                
            }
        }
        else{
            System.out.println("Incorrect Atm Number or Atm Pin");
            System.exit(0);
        }
    }
}