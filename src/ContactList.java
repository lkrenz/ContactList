/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class ContactList
{
    // TODO: Create your array contacts
    private ArrayList<Person> contacts;
    // TODO: Write a Constructor

    public ContactList()
    {
        this.contacts = new ArrayList<Person>();
    }
    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact() {
        // TODO: Complete the addContact method
        Scanner s = new Scanner(System.in);
        int type;
        String firstName;
        String lastName;
        String phoneNumber;

        System.out.println("Select a type of contact to add: "
                + "\n Student: 1\n Worker: 2");
        type = s.nextInt();
        System.out.println("Please fill in the following information");
        System.out.println("First Name: ");
        firstName = s.nextLine();
        System.out.println("Last Name: ");
        lastName = s.nextLine();
        System.out.println("Phone Number: ");
        phoneNumber = s.nextLine();
        if (type = 1)
        {
            System.out.println("Grade: ");
            contacts.add(new Student(firstName, lastName, phoneNumber, s.nextInt());
        }
        else if (type = 2)
        {
            System.out.println("Salary: ");
            contacts.add(new Worker(firstName, lastName, phoneNumber, s.nextInt());
        }

    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        for (Person p : contacts)
        {
            System.out.println(p);
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method
        for (int i = 0; i < contacts.size() - 1; i++)
        {
            for (int j = 0; j < contacts.size() - i; j++)
            {
                if (sortBy == 0)
                {
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j+1).getFirstName()) == 1)
                    {
                        contacts.set(j+1, contacts.set(j, contacts.get(j+1)));
                    }
                }
                else if (sortBy == 1)
                {
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j+1).getLastName()) == 1)
                    {
                        contacts.set(j+1, contacts.set(j, contacts.get(j+1)));
                    }
                }
                else
                {
                    if (contacts.get(j).getPhoneNumber().compareTo(contacts.get(j+1).getPhoneNumber()) == 1)
                    {
                        contacts.set(j+1, contacts.set(j, contacts.get(j+1)));
                    }
                }

            }
        }
    }

    // TODO: Write searchByFirstName
    public Person searchByFirstName(String name)
    {
        sort(0);
        String name1 = "";
        while (!name.equals(name1))
        {

        }

    }
    // TODO: Write searchByLastName

    // TODO: Write searchByPhoneNumber

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        // TODO: Complete the listStudents method
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        printMenuOptions();

        // TODO: Complete the run method
    }


    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
