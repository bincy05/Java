import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.print("enter the array elements:");
        int i,j;
        for (i=0;i<=a.length-1;i++){
            a[i]= sc.nextInt();
        }
        //ascending order sorting
        for (i=0;i<= a.length-1;i++){
            for (j=0;j<=a.length-2;j++){
                if (a[j]>a[j+1]){ //for descending order use < symbol
                  a[j]=a[j]+a[j+1];
                  a[j+1]=a[j]-a[j+1];
                  a[j]=a[j]-a[j+1];
                }
            }
        }
        System.out.println("Sorted array elements:");
        for (i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
