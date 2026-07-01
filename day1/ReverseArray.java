import java.util.*;
class ReverseArray{
public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<=n/2;i++){
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
    }
    for(int i=0;i<n;i++){
System.out.println(a[i]);
    }
}}