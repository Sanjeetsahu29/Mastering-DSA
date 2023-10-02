import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =in.nextInt();
        prime(n);
    }
    static void prime(int n){
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag && n>1){
            System.out.println(n+" is Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
