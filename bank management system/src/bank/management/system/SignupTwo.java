package bank.management.system;

import javax.swing.*;
import java.awt.*;


import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField  panNumberTextField, aadhar_numberTextField;
    JButton next;
    JRadioButton senior_cetizen_yes,senior_cetizen_no, exisiting_Acc_yes,exisiting_Acc_no;
    JComboBox religion, category, occupation, educationL, income;
    String formno;
    
   
    
    SignupTwo(String formno){
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE - 2");
        
        
        
        
             
     
        
    //TITLE OF THE FORM AND FORM NUMBER 
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
       
        
    //RELIGION..................
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] ={"Hindu", "Muslim","Sikh", "christian" ,"Other"};
        religion = new JComboBox(valReligion);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBackground(Color.WHITE);
        religion.setBounds(300, 140, 400, 30);
        add(religion);
        
        
       
        
        
    //CATEGORY........
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valCategory[] ={"General", "SC","ST", "OBC" ,"Other"};
        category = new JComboBox(valCategory );
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBackground(Color.white);
        category .setBounds(300, 190, 400, 30);
        add(category);
        
        
        
    //INCOME.........  
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valIncome[] ={"Null", "< 150000","< 250000", "< 500000" ,"Upto 1000000",""};
        income = new JComboBox(valIncome );
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        income.setBackground(Color.white);
        income .setBounds(300, 240, 400, 30);
        add(income);
        
        
        
    //EDUCATION ........ 
        JLabel education = new JLabel("Educational ");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
     
       
        JLabel qualification = new JLabel("Qualification :");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
       
        String valQualification[] =  {"Non-Graduation","Graduate","Post Graduate", "Doctrate" ,"Other"};
        educationL = new JComboBox(valQualification);
        educationL.setFont(new Font("Raleway", Font.BOLD, 14));
        educationL.setBackground(Color.white);
        educationL .setBounds(300, 315, 400, 30);
        add(educationL);
        
        
        
        
    //OCCUPATION .......   
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String valOccupation []= {"Salaried","Self Employed","Bussiness", "Student" ,"Retired","Others"};
        occupation = new JComboBox(valOccupation);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBackground(Color.white);
        occupation .setBounds(300, 390, 400, 30);
        add(occupation);
        
        
      
        
        
        
        
        
    //PAN NUMBER........ 
        JLabel panNumber = new JLabel("PAN Number :");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);
        
        panNumberTextField = new JTextField();
        panNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panNumberTextField.setBounds(300, 440, 400, 30);
        add(panNumberTextField);
        
        
        
    //AADHAR NUMBER 
        JLabel aadhar_number = new JLabel("Aadhar number :");
        aadhar_number.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar_number.setBounds(100, 490, 200, 30);
        add(aadhar_number);
        
        aadhar_numberTextField = new JTextField();
        aadhar_numberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar_numberTextField.setBounds(300, 490, 400, 30);
        add(aadhar_numberTextField);
        
        
        
        
    //SENIOR CITIZEN...........LABEL
        JLabel senior_cetizen = new JLabel("Senior citizen :");
        senior_cetizen.setFont(new Font("Raleway", Font.BOLD, 20));
        senior_cetizen.setBounds(100, 540, 200, 30);
        add(senior_cetizen);
        
        
        senior_cetizen_yes = new JRadioButton("YES");
        senior_cetizen_yes.setBounds(300, 540, 100, 30);
        senior_cetizen_yes.setBackground(Color.WHITE);
        add(senior_cetizen_yes);
        
        senior_cetizen_no = new JRadioButton("No");
        senior_cetizen_no.setBounds(450, 540, 140, 30);
        senior_cetizen_no.setBackground(Color.WHITE);
        add(senior_cetizen_no);
        
        ButtonGroup senior_cetizengroup = new ButtonGroup();
        senior_cetizengroup.add(senior_cetizen_yes);
        senior_cetizengroup.add(senior_cetizen_no);
        
      
        
      
        
        
    //EXISITING ACCOUNT ........
        JLabel exisiting_Acc = new JLabel("Exisiting Account :");
        exisiting_Acc.setFont(new Font("Raleway", Font.BOLD, 20));
        exisiting_Acc.setBounds(100, 590, 200, 30);
        add(exisiting_Acc);
        
        exisiting_Acc_yes = new JRadioButton("YES");
        exisiting_Acc_yes.setBounds(300, 590, 100, 30);
        exisiting_Acc_yes.setBackground(Color.WHITE);
        add(exisiting_Acc_yes);
        
        exisiting_Acc_no = new JRadioButton("No");
        exisiting_Acc_no.setBounds(450, 590, 140, 30);
        exisiting_Acc_no.setBackground(Color.WHITE);
        add(exisiting_Acc_no);
        
        ButtonGroup exisiting_Acc_group = new ButtonGroup();
        exisiting_Acc_group.add(exisiting_Acc_yes);
        exisiting_Acc_group.add(exisiting_Acc_no);
        
    //BUTTON FOR GOING TO ONE PAGE TO ANOTHER PAGE....
    next = new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 660, 80, 30);
    next.addActionListener(this);
    add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    
   
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String new_religion = (String)religion.getSelectedItem();
        
        String new_category = (String)category.getSelectedItem();
        
        String new_income = (String)income.getSelectedItem();
        
        String new_education = (String)educationL.getSelectedItem();
        
        String new_occupation = (String)occupation.getSelectedItem();
        
        
        
        String senior_cetizen = null;
        if(senior_cetizen_yes.isSelected()){
            senior_cetizen="YES";
        }
        else if(senior_cetizen_no.isSelected()){
            senior_cetizen = "NO";
        }
        
        
        
        String exisiting_Acc = null;
        if(exisiting_Acc_yes.isSelected()){
            exisiting_Acc = "YES";
        }
        else if(exisiting_Acc_no.isSelected()){
            exisiting_Acc = "NO";
        }
        
        String new_panNumberTextField =panNumberTextField.getText();
        String new_aadhar_numberTextField = aadhar_numberTextField.getText();
        
        
        try{
           
               
            Conn c = new Conn();
                String query = "insert into signuptwo  values('"+formno+"','"+new_religion+"','"+new_category+"','"+new_income+"','"+new_education+"','"+new_occupation+"','"+new_panNumberTextField+"','"+new_aadhar_numberTextField+"','"+senior_cetizen+"','"+exisiting_Acc+"')";
                c.s.executeUpdate(query);

            
            // Signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String agrs[]){
        new SignupTwo("");
    }
    
}
