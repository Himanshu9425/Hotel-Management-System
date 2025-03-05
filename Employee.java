package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee extends JFrame {
    Employee(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.white);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            con c = new con();
            String EmployeeSQL = "select * from employee";
            ResultSet resultSet = c.statement.executeQuery(EmployeeSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("Name");
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setBounds(41,11,70,19);
        panel.add(name);

        JLabel Age = new JLabel("AGE");
        Age.setForeground(Color.white);
        Age.setFont(new Font("Tahoma", Font.BOLD, 14));
        Age.setBounds(159,11,70,19);
        panel.add(Age);

        JLabel gender = new JLabel("GENDER");
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        gender.setBounds(273,11,70,19);
        panel.add(gender);

        JLabel job = new JLabel("JOB");
        job.setForeground(Color.white);
        job.setFont(new Font("Tahoma", Font.BOLD, 14));
        job.setBounds(416,11,70,19);
        panel.add(job);

        JLabel salary = new JLabel("SALARY");
        salary.setForeground(Color.white);
        salary.setFont(new Font("Tahoma", Font.BOLD, 14));
        salary.setBounds(536,11,70,19);
        panel.add(salary);

        JLabel phone = new JLabel("PHONE");
        phone.setForeground(Color.white);
        phone.setFont(new Font("Tahoma", Font.BOLD, 14));
        phone.setBounds(656,11,70,19);
        panel.add(phone);

        JLabel gmail = new JLabel("GMAIL");
        gmail.setForeground(Color.white);
        gmail.setFont(new Font("Tahoma", Font.BOLD, 14));
        gmail.setBounds(786,11,70,19);
        panel.add(gmail);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setForeground(Color.white);
        aadhar.setFont(new Font("Tahoma", Font.BOLD, 14));
        aadhar.setBounds(896,11,70,19);
        panel.add(aadhar);

        setUndecorated(true);
        setLayout(null);
        setSize(1000,600);
        setLocation(430,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee();
    }
}
