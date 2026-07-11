import java.util.*;
class Mov{
    
private String movieName ;
 private String company ;
private String  genre ;
 private int budget ;
 public void setmovieName(String movieName){
    this.movieName=movieName;
 } 
 public  String getmovieName(){
    return this.movieName;
 }
 public  void setcompany(String company){
    this.company=company;
 } 
 public  String getcompany(){
    return this.company;
 }
 public  void setgenre(String genre ){
    this.genre=genre;
 } 
 public  String getgenre(){
    return this.genre;
 }
 public void setbudget(int budget){
    this.budget=budget;
 }
 public int getbudget(){
    return this.budget;
 }

}
class Movie{
    public static String[] getMovieByGenre(Mov[] movie,String search){
       String[] s=new String[0];
for(Mov m:movie ){
    if(m.getgenre().equalsIgnoreCase(search)){
    if(m.getbudget()>8000000){
        s=Arrays.copyOf(s,s.length+1);
        s[s.length-1]="High Budget Film";
    }else {
        s=Arrays.copyOf(s,s.length+1);
        s[s.length-1]="Low Budget Film";
    }
    }
}
return s;}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Mov []m=new Mov[4];
    for(int i=0;i<4;i++){
        m[i]=new Mov();
        m[i].setmovieName(sc.next());
        m[i].setcompany(sc.next());
        m[i].setgenre(sc.next());
        m[i].setbudget(sc.nextInt());
        sc.nextLine();
    }
String search;
search=sc.next();
String[] s=getMovieByGenre(m,search);
for(String x:s){
    System.out.println(x);
}
}
    }
