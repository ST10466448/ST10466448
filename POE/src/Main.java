import  javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String FirstName;
        String LastName;
        String Username;
        String Password;
        String cellPhoneNumber;

        System.out.println("Enter a FirstName:");
        FirstName = scanner.nextLine();

        System.out.println("Enter a LastName:");
        LastName = scanner.nextLine();

        do {
            System.out.println("Enter a Username:");
            Username = scanner.nextLine();
            if (!Username.contains("_") || Username.length() > 5) {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no longer than five characters in length.");
            }

        }
        while (!Username.contains("_") || Username.length() > 5);
        JOptionPane.showMessageDialog(null, "Username successfully captured.");

        do {
            System.out.println("Enter password:");
            Password = scanner.nextLine();

            if (!isValidPassword(Password)) ;
            {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");

            }
        }
        while (!isValidPassword(Password));
        JOptionPane.showMessageDialog(null, "Password successfully captured.");

        do {
            System.out.println("Enter your cellphone number with international country code");
            cellPhoneNumber = scanner.nextLine();

            if (validateCellphoneNumber(cellPhoneNumber)) {
                JOptionPane.showMessageDialog(null, "Cellphone number successfully added:" + cellPhoneNumber);

            }
        }
            while (validateCellphoneNumber(cellPhoneNumber));
                JOptionPane.showMessageDialog(null, "Cell phone number incorrectly formatted or does not contain international code");
        }




    public static boolean validateCellphoneNumber(String cellPhoneNumber) {
        String regex = "^\\+[0-9]{1,3}[0-9]{1,10}$";
        return Pattern.matches(regex,cellPhoneNumber)&&(cellPhoneNumber.length()-1)<=13;
    }


    public static boolean isValidPassword(String password) {
        return password.length()>=8 &&
                password.matches(".*[A-Z].*")&&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*()+-=].*");
    }
}




