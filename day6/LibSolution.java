import java.util.*;
class Book{
 private   int bookId;
  private  String title;
   private  String author;
    private double price ;
  private  boolean available ;
  public void setbookId(int bookId){
    this.bookId=bookId;
  }
  public int getbookId(){
    return this.bookId;

  }
   public void settitle(String title){
    this.title=title;
  }
  public String gettitle(){
    return this.title;
    
  }
   public void setauthor(String author){
    this.author=author;
  }
  public String getauthor(){
    return this.author;
    
  }
   public void setprice(double price){
    this.price=price;
  }
  public double getprice(){
    return this.price;
    
  }
   
   public void setavailable(boolean available){
    this.available=available;
  }
  public boolean getavailable(){
    return this.available;
    
  }
}
class LibSolution{
    public static ArrayList<String> getAvailableBooksByAuthor(Book[] arr, String author){
        ArrayList<String>a=new ArrayList<>();
        for(Book b:arr){
            if(b.getauthor().equalsIgnoreCase(author) && b.getavailable()==true){
a.add(b.gettitle());
            }
        }
        a.sort(Comparator.naturalOrder());
        return a;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Book[] arr=new Book[5];
        for(int i=0;i<5;i++){
            arr[i]=new Book();
            arr[i].setbookId(sc.nextInt());
            arr[i].settitle(sc.next());
            arr[i].setauthor(sc.next());
            arr[i].setprice(sc.nextDouble());
            arr[i].setavailable(sc.nextBoolean());

        }
String s;
s=sc.next();
        ArrayList<String>a=getAvailableBooksByAuthor(arr,s);
        if(a.size()==0){
            System.out.println("No");
        }
        for(String y:a){
            System.out.println(y);
        }
    }
}