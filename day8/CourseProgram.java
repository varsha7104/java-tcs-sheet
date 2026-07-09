import java.util.*;
class Course{
private   int  courseId;
private String courseName;
private String courseAdmin ;
private int quiz; 
 private int handson ;

 public void setcourseId(int courseId){
    this.courseId=courseId;
 }
 public int getcourseId(){
    return this.courseId;

 }


 
 public void setcourseName(String courseName){
    this.courseName=courseName;
 }
 public String getcourseName(){
    return this.courseName;
    
 }
 
 public void setcourseAdmin(String courseAdmin){
    this.courseAdmin=courseAdmin;
 }
 public String getcourseAdmin(){
    return this.courseAdmin;
    
 }
 
 public void setquiz(int quiz){
    this.quiz=quiz;
 }
 public int getquiz(){
    return this.quiz;
    
 }

  public void sethandson(int handson){
    this.handson=handson;
 }
 public int gethandson(){
    return this.handson;
    
 }
 
}
 class CourseProgram{
public static  int findAvgOfQuizByAdmin(Course[] cour,String value){
    int sum=0;
    int count=0;
for(Course c:cour){
    if(c.getcourseAdmin().equals(value)){
sum+=c.getquiz();
count++;
    }
}
if(count==0) return 0;
return sum/count;
 }
 public static Course[] sortCourseByHandsOn(Course[] cour,int value){
    Course []f=new Course[0];
    for(Course c:cour){
        if(c.gethandson()<value){
f=Arrays.copyOf(f,f.length+1);
f[f.length-1]=c;
        }
    }
    if(f.length==0){
        return null;
    }
  Arrays.sort(f, Comparator.comparingInt(Course::gethandson));
    return f;

 }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Course[] c=new Course[4];
    for(int i=0; i<4; i++){
         c[i] = new Course(); 
c[i].setcourseId(sc.nextInt());
sc.nextLine();
c[i].setcourseName(sc.nextLine());
c[i].setcourseAdmin(sc.nextLine());
c[i].setquiz(sc.nextInt());
c[i].sethandson(sc.nextInt());
sc.nextLine();
    }

    	String admin = sc.nextLine();
		int hand = sc.nextInt();
		
		int ans1 = findAvgOfQuizByAdmin(c, admin);
		if(ans1!=0)
		{
			System.out.println(ans1);
		}
		else
		{
			System.out.println("No Course found");
		}
		
		Course[] ans2 = sortCourseByHandsOn(c, hand);
		if(ans2!=null)
		{
			for(int i=0; i<ans2.length; i++)
			{
				System.out.println(ans2[i].getcourseName());
			}
		}
		else
		{
			System.out.println("No Course found with mentioned attribute.");
		}
 }
 }