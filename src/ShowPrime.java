import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int num = 0;
        System.out.println("Enter n number that you wanna show: ");
        int n = sc.nextInt();
        sc.close();
        String primeNumber = "";
        for( i=1; i<=n; i++){
            int counter = 0;
            for(num=i; num>=1; num--){
                if(i%num==0){
                    counter ++;
                }

            }if(counter==2){
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are:");
        System.out.println(primeNumber);
    }
}
