import java.util.Scanner;
public class FibonacciArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int a[]=new int[n];
        a[0]=0;
        a[1]=1;
        int i;
        for (i=2;i<=a.length-1;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for (i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }

    }
}
