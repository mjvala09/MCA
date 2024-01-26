
class Employee{
    String firstName, lastName;
    double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary < 0){
            this.monthlySalary = 0;
        }else{
            this.monthlySalary = monthlySalary;
        }
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getMonthlySalary(){
        if(monthlySalary < 0){
            monthlySalary = 0;
            return monthlySalary;
        }else{
            return this.monthlySalary;
        }
    }
    public double raiseByTen(){
        double ten=(this.monthlySalary * 10)/100;
        double raise = (this.monthlySalary + ten);
        return raise;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("MCA","IT",35000);
        System.out.println("Name : " + e1.getFirstName() +" "+ e1.getLastName());
        System.out.println("Monthly Salary : " + e1.getMonthlySalary());
        System.out.println("Yearly Package : " + (12 * e1.getMonthlySalary()));
        System.out.println("After give the 10% reise "+(12 * e1.raiseByTen()));

        System.out.println("--------------------------");
        Employee e2 = new Employee("BCA","IT",25000);
        System.out.println("Name : " + e2.getFirstName() +" "+ e2.getLastName());
        System.out.println("Monthly Salary : " + e2.getMonthlySalary());
        System.out.println("Yearly Package : " + (12 * e2.getMonthlySalary()));
        System.out.println("After give the 10% reise "+(12 * e2.raiseByTen()));
    }
}