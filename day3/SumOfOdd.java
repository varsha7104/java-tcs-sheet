 import java.util.*; 
class MyClass{
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in); 
    int []a=new int[5]; 
    for(int i=0;i<5;i++){
    a[i]=sc.nextInt();
    if(a[i]%2!=0){
    
    s+=a[i];}
    }
    if(s<8|| s>50){
      System.out.println("NA");} 
                                       
    else { System.out.println("Sum of odd numbers:"+s);
         } }}
