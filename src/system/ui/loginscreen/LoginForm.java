package system.ui.loginscreen;

import system.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JButton loginButton;
    private JButton createNewAccountButton;
    private JButton forgotPasswordButton;
    private App app;
    private system.ui.loginscreen.RegisterForm registerForm;
    private system.ui.loginscreen.ForgotPasswordForm forgotPasswordForm;

    public void setApp(App app) {
        this.app = app;
    }

    public LoginForm() {
        createForm();
    }

    public void setRegisterForm() {

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
        createNewAccountButton = new JButton("Create new account");
        forgotPasswordButton = new JButton("Forgot password");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app = new App();
                app.callApp();
            }
        });
        createNewAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm = new system.ui.loginscreen.RegisterForm();
                registerForm.createForm();

            }
        });

        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forgotPasswordForm = new system.ui.loginscreen.ForgotPasswordForm();
                forgotPasswordForm.createForm();
            }
        });
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(loginButton);
        panel.add(createNewAccountButton);
        panel.add(forgotPasswordButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(200, 200);

        implementBtnsAction();

    }

    private void implementBtnsAction() {
        loginButton.addActionListener(e -> {
        });
        createNewAccountButton.addActionListener(e -> createNewAccountButton.addActionListener(arg0 -> new system.ui.loginscreen.RegisterForm()));

        forgotPasswordButton.addActionListener(e -> forgotPasswordButton.addActionListener(arg0 -> new system.ui.loginscreen.ForgotPasswordForm()));


    }
}
