import java.util.*;
class Med{
    int medicineId;
    String medicineName;
    int expiryTime;
    double price;
    public int getMedicineId(){
        return this.medicineId;
    }
    public void setMedicineId(int medicineId){
        this.medicineId=medicineId;
    }
    public String getMedicineName(){
        return this.medicineName;
    }
    public void setMedicineName(String medicineName){
this.medicineName=medicineName;
    }
    public int getExpiryTime(){
        return this.expiryTime;
    }
    public void setExpiryTime(int expiryTime){
        this.expiryTime=expiryTime;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
   
}
class Medicine{
    public static int countMedicinesByMedicine(Med[] arr,String medicineName){
        int count=0;
        for (Med m:arr){
            if(m.getMedicineName().equalsIgnoreCase(medicineName)){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n;
        // n=sc.nextInt();
        Med[] arr=new Med[4];
        for(int i=0;i<4;i++){
            arr[i]= new Med();
            arr[i].setMedicineId(sc.nextInt());
            arr[i].setMedicineName(sc.next());
             arr[i].setExpiryTime(sc.nextInt());
            arr[i].setPrice(sc.nextDouble());

        }
        sc.nextLine();
        String searchname=sc.nextLine();
        int count=countMedicinesByMedicine(arr,searchname);
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println("No Medicine Found");
        }
    }
}