import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main   {

    private static JFrame frame;
    private static JTextField username, password;

    private static JLabel loginTitle, mainScreenTitle;

    private static JButton button;


     public static void main( String[] args) {


         frame
                = new JFrame(); // creating instance of JFrame

         loginTitle = new JLabel("Login");
         loginTitle.setBounds(150,100,220,30);

         username = new JTextField("Username");
         username.setBounds(150,120, 220,30);

          password = new JTextField("Password");
         password.setBounds(150,160, 220,30);


          button = new JButton(
                " Login"); // creating instance of

        // JButton
         button.setBounds(
                 150, 200, 220,
                 50); // x axis, y axis, width, height

         button.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 mainScreen();
             }
         } );

         frame.add(button); // adding button in JFrame

         frame.add(username); // adding button in JFrame

         frame.add(password); // adding button in JFrame

        frame.setSize(500, 600); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true);
    }


    public static void mainScreen() {


        frame
                = new JFrame(); // creating instance of JFrame


        username = new JTextField("New");
        username.setBounds(150,120, 220,30);

        password = new JTextField("New");
        password.setBounds(150,160, 220,30);


        button = new JButton(
                " Login"); // creating instance of

        // JButton
        button.setBounds(
                150, 200, 220,
                50); // x axis, y axis, width, height

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainScreen();
            }
        } );

        frame.add(button); // adding button in JFrame

        frame.add(username); // adding button in JFrame

        frame.add(password); // adding button in JFrame

        frame.setSize(500, 600); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true);


    }


}
