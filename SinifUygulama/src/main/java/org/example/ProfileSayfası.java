package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfileSayfası {
    JFrame frame = new JFrame();

    JLabel isimLabel = new JLabel("İsim: Fatih Sultan Mehmet");

    ProfileSayfası(){
        frame.add(isimLabel);
        frame.setTitle("Profile Sayfası");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
