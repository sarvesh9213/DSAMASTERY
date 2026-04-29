import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends Frame implements ActionListener {

    Label l1, l2;
    TextField t1, t2;
    Button b;

    LoginWindow() {
        // Labels
        l1 = new Label("Username:");
        l2 = new Label("Password:");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t2.setEchoChar('*'); // hide password

        // Button
        b = new Button("Login");

        // Set bounds
        l1.setBounds(50, 50, 80, 30);
        t1.setBounds(150, 50, 150, 30);

        l2.setBounds(50, 100, 80, 30);
        t2.setBounds(150, 100, 150, 30);

        b.setBounds(120, 160, 80, 30);

        // Add components
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        // Button event
        b.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setTitle("Login Window");
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Login Button Clicked");
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}