///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
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
public class AddRooms extends JFrame implements ActionListener{
    JButton add, cancel;
    JTextField tfroom, tfprice;
    JComboBox bedCombo, availableCombo, cleanCombo; 
    AddRooms() {      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Rooms");
        heading.setBounds(150, 20, 200, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(60, 80, 120, 30);
        lblroom.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblroom);
        
        tfroom = new JTextField();
        tfroom.setBounds(200, 80, 150, 30);
        add(tfroom);
        
        JLabel lblavailable = new JLabel("Available");
        lblavailable.setBounds(60, 130, 120, 30);
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblavailable);
        
        String availableOptions[] = {"Available", "Occupied"};
        availableCombo = new JComboBox(availableOptions);
        availableCombo.setBounds(200, 130, 150, 30);
        availableCombo.setBackground(Color.WHITE);
        add(availableCombo);
        
        JLabel lblclean = new JLabel("Cleaning Status");
        lblclean.setBounds(60, 180, 120, 30);
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblclean);
        
        String cleanOptions[] = {"Cleaned", "Dirty"};
        cleanCombo = new JComboBox(cleanOptions);
        cleanCombo.setBounds(200, 180, 150, 30);
        cleanCombo.setBackground(Color.WHITE);
        add(cleanCombo);
                
        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(60, 230, 120, 30);
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblprice);
        
        tfprice = new JTextField();
        tfprice.setBounds(200, 230, 150, 30);
        add(tfprice);
        
        JLabel lbltype = new JLabel("Bed Type");
        lbltype.setBounds(60, 280, 120, 30);
        lbltype.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbltype);
        
        String bedOptions[] = {"Single Bed", "Double Bed"};
        bedCombo = new JComboBox(bedOptions);
        bedCombo.setBounds(200, 280, 150, 30);
        bedCombo.setBackground(Color.WHITE);
        add(bedCombo);                
        
        add = new JButton("Add Driver");
        add.setBounds(60, 350, 130, 30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(220, 350, 130, 30);
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(400, 30, 500, 300);
        add(image);
        
        setBounds(330, 200, 940, 470);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String roomnumber = tfroom.getText();
            String availability = (String) availableCombo.getSelectedItem();
            String status = (String)cleanCombo.getSelectedItem();
            String price = tfprice.getText();
            String type = (String) bedCombo.getSelectedItem();
            
            try {
                Conn conn = new Conn();
                String str = "insert into room values('"+roomnumber+"', '"+availability+"', '"+status+"', '"+price+"', '"+type+"')";
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Room Added Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddRooms();
    }
}
