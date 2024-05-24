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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Dashboard extends JFrame implements ActionListener{

    public Dashboard() {
        setBounds(0, 0, 1600, 1000);
      
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600,1000 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1600, 1000);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU!");
        text.setBounds(400, 80 , 1000, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 45));
        image.add(text);
         
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1600, 30);
        image.add(mb);
                
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        hotel.setForeground(Color.RED);
        mb.add(admin);

        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);      
        
        JMenuItem addroom = new JMenuItem("ADD ROOMS");
        addroom.addActionListener(this);
        admin.add(addroom);
        
        JMenuItem adddriver = new JMenuItem("ADD DRIVERS");
        adddriver.addActionListener(this);
        admin.add(adddriver);
        
        setVisible(true);
    }
    @Override public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        } else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms();
        } else if(ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDrivers();
        } else if(ae.getActionCommand().equals("ADD EMPLOYEE")) {
            new AddEmployee().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
}
