package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField nametext, agetext,salarytext,phonetext,aadhartext,emailtext;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox;
    JButton add,back;
    AddEmployee(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nametext = new JTextField();
        nametext.setBounds(200,30,150,27);
        nametext.setFont(new Font("Tahoma", Font.BOLD, 14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(16,108,115));
        panel.add(nametext);

        JLabel age = new JLabel("AGE");
        age.setBounds(60,80,150,27);
        age.setFont(new Font("serif", Font.BOLD, 17));
        age.setForeground(Color.WHITE);
        panel.add(age);
        agetext = new JTextField();
        agetext.setBounds(200,80,150,27);
        agetext.setFont(new Font("Tahoma", Font.BOLD, 14));
        agetext.setForeground(Color.WHITE);
        agetext.setBackground(new Color(16,108,115));
        panel.add(agetext);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setForeground(Color.WHITE);
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(3,45,48));
        radioButtonF.setForeground(Color.WHITE);
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("serif", Font.BOLD, 17));
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk","House Desk","HouseKeeping","Room Service","Manager","Accountant","Chef"});
        comboBox.setBackground(new Color(16,108,115));
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salarytext = new JTextField();
        salarytext.setBounds(200,220 ,150,27);
        salarytext.setFont(new Font("Tahoma", Font.BOLD, 14));
        salarytext.setForeground(Color.WHITE);
        salarytext.setBackground(new Color(16,108,115));
        panel.add(salarytext);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phonetext = new JTextField();
        phonetext.setBounds(200,270 ,150,27);
        phonetext.setFont(new Font("Tahoma", Font.BOLD, 14));
        phonetext.setForeground(Color.WHITE);
        phonetext.setBackground(new Color(16,108,115));
        panel.add(phonetext);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("serif", Font.BOLD, 17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);
        aadhartext = new JTextField();
        aadhartext.setBounds(200,320 ,150,27);
        aadhartext.setFont(new Font("Tahoma", Font.BOLD, 14));
        aadhartext.setForeground(Color.WHITE);
        aadhartext.setBackground(new Color(16,108,115));
        panel.add(aadhartext);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailtext = new JTextField();
        emailtext.setBounds(200,370 ,150,27);
        emailtext.setFont(new Font("Tahoma", Font.BOLD, 14));
        emailtext.setForeground(Color.WHITE);
        emailtext.setBackground(new Color(16,108,115));
        panel.add(emailtext);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(450,24,455,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);


        setUndecorated(true);
        setSize(900,500);
        setLayout(null);
        setVisible(true);
        setLocation(60,160);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name = nametext.getText();
            String age = agetext.getText();
            String salary = salarytext.getText();
            String phone = phonetext.getText();
            String email = emailtext.getText();
            String aadhar = aadhartext.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if(radioButtonM.isSelected()){
                gender = "MALE";
            }
            else if(radioButtonF.isSelected()){
                gender = "FEMALE";
            }
            try{
                con c = new con();
                String q = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee added");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddEmployee();
    }
}
