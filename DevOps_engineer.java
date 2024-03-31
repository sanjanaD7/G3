class DevOps_engineer extends Employee
{
    float bonus;
    float total_salary;

    public DevOps_engineer(String name, int id, float salary) {
        super(name, id, salary);
    }
    void compute_salary(double bonus)
    {
        bonus = (super.salary * bonus * 0.01);
        total_salary = (float) (super.salary + bonus);
    }
    void display_details()
    {
        System.out.println("Employee details: ");
        System.out.println("Nmae: "+super.name);
        System.out.println("Id: "+super.id);
        System.out.println("Salary: "+super.salary);
        System.out.println("Total Salary: "+total_salary);
    }
    public static void main(String[] args) {
        DevOps_engineer de = new DevOps_engineer("sanjana", 054, 90000 );
        de.compute_salary(10);
        de.display_details();
    }
}
