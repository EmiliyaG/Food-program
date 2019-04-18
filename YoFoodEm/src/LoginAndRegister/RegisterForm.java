package LoginAndRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm {
    private JTextField usernameField;
    private JTextField nameField;
    private JTextField answerToSecretQuestion;
    private JButton registerButton;
    private JPasswordField passwordField;

//    public RegisterForm() {
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//
//            }
//        });
//}

    public static void main(String[] args) {
        RegisterForm gui = new RegisterForm();
        gui.createForm();
    }
    public void createForm (){
        JFrame frame = new JFrame("RegistrationForm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblName = new JLabel("Name:");
        JLabel lblPassword = new JLabel("Password:");
        JLabel lblSecretQuestion = new JLabel("Secret question: What's your favourite colour?");
        JLabel lblAnswerToSecretQuestion = new JLabel("Answer:");
        JTextField txtUsername = new JTextField(20);
        JTextField txtName = new JTextField(20);
        JTextField txtPassword = new JTextField(20);
        JTextField txtAnswerToSecretQuestion = new JTextField(20);
        registerButton = new JButton("Register");
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(lblSecretQuestion);
        panel.add(lblAnswerToSecretQuestion);
        panel.add(txtAnswerToSecretQuestion);
        panel.add(registerButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(200, 200);

        implementBtnsAction();

    }

    private void implementBtnsAction() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
}
