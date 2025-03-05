package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    JButton btnroom,btndepartment,btnEI,btnMI;
    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1650,980);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,980);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(300,20,800,800);
        panel.add(l1);
        getContentPane().setBackground(Color.white);
setSize(1950,1090);
setVisible(true);

btnroom = new JButton("Room");
btnroom.setBounds(30,70,200,30);
btnroom.setBackground(Color.black);
btnroom.setForeground(Color.white);
panel1.add(btnroom);
btnroom.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            new Room();
        }catch(Exception E){
            E.printStackTrace();
        }
    }
});

         btndepartment = new JButton("Department");
        btndepartment.setBounds(30, 110, 200, 30);  // Set button position
        btndepartment.setBackground(Color.black);    // Set button background color
        btndepartment.setForeground(Color.white);    // Set button text color
        panel1.add(btndepartment);  // Add the button to the panel

        // Add ActionListener for button click
        btndepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();  // Open new Department window (ensure this class exists)
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnEI = new JButton("All Employee Info");
        btnEI.setBounds(30, 150, 200, 30);  // Set button position
        btnEI.setBackground(Color.black);    // Set button background color
        btnEI.setForeground(Color.white);    // Set button text color
        panel1.add(btnEI);  // Add the button to the panel

        // Add ActionListener for button click
        btnEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();  // Open new Department window (ensure this class exists)
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnMI = new JButton("Manager Info");
        btnMI.setBounds(30, 230, 200, 30);  // Set button position
        btnMI.setBackground(Color.black);    // Set button background color
        btnMI.setForeground(Color.white);    // Set button text color
        panel1.add(btnMI);  // Add the button to the panel

        // Add ActionListener for button click
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();  // Open new Department window (ensure this class exists)
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/admin.gif"));
Image i5 = i4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
ImageIcon i6 = new ImageIcon(i5);
JLabel l2 = new JLabel(i6);
l2.setBounds(300,250,800,800);
panel1.add(l2);
    }

    public static void main(String[] args) {
        new Reception();
    }

}
