import java.util.Scanner;

class seventh {
    public static void main(){
        for(int i=1; i<=20; i+=1){
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
