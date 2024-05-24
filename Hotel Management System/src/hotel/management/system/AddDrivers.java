/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class AddDrivers extends JFrame implements ActionListener{
    JButton add, cancel;
    JTextField tfname, tfage, tfcompany, tfmodel, tflocation;
    JComboBox ageCombo, availableCombo; 
    AddDrivers() {      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Drivers");
        heading.setBounds(150, 20, 200, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 80, 120, 30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 80, 150, 30);
        add(tfname);
        
        JLabel lblage = new JLabel("Age");
        lblage.setBounds(60, 130, 120, 30);
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblage); 
        
        tfage = new JTextField();
        tfage.setBounds(200, 130, 150, 30);
        add(tfage);
        
        JLabel lblclean = new JLabel("Gender");
        lblclean.setBounds(60, 180, 120, 30);
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblclean);
        
        String cleanOptions[] = {"Male", "Female"};
        ageCombo = new JComboBox(cleanOptions);
        ageCombo.setBounds(200, 180, 150, 30);
        ageCombo.setBackground(Color.WHITE);
        add(ageCombo);
                
        JLabel lblprice = new JLabel("Car Company");
        lblprice.setBounds(60, 230, 120, 30);
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblprice);
        
        tfcompany = new JTextField();
        tfcompany.setBounds(200, 230, 150, 30);
        add(tfcompany);
        
        JLabel lbltype = new JLabel("Car Model");
        lbltype.setBounds(60, 280, 120, 30);
        lbltype.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbltype);
        
        tfmodel = new JTextField();
        tfmodel.setBounds(200, 280, 150, 30);
        add(tfmodel);             
        
        JLabel lblavailable = new JLabel("Available");
        lblavailable.setBounds(60, 330, 120, 30);
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblavailable );
        
        String availableOptions[] = {"Available", "Busy"};
        availableCombo = new JComboBox(availableOptions);
        availableCombo.setBounds(200, 330, 150, 30);
        availableCombo.setBackground(Color.WHITE);
        add(availableCombo);   
        
        JLabel lbllocation = new JLabel("Location");
        lbllocation.setBounds(60, 380, 120, 30);
        lbllocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbllocation);
        
        tflocation = new JTextField();
        tflocation.setBounds(200, 380, 150, 30);
        add(tflocation);  
        
        add = new JButton("Add Room");
        add.setBounds(60, 430, 130, 30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(220, 430, 130, 30);
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(400, 30, 500, 300);
        add(image);
        
        setBounds(300, 180, 980, 530);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String age = tfage.getText();
            String gender = (String)ageCombo.getSelectedItem();
            String company = tfcompany.getText();
            String brand = tfmodel.getText();
            String available = (String) availableCombo.getSelectedItem();
            String location = tflocation.getText();
            
            try {
                Conn conn = new Conn();
                String str = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+brand+"', '"+available+"', '"+location+"')";
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Driver Added Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddDrivers();
    }
}
