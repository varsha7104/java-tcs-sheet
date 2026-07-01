// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SmallNumber{
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of n");
        n=sc.nextInt();
        
        int []a=new int[n];
  System.out.println("Array values");
        for(int i=0;i<n;i++){
    int u=sc.nextInt();
    a[i]=u;
        }
       
        int mini=999999;
        for(int i=0;i<n;i++){
            if(a[i]<mini){
                mini=a[i];
            }
        }
        System.out.println("Minimum number"+mini);
    }
}