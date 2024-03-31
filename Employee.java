public class Employee
{
    String name;
    int id;
    float salary;

    public Employee(String name, int id, float salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Employee details: ");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("sanjana", 054, 90000);
        e1.display();
    }
}