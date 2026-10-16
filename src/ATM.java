import java.util.Scanner;

class homework {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double balance = 1000;
        System.out.println("====Simple ATM====");
        for (int i = 1; i <= 3; i++)
        {
            int left=3-i;
            System.out.print("Enter your PIN: ");
            int pin = scn.nextInt();
            if(pin != 1234 && i==2){
                System.out.println("Incorrect PIN!");
                System.out.println("You have "+ left+ " attempt");
            }
            else if (pin != 1234 && i<3)
            {
                System.out.println("Incorrect PIN! ");
                System.out.println("You have "+ left+" attempts");
            }
            if (pin != 1234 && i == 3)
            {
                System.out.println("Incorrect PIN!");
                System.out.println("Your account has been blocked! ");
                break;
            } else if (pin == 1234) {
                for (int j = 1; j >= 1; j++)
                {
                    System.out.println("====ATM MENU====");
                    System.out.println("1. Check balance");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money ");
                    System.out.println("4. Exit");
                    System.out.println("");
                    System.out.print("Choose an option: ");
                    int opt = scn.nextInt();
                    if (opt == 1)
                    {
                        System.out.println("Your current balance: " + balance);
                    }
                    else if  (opt == 2)
                    {
                        System.out.print("Enter deposit ampount: ");
                        double dep = scn.nextInt();
                        if (dep <= 0)
                        {
                            System.out.println("Be realistic");
                        }
                        else if (dep > 0)
                        {
                            balance += dep;
                            System.out.println("Deposit successful");
                            System.out.println("Your balance is: " + balance);
                        }
                    }
                    else if (opt == 3)
                    {
                        System.out.print("Enter withdrawal amount: ");
                        double with = scn.nextDouble();
                        if(with>balance){
                            System.out.println("Not enough money on your account! ");
                        }
                        else if (with <= 0 )
                        {
                            System.out.println("Be realistic");
                        } else if (with > 0)
                        {
                            balance -= with;
                            System.out.println("Withdrawal succesful");
                            System.out.println("Your balance is: " + balance);
                        }
                    }
                    else if (opt == 4) {
                        System.out.println("Thank you  for  using Simple  ATM!");
                        return ;
                    }
                    else if (opt > 4 || opt < 1)
                    {
                        System.out.println("Invalid operation!");
                    }
                }
            }
        }
    }
}