import javax.swing.*;

public class login {
    private String storedUsername;
    private String storedPassword;
    private String firstName;
    private String lastName;


    public void registerUser(String firstName, String lastName,String username,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.storedPassword = password;
        this.storedUsername = username;
        JOptionPane.showMessageDialog(null, "User successfully registered: ");
    }
    public boolean checkUserName(){
        return storedUsername.contains("_")&& storedUsername.length()<=5;}

    public boolean checkPasswordComplexity() {

        return storedPassword.length() >= 8 &&
                storedPassword.matches(".*[A-Z].*") &&
                storedPassword.matches(".*[0-9].*") &&
                storedPassword.matches(".*[!@#$%^&*()+-=].*");
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return storedUsername.equals(enteredUsername) && storedPassword.equals(enteredPassword);
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword){
        if(loginUser(enteredUsername, enteredUsername)) {
            return "Welcome" + firstName + " " + lastName + ",its great to see you again.";
        }
        else{
            return "Username or password incorrect, please try again.";
        }

    }
}
