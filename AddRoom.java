package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;

    AddRoom() {
        // Create the panel
        JPanel panel = new JPanel();

        // Set the size and position of the panel
        panel.setBounds(5, 5, 875, 490);

        // Set the background color of the panel to red (RGB: 255, 0, 0)
        panel.setBackground(new Color(3, 45, 45));

        // Set the layout manager to null for absolute positioning
        panel.setLayout(null);

        // Add the panel to the frame
        add(panel);

        JLabel label = new JLabel("Add Rooms");
        label.setBounds(194,10,160,22);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel l1 = new JLabel("Room Number");
        l1.setBounds(64,70,152,22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setForeground(Color.white);
        panel.add(l1);

        t2 = new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.white);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.white);
        panel.add(l3);

        t3 = new JComboBox(new String[]{"Available","Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.white);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.white);
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.white);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);

        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.white);
        panel.add(l5);

        t5 = new JComboBox(new String[]{"Cleaned","Dirty"});
        t5.setBounds(200,190,156,20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.white);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setForeground(Color.white);
        panel.add(l6);

        t6 = new JComboBox(new String[]{"Single Bed","Double Bed"});
        t6.setBounds(200,230,156,20);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t6.setForeground(Color.white);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);

        b1 = new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageicon1 = new ImageIcon(image);
        JLabel label12 = new JLabel(imageicon1);
        label12.setBounds(500,60,300,300);
       panel.add(label12);


        // Set the location and visibility of the frame
        setLocation(20, 200);
        setSize(885, 500);
        setVisible(true);

        // Set the layout manager of the frame to null
        setLayout(null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try{
                con c = new con();
                String room = t2.getText();
                String ava = (String) t3.getSelectedItem();
                String status = (String) t5.getSelectedItem();
                String price = t4.getText();
                String type = (String) t6.getSelectedItem();

                String q = "insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Room Sucessfully Added");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddRoom();  // Create and display the AddRoom frame
    }
}
