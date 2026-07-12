import java.util.*;
class Medicine{
    private String  MedicineName ;
 private String   batch ;
 private String  disease ;
  private int price ;
  public void setMedicineName(String MedicineName){
    this.MedicineName=MedicineName;
  }
  public String getMedicineName(){
    return this.MedicineName;
  }
public void setbatch(String batch){
    this.batch=batch;
}
public String getbatch(){
    return this.batch;
}
public void setdisease(String disease){
    this.disease=disease;
}
public String getdisease(){
    return this.disease;
}
public void setprice(int price){
    this.price=price;
}
public int getprice(){
    return this.price;
}
}
public class Solution{
public static int[] getPriceByDisease(Medicine[] med,String disease){
int []arr=new int[0];
for(Medicine m:med){
    if(m.getdisease().equalsIgnoreCase(disease)){
arr=Arrays.copyOf(arr,arr.length+1);
arr[arr.length-1]=m.getprice();
    }
   
}
 Arrays.sort(arr);
    
return arr;
}
public static void main(String[] args) {
    Medicine[] m=new Medicine[4];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++){
m[i]=new Medicine();
m[i].setMedicineName(sc.next());
m[i].setbatch(sc.next());
m[i].setdisease(sc.next());
m[i].setprice(sc.nextInt());

}
// sc.nextLine();
String s=sc.next();
int[] arr=getPriceByDisease(m, s);
if(arr.length==0){
    System.out.print("No");
}else{
for(int i:arr){
    System.out.println(i);
}}
}

}