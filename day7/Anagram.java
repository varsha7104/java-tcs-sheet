import java.util.*;
class Anagram{
    public static void main(String args[]){
        String s,t;
Scanner sc=new Scanner(System.in);
s=sc.next();
t=sc.next();
char[] a=s.toCharArray();
char[] b=t.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
String d=new String(a);
String e=new String(b);
if(d.equals(e)){
    System.out.println("Anagram");
}else {
    System.out.println("Not a Anagram");
}
    }
}