import java.util.*;
class Employee{

    private String empId;
    private String empName;
    private double baseSalary;
    public void setEmpId(String empId){
        this.empId=empId;
    }
    public String getEmpId(){
        return this.empId;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public String getEmpName(){
        return this.empName;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }
    double calculateBonus(){
        double salary=this.getBaseSalary();
        return salary*0.10;
    }
}
class Manager extends Employee{
   private int teamSize;
   public void setTeamSize(int teamSize){
    this.teamSize=teamSize;
   }
   public int getTeamSize(){
    return this.teamSize;
   }
   public double calculateBonus(){
   double b= super.calculateBonus();
  double bonus=b+500*this.getTeamSize();
  return bonus;
   }

}
class Solution{
    public static String  getHighestBonus(Employee[] arr){
        double maxi=-1.0;
for(Employee e:arr){
    double salary=e.calculateBonus();
    maxi=Math.max(maxi,salary);

}
for(Employee e:arr){
     double salary=e.calculateBonus();
    if(maxi==salary){
        return e.getEmpName();
    }
}
        return "";
    }
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Manager[] arr = new Manager[5];

    for (int i = 0; i < 5; i++) {

        arr[i] = new Manager();

        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");

        arr[i].setEmpId(parts[0]);
        arr[i].setEmpName(parts[1]);
        arr[i].setBaseSalary(Double.parseDouble(parts[2]));

        if (parts.length == 4) {
            arr[i].setTeamSize(Integer.parseInt(parts[3]));
        } else {
            arr[i].setTeamSize(0);
        }
    }

    String name = getHighestBonus(arr);
    System.out.println(name);
}
}
