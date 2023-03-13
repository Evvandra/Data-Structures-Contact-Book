package assignment;
import java.util.*;
class Contact {
    String name;
    String email;
    String PhoneNumber;


    public Contact(String name, String email, String PhoneNumber) {
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

}

public class contactbook {
    static LinkedList<Contact> LList = new LinkedList<>();

    static void Add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String Name = sc.nextLine();


        System.out.println("Enter Email Address: ");
        String Email = sc.nextLine();


        System.out.println("Enter Phone Number: ");
        String PhoneNumber = sc.nextLine();
        LList.add(new Contact(Name, Email, PhoneNumber));

    }

    static void Delete(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact that wants to be deleted: ");
        String result = scan.next();

        for (Contact c: LList){

            if(result.equals(c.name)){
                LList.remove(c);
                System.out.println("Contact successfully deleted!");
            }

            else if (LList.indexOf(c) == LList.size() - 1) {
                System.out.println("Contact not found, please enter the correct contact: ");
            }

        }

    }

    static void EmailSearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String input = scanner.next();

        for (Contact c: LList){

            if (input.equals(c.email)){
                System.out.println("Email founded, the email is " + c.email);
            }

            else if (LList.indexOf(c) == LList.size() - 1) {
                System.out.println("The email is not founded, please try again: ");
            }

        }

    }

    static void PrintList(){
        for (Contact b: LList){
            System.out.println("Name: " + b.name);
            System.out.println("Email: " + b.email);
            System.out.println("Phone number: " + b.PhoneNumber);
        }
    }

    static void SearchList(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to search for: \n" +
                "(N)ame\n" +
                "(E)mail\n" +
                "(P)hone number\n" +
                "Choose an option: ");

        String output = scan.next();

        if (output == "N"){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name that wants to be searched: ");
            String input = scanner.next();

            for (Contact c: LList){

                if (input.equals(c.name)){
                    System.out.println("name found, Name = " + c.name);
                }

                else if (LList.indexOf(c) == LList.size() - 1) {
                    System.out.println("The name is not found, please try again: ");
                }

            }
        }
        else if (output == "E") {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Email that wants to be searched: ");
            String input = scanner.next();

            for (Contact c: LList){

                if (input.equals(c.email)){
                    System.out.println("Email founded, Email address = " + c.email);
                }

                else if (LList.indexOf(c) == LList.size() - 1) {
                    System.out.println("The email is not found, please try again: ");
                }

            }
        }
        else if (output == "P") {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter phone number: \n");
            String input = scanner.next();

            for (Contact c: LList){

                if (input.equals(c.PhoneNumber)){
                    System.out.println("Phone number found, Phone number =  " + c.PhoneNumber) ;
                }

                else if (LList.indexOf(c) == LList.size() - 1) {
                    System.out.println("The phone number is not found, please try again: ");
                }

            }
        }

        else {
            System.out.println("Option is unavailable, please enter a valid and existing command: ");
        }


    }

    public static void main(String[] args) {


        boolean condition = true;

        while (condition) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n==========Menu=========\n" +
                    "(A)dd\n" +
                    "(D)elete\n" +
                    "(E)mail search\n" +
                    "(P)rint list\n" +
                    "(S)earch\n" +
                    "(Q)uit program\n" +
                    "=======================\n" +
                    "Please enter a command: ");

            String menu  = scan.next().toUpperCase();


            switch (menu) {
                case "A":
                    Add();
                    break;
                case "D":
                    Delete();
                    break;
                case "E":
                    EmailSearch();
                    break;
                case "P":
                    PrintList();
                    break;
                case "S":
                    SearchList();
                    break;
                case "Q":
                    System.out.println("\nExiting Program!");
                    condition = false;
                    break;
                default:
                    System.out.println("Invalid input, please enter a command based on the list: ");

            }
        }
    }
}
