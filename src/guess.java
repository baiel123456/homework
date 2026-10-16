import java.util.Scanner;

class guess {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for(int i=1; i<=5; i++) {

            int left = 5 - i;
            System.out.print("Enter your guess: ");
            int num = scn.nextInt();
            if (num < 7) {
                System.out.println("Too low! ");
                if (left == 1) {
                    System.out.println("You have " + left + " attempt");
                }
                else if (left >= 2) {
                    System.out.println("You have " + left + " attempts");
                }
            }
            else if (num > 7) {
                System.out.println("Too high! ");
                if (left == 1) {
                    System.out.println("You have " + left + " attempt");
                } else if (left >= 2) {
                    System.out.println("You have " + left + " attempts");
                }
            }
            if (num == 7) {
                System.out.println("Correct! ");
                break;
            }
            if (i == 5 && num != 7) {
                System.out.println("Game over! ");
                System.out.println("The secret number was 7.");
                break;
            }

        }


    }
}
