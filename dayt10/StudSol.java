import java.util.*;
class Student{
 private int  rollNo ;
 private String name ; 
private String subject;
private char grade ;
private String date;
public void setrollNo(int rollNo){
    this.rollNo=rollNo;
}
public int getrollNo(){
    return this.rollNo;
}
public void setname(String name){
    this.name=name;
}
public String getname(){
    return this.name;
}
public void setsubject(String subject){
    this.subject=subject;
}
public String getsubject(){
    return this.subject;
}
public void setgrade(char grade){
    this.grade=grade;

}
public char getgrade(){
    return this.grade;
}
public void setdate(String date){
    this.date=date;
}
public String getdate(){
return this.date;
}
}
class StudSol{
  public static Student[]  findStudentByGradeAndMonth(Student[] stud,char grade,int month){
Student[] st=new Student[0];
for(Student s:stud){
      String[] arr = s.getdate().split("/");
    int mon = Integer.parseInt(arr[1]);
    // int mon=Integer.parseInt(s.getMonth());
if(s.getgrade()==grade && mon==month){
st=Arrays.copyOf(st,st.length+1);
st[st.length-1]=s;
}
}
if(st.length==0) return null




;
Arrays.sort(st,Comparator.comparingInt(Student::getrollNo));
return st;
  }
  public  static void main(String []args){
Scanner sc=new Scanner(System.in);
Student[] s=new Student[4];
for(int i=0;i<4;i++){
    s[i]=new Student();
    s[i].setrollNo(sc.nextInt());
      s[i].setname(sc.next());
    s[i].setsubject(sc.next());
    // sc.nextLine();
    s[i].setgrade(sc.next().charAt(0));
    s[i].setdate(sc.next());
  
}
char grade=sc.next().charAt(0);
int month=sc.nextInt();
Student[] sol=findStudentByGradeAndMonth(s, grade, month);
int c=0;
if(sol.length==0){
    System.out.print(0);
    return;
}
for(Student p:sol){
    System.out.println(p.getname());
    System.out.println(p.getsubject());
    // System.out.println(p.);\
    c++;
}
System.out.println(c);
  }
}