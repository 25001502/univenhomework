
import java.awt.*;
import javax.swing.*;

public class homepage2 {
        
    public static void main(String[] args) {

        JFrame frame = new JFrame("Loading information System"); // Create a new JFrame with title "Progress Bar Demo"
        JProgressBar Bar = new JProgressBar(0, 100); // Progress bar with range 0 to 100
    
        Bar.setValue(0); // Set initial value to 0
        Bar.setBounds(7, 20, 420, 20);
        Bar.setStringPainted(true); // Show string on the progress bar
        Bar.setForeground(Color.BLUE); // Set the color of the progress bar to green
        Bar.setBackground(Color.LIGHT_GRAY); // Set the background color of the progress bar to black
        Bar.setFont(new Font("Arial", Font.BOLD, 20)); // Set font of the progress bar text
        
        frame.add(Bar); // Add progress bar to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setSize(500, 150); // Set the size of the frame
        frame.setLayout(null); // Set layout to null 
        frame.setVisible(true); // Make the frame visible
        frame.setBounds(500, 300, 450, 120);
    
        for (int i = 0; i <= 100; i++) { // Loop from 0 to 100
            try {
                Thread.sleep(50); // Sleep for 50 milliseconds
                Bar.setValue(i); // Set the value of the progress bar to i
            } catch (InterruptedException e) { // Catch interrupted exception
                e.printStackTrace(); // Print stack trace
            }
            if (i == 100) { // If progress is complete
                Bar.setString("Loading Complete"); // Set the string to "Loading Complete"
            } else {
                Bar.setString("Loading " + i + "%"); // Set the string to "Loading i%"
            }
    
            
        
    
    
        }
        
        frame.dispose(); // Dispose the frame
       // System.exit(0);
        


       
        JOptionPane.showMessageDialog(null, "WELCOME TO OUR PAGE");
        JOptionPane.showMessageDialog(null, "We would like you to provide us with some information about yourself");
        main2(args);
        
       

    }

    
public static void main2(String[] args) {
    String name= JOptionPane.showInputDialog("Enter your name");
    String surname= JOptionPane.showInputDialog("Enter your surname");
    String gender= JOptionPane.showInputDialog("Enter your gender");
    switch (gender.toLowerCase()) {
        case "male":
        JOptionPane.showMessageDialog(null, "You selected Male as your gender.");
        break;
        case "female":
        JOptionPane.showMessageDialog(null, "You selected Female as your gender.");
        break;
        default:
        JOptionPane.showMessageDialog(null, "That's not a valid gender!");
        main2(args); // Restart the input process
        return;}
    
        

        if(name.isEmpty() || surname.isEmpty() || gender.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your name, surname and gender");
            main2(args);
            System.exit(0);}
        
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        if(age <18){

            if(gender.equals("male") ){
                
                JOptionPane.showMessageDialog(null, name + " " + surname + " " + "You are a small boy");
            }else{
                JOptionPane.showMessageDialog(null, name + " " + surname + " " + "You are a small girl");}

        }else{
            if(gender.equals("male") ){
                
                JOptionPane.showMessageDialog(null, name + " " + surname + " " + "You are a fully grown Man");
                JOptionPane.showMessageDialog(null, "Mr " + name + " " + surname + " You are welcome to our page");
                String email = JOptionPane.showInputDialog(null, "Mr " + name + " " + surname + " Enter your email address");
                while (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                    email = JOptionPane.showInputDialog(null, "Invalid email address. Please enter a valid email address:");
                }
                String contact= JOptionPane.showInputDialog("Enter your contact number");
                while (!contact.matches("^[0-9]{10}$")) {
                    contact = JOptionPane.showInputDialog(null, "Invalid contact number. Please enter a valid contact number:");
                }
                JOptionPane.showMessageDialog(null,"Thank you Mr " +name + " " + surname + " " + "we will contact you after 2 days");
            } else {
                JOptionPane.showMessageDialog(null, name + " " + surname + " " + "You are a fully grown Woman");
                JOptionPane.showMessageDialog(null, "Mrs " + name + " " + surname + " You are welcome to our page");
                String email = JOptionPane.showInputDialog(null, "Mrs " + name + " " + surname + " Enter your email address");
                while (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                    email = JOptionPane.showInputDialog(null, "Invalid email address. Please enter a valid email address:");
                }
                String contact= JOptionPane.showInputDialog("Enter your contact number");
                while (!contact.matches("^[0-9]{10}$")) {
                    contact = JOptionPane.showInputDialog(null, "Invalid contact number. Please enter a valid contact number:");
                }
                JOptionPane.showMessageDialog(null,"Thank you Mrs " +name + " " + surname + " " + "we will contact you after 2 days");
            }
        } 
    }
    
}

    


