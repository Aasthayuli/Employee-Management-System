package employeemanagementsystem;

import java.awt.Image;
import javax.swing.*;
import java.awt.Font;

public class splash extends JFrame {
    splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(
                "icon/front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);

        JLabel text = new JLabel("Employee Management System");
        text.setBounds(300, 100, 500, 50);
        text.setFont(new Font("serif", Font.BOLD, 35));
        image.add(text);

        setSize(1170, 650);
        setLocation(200, 100);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new splash();
    }
}