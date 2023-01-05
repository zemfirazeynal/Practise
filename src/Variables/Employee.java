package Variables;

public class Employee {
    public String position;
    int salary;


    public Employee() {
        this.position = "engineer";
        this.salary = 1500;
    }

    public static void main (String [] args){
        Employee employee = new Employee();
        System.out.println("This employee's position "+employee.position);
        System.out.println("This employee's position "+employee.salary);

    }


}
