import java.util.*;
class List{
public static void main(String[] args){
    ArrayList<Integer>a=new ArrayList<>();
    a.add(1);
    a.add(3);
    a.add(2);
     a.add(11);
    a.add(32);
    a.add(52);
    for(int i:a){
        System.out.println(i);
    }
 System.out.println(a.get(5));
  a.set(4,34);
    System.out.println(a);
    a.remove(0);
    System.out.println(a);

}
}