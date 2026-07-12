import java.util.*;
class Flower {
  private   int flowerId;
 private String flowerName;
 private int price;
 private int rating;
private String type;
public void setflowerId(int flowerId){
    this.flowerId=flowerId;
}
public int getflowerId(){
    return this.flowerId;
}
public void setflowerName(String flowerName){
    this.flowerName=flowerName;
}
public String getflowerName(){
    return  this.flowerName;
}
public void setPrice(int price){
    this.price=price;

}
public int getPrice(){
    return this.price;
}
public void setrating(int rating){
    this.rating=rating;
}
public int getrating(){
    return this.rating;
}





public void settype(String type ){
    this.type=type;
}
public String gettype(){
    return this.type;
}

}
class FlowSol{
    public static int  findMinPriceByType(Flower[] fl,String value){
        int maxi=999999;
        for(Flower f:fl){
if(f.gettype().equals(value) && f.getrating()>3){
    maxi=Math.min(maxi,f.getPrice());
}
        }
        for(Flower f:fl){
            if(f.getPrice()==maxi){
                return f.getflowerId();
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Flower []f =new Flower[4];
        for(int i=0;i<4;i++){
f[i]=new Flower();
f[i].setflowerId(sc.nextInt());
f[i].setflowerName(sc.nextLine());
sc.nextLine();
f[i].setPrice(sc.nextInt());
f[i].setrating(sc.nextInt());
f[i].settype(sc.next());
        }
        String type=sc.next();
        int maxi=findMinPriceByType(f, type);
        if(maxi==-1){
            System.out.println("No Such Flower Found");
            return;
        }
        else{
        System.out.println(maxi);}
    }
}