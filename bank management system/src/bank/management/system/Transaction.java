
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction  extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,transfer,ministatement,pinchange,fastcash,balanceInquiry,exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(220, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Sysyem",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(350, 415, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        transfer = new JButton("Transfer");
        transfer.setBounds(170, 450, 150, 30);
        transfer.addActionListener(this);
        image.add(transfer);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(350, 450, 150, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("PIN Change");
        pinchange.setBounds(170, 520, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        fastcash = new JButton("Fast Cash ");
        fastcash.setBounds(170, 485, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        
        balanceInquiry = new JButton("Balance Inquiry ");
        balanceInquiry.setBounds(350, 485, 150, 30);
        balanceInquiry.addActionListener(this);
        image.add(balanceInquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(350, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    
}
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }
        
    }
    public static void main(String[] agrs){
        new Transaction("");
        
    }
    
}
