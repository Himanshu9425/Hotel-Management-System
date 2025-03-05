package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
  JButton add_Employee, add_Room, add_drivers,logout, back;
    admin(){
      add_Employee = new JButton("Add Employee");
      add_Employee.setBounds(250,230,200,30);
      add_Employee.setBackground(Color.white);
      add_Employee.setForeground(Color.black);
      add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
      add_Employee.addActionListener(this);
      add(add_Employee);

      add_Room = new JButton("Add Room");
      add_Room.setBounds(250,380,200,30);
      add_Room.setBackground(Color.white);
      add_Room.setForeground(Color.black);
      add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
      add_Room.addActionListener(this);
      add(add_Room);

      add_drivers = new JButton("Add Drivers");
      add_drivers.setBounds(250,530,200,30);
      add_drivers.setBackground(Color.white);
      add_drivers.setForeground(Color.black);
      add_drivers.setFont(new Font("Tahoma",Font.BOLD,15));
      add_drivers.addActionListener(this);
      add(add_drivers);

        logout = new JButton("Logout");
        logout.setBounds(10,800,95,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add( logout);

        back = new JButton("Back");
        back.setBounds(110,800,95,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

      ImageIcon l2 = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
      Image l12 = l2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
      ImageIcon imageIcon2 = new ImageIcon(l12);
      JLabel label2 = new JLabel(imageIcon2);
      label2.setBounds(70,340,120,120);
      add(label2);

      ImageIcon l3 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
      Image l112 = l3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
      ImageIcon imageicon3 = new ImageIcon(l112);
      JLabel label3 = new JLabel(imageicon3);
      label3.setBounds(70,500,120,120);
      add(label3);

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
setSize(1950,1090);
setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==add_Employee){
new AddEmployee();
} else if (e.getSource()==add_Room){
new AddRoom();
}
else if(e.getSource()==add_drivers){
new addDriver();
}else if (e.getSource()==logout){
  System.exit(0);
}
else if (e.getSource()==back){
  new Dashboard();
  setVisible(false);
}
    }
    public static void main(String[] args) {
        new admin() {

        };
    }
}
