package foodapp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Panels extends Design {


    public void setBackgroundPanel() {
//        backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(169, 169, 169));
        backgroundPanel.setBounds(0, 0, 823, 546);
        contentPane.add(backgroundPanel);
        backgroundPanel.setLayout(null);
    }

    public void setTaxPanel() {
        taxPanel = new JPanel();
        taxPanel.setBounds(10, 411, 802, 124);
        taxPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        taxPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(taxPanel);
        taxPanel.setLayout(null);

    }

    public void setFoodAndBevaragesPanel() {
        foodAndBevaragesPanel = new JPanel();
        foodAndBevaragesPanel.setBounds(264, 78, 269, 322);
        foodAndBevaragesPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        foodAndBevaragesPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(foodAndBevaragesPanel);
        foodAndBevaragesPanel.setLayout(null);
    }


}
