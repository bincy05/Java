import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n,i,a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();

        if(n==1){
            System.out.println("0");
        }
        if(n==2){
            System.out.println("0 1");
        }
        if(n>2){
            System.out.print("0 1 ");
            a=0;
            b=1;
            for (i=3;i<=n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
