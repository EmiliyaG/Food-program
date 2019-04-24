package system.ui.loginscreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPasswordForm {
    private JTextField username;
    private JTextField name;
    private JTextField answerToSecurityQuestion;
    private JTextField password;
    private JButton showPasswordButton;
    private JButton backButton;


    public ForgotPasswordForm() {
//        backButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        showPasswordButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
    }

        public void createForm () {
            JFrame frame = new JFrame("ForgotPasswordForm");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            JPanel panel = new JPanel();
            JLabel lblUsername = new JLabel("Username:");
            JLabel lblName = new JLabel("Name:");
            JLabel lblAnswer = new JLabel("Answer to the security question:");
            JLabel lblPassword = new JLabel("Password: ");
            JTextField txtUsername = new JTextField(20);
            JTextField txtName = new JTextField(20);
            JTextField txtAnswer = new JTextField(20);
            JTextField txtPassword = new JTextField(20);
            showPasswordButton = new JButton("Show password");
            backButton = new JButton("Back");
            panel.add(lblUsername);
            panel.add(txtUsername);
            panel.add(lblName);
            panel.add(txtName);
            panel.add(lblAnswer);
            panel.add(txtAnswer);
            panel.add(lblPassword);
            panel.add(txtPassword);
            panel.add(showPasswordButton);
            panel.add(backButton);


            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.setSize(200, 200);

            implementBtnsAction();

        }

        private void implementBtnsAction () {
            showPasswordButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

        }
    }


