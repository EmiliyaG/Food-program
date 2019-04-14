package foodapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btnExit extends Panels{
    public static void makeBtnExit() {
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnExit.setBounds(113, 80, 154, 30);
        taxPanel.add(btnExit);
    }
}
