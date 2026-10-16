import java.util.Scanner;

class third{
    public static void main(){
        System.out.print("Enter your number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("(forloop )");
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("(whileloop )");

        int i =1;
        while(i<=n){
            System.out.println(i);
            i+=1;
        }
        System.out.println("(do-while_loop )");
        i=1;
        do{
            System.out.println(i);
            i+=1;

        }while (i<=n);





    }


}
