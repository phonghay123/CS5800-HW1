class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurity;

    public Employee(String firstName, String lastName, String socialSecurity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurity()
    {
        return socialSecurity;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
    public void print()
    {
        System.out.println("Name: " + firstName + " " + lastName );
        System.out.println("Social Security: " + socialSecurity);
    }
}

class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary)
    {
        super(firstName,lastName,socialSecurity);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weekly Salary: " + weeklySalary);
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;
    public HourlyEmployee(String firstName, String lastName, String socialSecurity, double wage, double hoursWorked){
        super(firstName,lastName,socialSecurity);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Wage: " + wage + " Hours Worked: " + hoursWorked);
    }
}

class CommisionEmployee extends Employee{
    private double commissionRate;
    private double grossSale;

    public CommisionEmployee(String firstName, String lastName, String socialSecurity, double commissionRate, double grossSale){
        super(firstName,lastName,socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Commission Rate: " + commissionRate + "  Gross Sale: " + grossSale);
    }
}
class BaseEmployee extends Employee{
    private double baseSalary;
    public BaseEmployee(String firstName, String lastName, String socialSecurity, double baseSalary)
    {
        super(firstName,lastName,socialSecurity);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Base Salary: " + baseSalary);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Jones","111-11-1111",2500);
       SalariedEmployee secondSalariedEmployee = new SalariedEmployee("Renwa", "Chanel","555-55-5555",1700);
       HourlyEmployee hourlyEmployee = new HourlyEmployee("Stephanie", "Smith","222-22-2222",25,32);
       HourlyEmployee secondHourlyEmployee = new HourlyEmployee("Mary", "Quinn","333-33-3333",19,47);
       CommisionEmployee commisionEmployee = new CommisionEmployee("Nicole","Dior","444-44-4444",0.15,500000);
       CommisionEmployee secondCommisionEmployee = new CommisionEmployee("Nicole","Dior","444-44-4444",0.15,500000);
       BaseEmployee baseEmployee = new BaseEmployee("Mike","Davenport","666-66-6666",95000);

       salariedEmployee.print();
       System.out.println();
       secondSalariedEmployee.print();
       System.out.println();
       hourlyEmployee.print();
       System.out.println();
       secondHourlyEmployee.print();
       System.out.println();
       commisionEmployee.print();
       System.out.println();
       secondCommisionEmployee.print();
       System.out.println();
       baseEmployee.print();
    }
}