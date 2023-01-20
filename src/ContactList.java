/**
 * A class that stores a list of people objects in
 * an ArrayList called contacts
 * Created by Liam Krenz
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ContactList
{
    // TODO: Create your array contacts
    private final ArrayList<Person> contacts;
    // TODO: Write a Constructor

    //Constructs a new ContactList object and instantiates an empty contacts arraylist
    public ContactList()
    {
        this.contacts = new ArrayList<>();
    }

    //Prints the different functions of the contact list
    public static void printMenuOptions() {
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

    //Prompts the user for the necessary data to add a new contact to contacts
    public void addContact() {
        Scanner s = new Scanner(System.in);
        //Type determines weather the person added is a Student or a Worker
        int type;
        String firstName;
        String lastName;
        String phoneNumber;

        //Prompts the user for the necessary information
        System.out.println("Select a type of contact to add: "
                + "\nStudent: 1\nWorker: 2");
        type = s.nextInt();
        s.nextLine();
        System.out.println("Please fill in the following information");
        System.out.println("First Name: ");
        firstName = s.nextLine();
        System.out.println("Last Name: ");
        lastName = s.nextLine();
        System.out.println("Phone Number: ");
        phoneNumber = s.nextLine();
        //Adds the inputted information to a new Student or Worker in contacts
        if (type == 1)
        {
            System.out.println("Grade: ");
            contacts.add(new Student(firstName, lastName, phoneNumber, s.nextInt()));
        }
        else if (type == 2)
        {
            System.out.println("Salary: ");
            contacts.add(new Worker(firstName, lastName, phoneNumber, s.nextInt()));
        }
    }

    //Iterates through contacts and prints every contact
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
            for (int j = 0; j < contacts.size() - (i + 1); j++)
            {
                if (sortBy == 0)
                {
                    //If sortBy equals 0, contacts is sorted by first name
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j+1).getFirstName()) > 0)
                    {
                        contacts.set(j+1, contacts.set(j, contacts.get(j+1)));
                    }
                }
                else if (sortBy == 1)
                {
                    //If sortBy equals 1, contacts is sorted by last name
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j+1).getLastName()) > 0)
                    {
                        contacts.set(j+1, contacts.set(j, contacts.get(j+1)));
                    }
                }
                else
                {
                    //If sortBy equals 2, contacts is sorted by phone number
                    if (contacts.get(j).getPhoneNumber().compareTo(contacts.get(j+1).getPhoneNumber()) > 0)
                    {
                        contacts.set(j+1, contacts.set(j, contacts.get(j+1)));
                    }
                }
            }
        }
    }


    //Iterates through contacts and returns the first contact with a matching first name
    public Person searchByFirstName()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a First Name: ");
        String name = s.nextLine();
        for (Person p : contacts)
        {
            if (name.equals(p.getFirstName()))
                return p;
        }
        System.out.println(name + " is not in this list.");
        return null;
    }

    //Iterates through contacts and returns the first contact with a matching first name
    public Person searchByLastName()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Last Name: ");
        String name = s.nextLine();
        for (Person p : contacts)
        {
            if (name.equals(p.getLastName()))
                return p;
        }
        System.out.println(name + " is not in this list.");
        return null;
    }

    //Iterates through contacts and returns the first contact with a matching first name
    public Person searchByPhoneNumber()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Phone Number: ");
        String number = s.nextLine();
        for (Person p : contacts)
        {
            if (number.equals(p.getPhoneNumber()))
                return p;
        }
        System.out.println(number + " is not in this list.");
        return null;
    }

    //Lists just the Student objects stored in contacts
    public void listStudents() {
        // TODO: Complete the listStudents method
        for (Person p : contacts)
        {
            if (p instanceof Student)
            {
                System.out.println(p);
            }
        }
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        Scanner s = new Scanner(System.in);
        int input = Integer.MAX_VALUE;
        System.out.println("Welcome to your Contacts List");
        //Provides options to the user until they exit
        while (input != 0)
        {
            System.out.println("Please pick from the following menu options");
            printMenuOptions();
            input = s.nextInt();
            if (input == 0)
                break;
            if (input == 1)
            {
                //Adds a specified contact to contacts and then waits for the user to click return
                addContact();
                waiting();
            }
            if (input == 2)
            {
                //Sorts contacts by first name and then lists the ordered contacts
                sort(0);
                printContacts();
                waiting();
            }
            if (input == 3)
            {
                //Sorts contacts by last name and then lists the ordered contacts
                sort(1);
                printContacts();
                waiting();
            }
            if (input == 4)
            {
                //Sorts contacts by phone number and then lists the ordered contacts
                sort(2);
                printContacts();
                waiting();
            }
            if (input == 5)
            {
                //Lists the Student objects in contacts
                listStudents();
                waiting();
            }
            if (input == 6)
            {
                //Searches for a contact with the provided first name
                Person p = searchByFirstName();
                if (p != null)
                {
                    System.out.println(p);
                }
                waiting();
            }
            if (input == 7)
            {
                //Searches for a contact with the provided last name
                Person p = searchByLastName();
                if (p != null)
                {
                    System.out.println(p);
                }
                waiting();
            }
            if(input == 8)
            {
                //Searches for a contact with the provided last name
                Person p = searchByPhoneNumber();
                if (p != null)
                {
                    System.out.println(p);
                }
                waiting();
            }
        }
    }

    /**
     * Waits for the user to press enter to avoid
     * printing the menu options until they are ready
     */
    public void waiting()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Press Enter to Continue");
        s.nextLine();
    }

    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
