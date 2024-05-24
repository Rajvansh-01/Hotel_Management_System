/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Reception extends JFrame implements ActionListener{
    JButton newCustomer;
    JButton rooms;
    JButton department;
    JButton allEmployee;
    JButton managerInfo;
    JButton customerInfo;
    JButton searchRoom;
    JButton update;
    JButton roomStatus;

    Reception() {
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.white);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.white);
        rooms.addActionListener(this);
        add(rooms);
        
        department = new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.black);
        department.setForeground(Color.white);
        department.addActionListener(this);
        add(department);
        
        allEmployee = new JButton("All Employee");
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setBackground(Color.black);
        allEmployee.setForeground(Color.white);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
        customerInfo = new JButton("Customer Info");
        customerInfo.setBounds(10, 190, 200, 30);
        customerInfo.setBackground(Color.black);
        customerInfo.setForeground(Color.white);
        customerInfo.addActionListener(this);
        add(customerInfo);
        
        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10, 230, 200, 30);
        managerInfo.setBackground(Color.black);
        managerInfo.setForeground(Color.white);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10, 270, 200, 30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.white);
        add(checkout);
        
        update = new JButton("Update Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        update.addActionListener(this);
        add(update);
        
        roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setBackground(Color.black);
        roomStatus.setForeground(Color.white);
        roomStatus.addActionListener(this);
        add(roomStatus);
        
        JButton pickup = new JButton("Pickup Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.black);
        pickup.setForeground(Color.white);
        add(pickup);
        
        searchRoom = new JButton("Search Room");
        searchRoom.setBounds(10, 430, 200, 30);
        searchRoom.setBackground(Color.black);
        searchRoom.setForeground(Color.white);
        searchRoom.addActionListener(this);
        add(searchRoom);
                
        JButton logout = new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
    }
    
    @Override public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        } 
        
        else if(ae.getSource() == newCustomer){
            setVisible(false);
            new AddCustomer();
        }
        
        else if(ae.getSource() == rooms){
            setVisible(false);
            new Room();
        }
        
        else if(ae.getSource() == department){
            setVisible(false);
            new Department();
        }
        
        else if(ae.getSource() == allEmployee){
            setVisible(false);
            new EmployeeInfo();
        }
        
        else if(ae.getSource() == managerInfo){
            setVisible(false);
            new ManagerInfo();
        }
        
        else if(ae.getSource() == customerInfo){
            setVisible(false);
            new CustomerInfo();
        }
        
        else if(ae.getSource() == searchRoom){
            setVisible(false);
            new SearchRoom();
        }
        
        else if(ae.getSource() == update){
            setVisible(false);
            new UpdateCheck();
        }
        
        else if(ae.getSource() == roomStatus){
            setVisible(false);
            new UpdateRoom();
        }
    }
    
    public static void main(String[] args){
        new Reception();
    }
    
}
