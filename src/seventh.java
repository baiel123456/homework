import java.util.Scanner;

class seventh {
    public static void main(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=scn.nextInt();
        for(int i=1; i<=num; i+=1){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz:"+i);
            }
            else if(i %5==0){
                System.out.println("Buuz:"+i);

            }
            else if(i%3==0){
                System.out.println("Fizz:"+i);
            }

        }




    }
}
