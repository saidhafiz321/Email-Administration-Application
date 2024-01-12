import java.util.Scanner;
 
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "shicompany.com";

    // Contructor to recive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);

        // call a method asking for the department -> return the departmnet
        this.department = setDepartment(); 

        // combine the elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;

        // call a method that returns a random password
        this.password = randomPassword(defultPasswordLength);
        System.out.println("Your password is:" + this.password);

    }
    // Ask the department 
    private String setDepartment(){
        System.out.print("New Worker : " + firstName + ". Department Codes :\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code :");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if(depChoice == 1){ return "Sales";}
        else if(depChoice == 2){ return "Dev";}
        else if(depChoice == 3){ return "Acct";}
        else { return " ";}
    }

    // Generate a random pasword
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#%$";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set a mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set a alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name :" + firstName + " " + lastName + 
                "\nCompany Email :" + email + 
                "\nMailbox Capacity :" + mailboxCapacity + "mb";
    }
}
