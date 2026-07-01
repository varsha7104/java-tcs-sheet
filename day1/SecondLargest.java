import java.util.*;
class SecondLargest{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=-9999,smaxi=0;
        for(int i=0;i<n;i++){
if(maxi<arr[i]){
    smaxi=maxi;//change the value by storing
    maxi=arr[i];
    
}
else if (smaxi<arr[i]&& maxi!=smaxi){
    smaxi=arr[i];
}
// System.out.println( maxi+" "+smaxi);
        }
        System.out.println("Second Largest "+smaxi);
    }
  
}