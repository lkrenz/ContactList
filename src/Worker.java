public class Worker extends Person{
    private int salary;

    //Constructs a new Worker given a first name, last name, phone number, and salary
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


    //Overrides the toString() method in the superclass in order to include the salary value
    @Override
    public String toString()
    {
        return super.toString() + " Salary: " + salary;
    }
}
