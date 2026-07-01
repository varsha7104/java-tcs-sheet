import java.util.*;
class LargerNumber {
    public static void main(String[] args){
int n;
System.out.println("Enter the size of the array");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

int []arr=new int[n];
System.out.println("enter the values of the array");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}

int maxi=-99999;
for(int i=0;i<n;i++){
    if(arr[i]>maxi){
        maxi=arr[i];
    }
}
    
System.out.println("Largest Number: "+maxi);
    }
}
