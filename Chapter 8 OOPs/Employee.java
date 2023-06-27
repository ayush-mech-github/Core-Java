class Employee_Details {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Employee {

    public static void main(String[] args) {
        Employee_Details e1 = new Employee_Details();
        e1.setName("Ayush Tripathi");
        e1.salary = 30000;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}