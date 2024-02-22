import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n= sc.nextInt();
        int[] a=new int[n];

        System.out.println("Enter the array elements");
        for(int i=0;i<=a.length-1;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("enter the search element");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==x){
                count++;
            }
        }
        if (count==0){
            System.out.println("element not found");
        }
    }
}
