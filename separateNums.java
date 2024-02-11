//WAJP to separate even and odd numbers from a given array
import java.util.*;
public class Array{
public static void main(String[] args){
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size");
n=sc.nextInt();

int[] a=new int[n];
System.out.println("Enter the elements");
for(i=0;i<=a.length-1;i++){
a[i]=sc.nextInt();
}

System.out.println("Even elements are:");
for(i=0;i<=a.length-1;i++){
 if(a[i]%2==0){
  System.out.println(a[i]+" ");
 }
}

System.out.println("Odd elements are:");
for(i=0;i<=a.length-1;i++){
 if(a[i]%2!=0){
    System.out.println(a[i]+" ");
 }
}
}
}


