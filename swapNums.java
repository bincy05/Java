// Java program to swap first and last element of array without using extra variable
import java.util.*;
public class Swap{
  public static void main(String[] args){
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    n=sc.nextInt();

    System.out.println("Enter array elements");
    for(i=0;i<=a.length-1;i++){
      a[i]=sc.nextInt();
    }

    System.out.println("Given array is:");
    for(i=0;i<=a.length-1;i++){
      System.out.println(a[i]+" ");
    }
    System.out.println();

    //logic to swap
    a[0]=a[0]+a[a.length-1];
    a[a.length-1]=a[0]-a[a.length-1];
    a[0]=a[0]-a[a.length-1];

    System.out.println("Swapped array is:");
    for(i=0;i<=a.length-1;i++){
      System.out.println(a[i]+" ");
    }    
  }
}
