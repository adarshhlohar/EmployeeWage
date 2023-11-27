import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Program");
        int max = 1;
        int min = 0;
        System.out.println(
                "Enter the 1. for checking the Empolyee is present or absent \n2. for the Calculate Daily Employee Wage\n3. Add Part time Employee & Wage \n4.Calculating Wages for a Month");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {

            case 1:
                // case 1:Checking Employee is Present or Absent
                int present = (int) (Math.random() * (max - min + 1));
                if (present == 1) {
                    System.out.println("employee is present");
                } 
                else {
                    System.out.println("employee is absent");
                }

            case 2:
                int wage_per_hr = 20;// per hr pay
                int full_day_hr = 8;// total no of hrs
                // case 2:Calculate Daily Employee Wage
                present = (int) (Math.random() * (max - min + 1));
                if (present == 1) {
                    System.out.println("employee is present");
                    int salary = (wage_per_hr * full_day_hr);
                    System.out.println("salary is:" + salary);
                } 
                else {
                    System.out.println("employee is absent and salary is zero");
                }
            case 3:

                // case 3:Add Part time Employee & Wage
                wage_per_hr = 20;// per hr pay
                int full_time = (int) (Math.random() * (max - min + 1));
                if (full_time == 1) {
                    System.out.println("full time employee");
                    int full_time_hrs = 16;
                    int salary = (wage_per_hr * full_time_hrs);
                    System.out.println("salary is:" + salary);
                } 
                else {
                    System.out.println("part time employee");
                    int part_time_hrs = 8;
                    int salary = (wage_per_hr * part_time_hrs);
                    System.out.println("salary is:" + salary);
                }
                case 4:

                default :
                    System.out.println("You are Entered Wrong input");
        }
    }
}
