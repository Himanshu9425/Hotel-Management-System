package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    Dashboard(){
        super("Hotel Management System");
        rec = new JButton("Reception");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);
        add = new JButton("Admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("tahoma",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        // First image (boss.png)
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = imageIcon1.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon2);
        label1.setBounds(850, 300, 200, 195); // Position and size for the first image
        add(label1);

// Second image (Reception.png)
        ImageIcon imageIcon11 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = imageIcon11.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon22);
        label11.setBounds(400, 300, 200, 195); // Corrected this line to set bounds for label11
        add(label11);

// Third image (Dashboard.gif)
        ImageIcon imageIcon25 = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1 = imageIcon25.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon111);
        label.setBounds(0, 0, 1950, 1090); // Positioning the third image (background)
        add(label);




        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i51 = imageIcon.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i51);
        JLabel label25 = new JLabel(imageIcon3);
        label25.setBounds(0, 0, 1950, 1090);
        add(label25);
        setLayout(null);
        setVisible(true);
        setSize(1950,1090);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rec){
            new Reception();
            setVisible(false);
        }
        else{
            new login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
