package employeemanagementsystem;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_Class extends JFrame {

    public Main_Class() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/home.png"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340, 155, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        JButton Add = new JButton("Add Employee");
        Add.setBounds(335, 270, 150, 40);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        img.add(Add);
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new AddEmployee();
            }
        });

        JButton view = new JButton("View Employee");
        view.setBounds(565, 270, 150, 40);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        img.add(view);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ViewEmployee();
            }
        });

        JButton remove = new JButton("Remove Employee");
        remove.setBounds(440, 370, 150, 40);
        remove.setBackground(Color.BLACK);
        remove.setForeground(Color.WHITE);
        img.add(remove);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new RemoveEmployee();
            }
        });

        setTitle("Employee Management System");
        setSize(1120, 630);
        setLocation(250, 100);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main_Class();
    }
}
