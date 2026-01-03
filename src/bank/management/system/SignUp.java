package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JRadioButton r1, r2, m1, m2, m3;
    JButton next;

    JTextField textName, textFname, textEmail, textAdd, textcity, textpin, textState;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    SignUp() {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No. " + first);
        label1.setBounds(250, 20, 500, 70);
        label1.setFont(new Font("Raleway", Font.BOLD, 29));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(389, 80, 600, 40);
        label2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(350, 110, 600, 40);
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setBounds(150, 180, 400, 35);
        labelName.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(290, 180, 400, 35);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name:");
        labelfName.setBounds(150, 220, 400, 35);
        labelfName.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelfName);

        textFname = new JTextField();
        textFname.setBounds(290, 220, 400, 35);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setBounds(150, 260, 400, 35);
        DOB.setFont(new Font("Raleway", Font.BOLD, 18));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(290, 260, 400, 35);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setBounds(150, 300, 400, 30);
        labelG.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelG);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        r1.setBounds(300, 300, 90, 30);
        r2.setBounds(450, 300, 90, 30);

        r1.setBackground(new Color(222, 255, 228));
        r2.setBackground(new Color(222, 255, 228));

        add(r1);
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setBounds(150, 340, 400, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 340, 400, 35);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setBounds(150, 380, 400, 35);
        labelMs.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelMs);

        m1 = new JRadioButton("Married");
        m2 = new JRadioButton("Unmarried");
        m3 = new JRadioButton("Other");

        m1.setBounds(300, 380, 90, 30);
        m2.setBounds(400, 380, 110, 30);
        m3.setBounds(520, 380, 100, 30);

        m1.setBackground(new Color(222, 255, 228));
        m2.setBackground(new Color(222, 255, 228));
        m3.setBackground(new Color(222, 255, 228));

        add(m1);
        add(m2);
        add(m3);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(m1);
        bg2.add(m2);
        bg2.add(m3);

        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setBounds(150, 420, 400, 30);
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300, 420, 400, 35);
        add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setBounds(150, 460, 400, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelCity);

        textcity = new JTextField();
        textcity.setBounds(300, 460, 400, 35);
        add(textcity);

        JLabel labelpin = new JLabel("Pin Code:");
        labelpin.setBounds(150, 500, 400, 30);
        labelpin.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelpin);

        textpin = new JTextField();
        textpin.setBounds(300, 500, 400, 35);
        add(textpin);

        JLabel labelState = new JLabel("State:");
        labelState.setBounds(150, 540, 400, 30);
        labelState.setFont(new Font("Raleway", Font.BOLD, 18));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300, 540, 400, 35);
        add(textState);

        next = new JButton("Next");
        next.setBounds(400, 600, 90, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 750);
        setLocation(200, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String father_name = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = r1.isSelected() ? "Male" : r2.isSelected() ? "Female" : "";

        String email = textEmail.getText();

        String maritial = m1.isSelected() ? "Married" :
                m2.isSelected() ? "Unmarried" : "Other";

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textState.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Conn con1 = new Conn();
                String q = "insert into signup values('" + formno + "','" + name + "','" + father_name + "','" + dob + "','" + gender + "','" + email + "','" + maritial + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                con1.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Data Saved Successfully");
                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
