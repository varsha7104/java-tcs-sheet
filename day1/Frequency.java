import java.util.*;
class Frequency{
public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    HashMap<Integer,Integer>mp=new HashMap<>();
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    for(int i:a){
        mp.put(i,mp.getOrDefault(i,0)+1);
        
    }
    // for(int i:a){
        System.out.println(mp);
    // }
}
}