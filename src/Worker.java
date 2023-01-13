public class Worker extends Person{
    private int salary;

    public Worker(String firstName, String lastName, String phoneNumber, int salary)
    {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString()
    {
        return super.toString() + " Salary: " + salary;
    }
}
