import java.util.Scanner;

class sixth {
    public static void main(){
        System.out.println("Your number:");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<=n; i+=1){
            if(i%2==1 && i!=0){
                System.out.println(i);
            }
        }
    }
}
