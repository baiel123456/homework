import java.util.Scanner;

class PIN {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*for(int i=1; i<=3; i++){
            System.out.print("Enter PIN: ");
            int pin= scn.nextInt();
            int left= 3-i;
            if(pin!=1234){
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: "+left);
                if(left==0){
                    System.out.println("Card blocked!");
                    break;
                }
            }
            else if(pin==1234){
                System.out.println("Access granted!");
                break;


        }




 } */   int i=1;
        while (true){


            System.out.print("Enter PIN: ");
            int pin= scn.nextInt();
            int left= 3-i;
            i++;
            if(pin!=1234){
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: "+left);
                if(left==0){
                    System.out.println("Card blocked!");
                    break;
                }
            }
            else if(pin==1234){
                System.out.println("Access granted!");
                break;

            }

        }}}