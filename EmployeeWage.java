public class EmployeeWage {
    public static void main(String[] args){
        System.out.println("Welcome To Employee Wage Program");
        int max=1;
        int min=0;
        //case 1:Checking Employee is Present or Absent
        int present=(int)(Math.random()*(max-min+1));
        if(present==1){ 
            System.out.println("employee is present");
        } else{
            System.out.println("employee is absent");
        }
        int wage_per_hr = 20;//per hr pay
        int full_day_hr = 8;//total no of hrs
        //case 2:Calculate Daily Employee Wage
        present = (int) (Math.random()*(max-min+1));
        if (present == 1) {
            System.out.println("employee is present");
            int salary=(wage_per_hr*full_day_hr);
            System.out.println("salary is:"+salary);
        }
        else{
            System.out.println("employee is absent and salary is zero");
        }
        //case 3:Add Part time Employee & Wage
        wage_per_hr = 20;//per hr pay
        int full_time = (int) (Math.random()*(max-min+1));//case 3:Add Part time Employee & Wage
        if (full_time == 1) {
            System.out.println("full time employee");
            int full_time_hrs=16;
            int salary=(wage_per_hr*full_time_hrs);
            System.out.println("salary is:"+salary);
        }
        else{
            System.out.println("part time employee"); 
            int part_time_hrs=8;
            int salary=(wage_per_hr*part_time_hrs);
            System.out.println("salary is:"+salary);
        }
    }
}
