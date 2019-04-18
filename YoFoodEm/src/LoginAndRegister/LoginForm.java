package src.LoginAndRegister;

import LoginAndRegister.RegisterForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JButton createNewAccountButton;
    private JButton forgotPasswordButton;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        createNewAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        LoginForm gui = new LoginForm();
        gui.createForm();
    }

    public void createForm() {
        JFrame frame = new JFrame("LoginForm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        JTextField txtUsername = new JTextField(20);
        JTextField txtPassword = new JTextField(20);
        loginButton = new JButton("Login");
        createNewAccountButton = new JButton( "Create new account");
        forgotPasswordButton = new JButton("Forgot password");
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(loginButton);
        panel.add(createNewAccountButton);
        panel.add (forgotPasswordButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(200, 200);

        implementBtnsAction();

    }

    private void implementBtnsAction() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        createNewAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
    }


