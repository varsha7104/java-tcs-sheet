import java.util.*;
class Student{
    private int StudentId;
    private String StudentName;
    private double marks;
    private String subject;
    public void setStudentId(int StudentId){
        this.StudentId=StudentId;
    }
    public int getStudentId(){
        return this.StudentId;
    }
public void setStudentName(String StudentName){
    this.StudentName=StudentName;
}
public String getStudentName(){
    return this.StudentName;
}
public void setmarks(double marks){
    this.marks=marks;
}
public double getmarks(){
    return this.marks;
}
public void setSubject(String subject){
this.subject=subject;
}
public String getSubject(){
    return this.subject;
}
public char getGrade(int marks){
    if(marks>=90){
        return 'A';
    }
    else if (marks>=75){
        return 'B';

    }
    else if (marks>=60){
        return 'C';
    }
    else if(marks>=50){
        return 'D';
    }else return 'F';
}
}
class StudSolution{
public static List<Student> getTopStudentsBySubject(Student[] arr,String subject){
   List<Student>l= new ArrayList<>();
for(Student s:arr){
    if(s.getSubject().equals(subject)){
l.add(s);
    }
}
l.sort((a,b)->Double.compare(b.getmarks(), a.getmarks()));

    return l;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Student[] s=new Student[5];
    for(int i=0;i<5;i++){
        s[i]=new Student();
        s[i].setStudentId(sc.nextInt());
        s[i].setStudentName(sc.next());
        s[i].setmarks(sc.nextDouble());
        s[i].setSubject(sc.next());
    }
    String sub=sc.next();
    List<Student>si=getTopStudentsBySubject(s,sub);
    for(Student sy:si){
        System.out.print(sy.getStudentName());
    }
}
}