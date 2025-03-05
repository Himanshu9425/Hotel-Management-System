package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            con c = new con();
            String departmmentInfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(departmmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception E){
            E.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("Department");
        label1.setFont(new Font("Tahoma", Font.BOLD, 15));
        label1.setBounds(145, 11, 105, 20);
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("Budget");
        label2.setFont(new Font("Tahoma", Font.BOLD, 15));
        label2.setBounds(431, 11, 105, 20);
        label2.setForeground(Color.white);
        panel.add(label2);

        setUndecorated(true);
        setSize(700,500);
        setVisible(true);
        setLocation(550,150);
        setLayout(null);
    }
    public static void main(String[] args) {
        new Department();

    }
}
