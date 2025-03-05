package Hotel.management.system;

import com.mysql.cj.protocol.Resultset;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Room extends JFrame {
    JTable table;
    JButton back;
    Room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 =new ImageIcon(image);

        JLabel label  = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c=new con();
            String RoomInfo = "select * from room";
            java.sql.ResultSet resultset = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultset));

        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBounds(200,500,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel room = new JLabel("ROOM NO.");
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma", Font.BOLD, 12));
        room.setBounds(12,15,120,19);
        panel.add(room);

        JLabel availability = new JLabel("AVAILABLILITY");
        availability.setForeground(Color.white);
        availability.setFont(new Font("Tahoma", Font.BOLD, 12));
        availability.setBounds(110,15,120,19);
        panel.add(availability);

        JLabel clean = new JLabel("CLEAN STATUS");
        clean.setForeground(Color.white);
        clean.setFont(new Font("Tahoma", Font.BOLD, 12));
        clean.setBounds(216,15,120,19);
        panel.add(clean);

        JLabel price = new JLabel("PRICE");
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma", Font.BOLD, 12));
        price.setBounds(330,15,120,19);
        panel.add(price);

        JLabel bed = new JLabel("BED TYPE");
        bed.setForeground(Color.white);
        bed.setFont(new Font("Tahoma", Font.BOLD, 12));
        bed.setBounds(417,15,120,19);
        panel.add(bed);

        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(900,600);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Room();
    }
}
