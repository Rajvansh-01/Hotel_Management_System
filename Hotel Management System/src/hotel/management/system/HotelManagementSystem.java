/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author DELL
 */
public class HotelManagementSystem extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    HotelManagementSystem(){
        setSize(1366, 565);
        setLocation(100, 100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pp.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        
        JLabel text = new JLabel("Hotel Management System");
        text.setBounds(20, 430 , 1000, 90);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("serif", Font.PLAIN, 50));
        image.add(text);
        
        JButton button = new JButton("Next");
        button.setBounds(1150, 450, 150, 50);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("serif", Font.PLAIN, 30));
        button.addActionListener(this);
        button.setBackground(Color.WHITE);
        image.add(button);
        
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
    
}
