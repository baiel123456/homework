import java.util.Scanner;

class fifth {
    public static void main(){
        System.out.println("Your number:");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<=n; i+=1){
            if(i%2==0 && i!=0){
                System.out.println(i);
            }
        }

    }
}
