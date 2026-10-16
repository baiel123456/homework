import java.util.Scanner;

class guess2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int neg=0;
        int pos=0;
        int zero=0;
        int even=0;
        int odd=0;
        for(int i=1; i<=10; i++){
            System.out.print("Enter number: ");
            int num=scn.nextInt();

            if(num<0)
                neg++;
            if(num>0)
                pos++;
            if(num==0)
                zero++;
            if(num%2==0 && num!=0)
                even++;
            if(num%2==0 && num!=0)
                odd++;

            if (i ==10) {
                System.out.println("====STATISTICS====");
                System.out.println("Positive numbers: "+pos);
                System.out.println("Negative numbers: "+ neg);
                System.out.println("Zeros: "+zero);
                System.out.println("Even numbers: " +even);
                System.out.println("Odd numbers: "+odd);
            }
        }




    }}