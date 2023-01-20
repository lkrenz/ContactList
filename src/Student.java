public class Student extends Person{
    private int grade;

    //Constructs a new Student given a first name, last name, phone number, and grade
    public Student(String firstName, String lastName, String phoneNumber, int grade)
    {
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //Overrides the toString() method in the superclass in order to include the grade value
    @Override
    public String toString()
    {
        return super.toString() + " Grade: " + grade;
    }
}
