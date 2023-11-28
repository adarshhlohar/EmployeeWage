public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Program");
        int max = 1;
        int min = 0;
        // case 1:Checking Employee is Present or Absent
        int present = (int) (Math.random() * (max - min + 1));
        if (present == 1) {
            System.out.println("employee is present");
        } else {
            System.out.println("employee is absent");
        }
        int wagePerHr = 20;// per hr pay
        int full_day_hr = 8;// total no of hrs
        // case 2:Calculate Daily Employee Wage
        present = (int) (Math.random() * (max - min + 1));
        if (present == 1) {
            System.out.println("employee is present");
            int salary = (wagePerHr * full_day_hr);
            System.out.println("salary is:" + salary);
        } else {
            System.out.println("employee is absent and salary is zero");
        }
        // case 3:Add Part time Employee & Wage
        wagePerHr = 20;// per hr pay
        int full_time = (int) (Math.random() * (max - min + 1));
        if (full_time == 1) {
            System.out.println("full time employee");
            int fullTimeHours = 16;
            int salary = (wagePerHr * fullTimeHours);
            System.out.println("salary is:" + salary);
        } else {
            System.out.println("part time employee");
            int partTimeHrs = 8;
            int salary = (wagePerHr * partTimeHrs);
            System.out.println("salary is:" + salary);
        }

        // Use case 4 Solving using Switch Case Statement
        int employeeType;
        max = 1;
        min = 0;
        employeeType = (int) (Math.random() * (max - min + 1));
        wagePerHr = 20;
        int partTimeHrs = 8;
        int fullTimeHours = 16;
        switch (employeeType) {
            case 1:
                System.out.println("part time employee");
                int salary = (wagePerHr * partTimeHrs);
                System.out.println("salary: " + salary);
                break;
            case 2:
                System.out.println("full time employee");
                salary = (wagePerHr * fullTimeHours);
                System.out.println("salary: " + salary);
                break;
            default:
                System.out.println("not an employee");
                break;
        }
        int monthlyPay;
        // Calculating Wages for a Month
        if (employeeType == 0) {
            System.out.println("part time employee");
            int salary = (wagePerHr * partTimeHrs);
            int noOfWeeks = salary * 52;
            monthlyPay = noOfWeeks / 12;
            System.out.println("monthlyPay: " + monthlyPay);
        } else {
            System.out.println("full time employee");
            int salary = (wagePerHr * fullTimeHours);
            int noOfWeeks = salary * 48;
            monthlyPay = noOfWeeks / 12;
            System.out.println("monthlyPay: " + monthlyPay);
        }
    }
}
