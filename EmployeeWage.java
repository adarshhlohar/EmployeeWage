public class EmployeeWage {
    public static void main(String[] args){
        System.out.println("Welcome To Employee Wage Computation Program");
        int max=1;
        int min=0;
        //case 1:Check Employee is Present or Absent
        int present=(int)(Math.random()*(max-min+1));
        if(present==1){ 
            System.out.println("employee is present");
        } else{
            System.out.println("employee is absent");
        }
    }
}
