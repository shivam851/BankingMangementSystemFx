/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication.Dashboard;

import Connectivity.ConnectionClass;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class BankDashboardController implements Initializable {
Connection connection=null;
PreparedStatement pst=null;
Statement stmt=null;
ResultSet rs=null;
    @FXML
    private JFXTextField profile_acc;
    @FXML
    private JFXButton SearchButton;
    @FXML
    private JFXTextField profileName;
    @FXML
    private JFXTextField profileNationality;
    @FXML
    private JFXTextField profileAddress;
    @FXML
    private JFXTextField profileAcc;
    @FXML
    private JFXTextField profileDob;
    @FXML
    private JFXTextField profileGender;
    @FXML
    private JFXTextField profileAccno;
    @FXML
    private JFXTextField profileCaste;
    @FXML
    private JFXTextField profileMob;
    @FXML
    private JFXTextField profileSec;
    @FXML
    private JFXButton editButton;
    @FXML
    private JFXButton submitButton;
    @FXML
    private JFXTextField deposit_acc;
    @FXML
    private JFXButton DepostiSearchButton;
    @FXML
    private JFXTextField depositMob;
    @FXML
    private JFXTextField depositAvailBal;
    @FXML
    private JFXTextField depositGender;
    @FXML
    private JFXTextField depositName;
    @FXML
    private JFXTextField DepositAmt;
    @FXML
    private JFXTextField depositTotal;
    @FXML
    private JFXButton DepositClearButton;
    @FXML
    private JFXButton depositButton;
    @FXML
    private JFXButton DepostiCalculate;
    @FXML
    private JFXTextField withAvailBal;
    @FXML
    private JFXTextField withMob;
    @FXML
    private JFXTextField WithName;
    @FXML
    private JFXTextField withbal;
    @FXML
    private JFXTextField withtotalbal;
    @FXML
    private JFXButton withCalculate;
    @FXML
    private JFXButton withClearButton;
    @FXML
    private JFXButton withDrawButton;
    @FXML
    private JFXTextField with_acc;
    @FXML
    private JFXTextField WithGender;
    @FXML
    private JFXButton withdrawSearch;
    @FXML
    private JFXTextField transferFrom;
    @FXML
    private JFXButton transFromSearch;
    @FXML
    private JFXTextField fromName;
    @FXML
    private JFXTextField fromAvail;
    @FXML
    private JFXTextField transferAmt;
    @FXML
    private JFXTextField AfterTransferFrom;
    @FXML
    private JFXTextField transferTo;
    @FXML
    private JFXButton toSearchButton;
    @FXML
    private JFXTextField toName;
    @FXML
    private JFXTextField toAvail;
    @FXML
    private JFXTextField AfterTransferTo;
    @FXML
    private JFXButton transferClear;
    @FXML
    private JFXButton transferSubmit;
    @FXML
    private JFXButton calculateFrom;
    @FXML
    private JFXTextField customerAcc;
    @FXML
    private JFXTextField customerName;
    @FXML
    private JFXButton customerClear;
    @FXML
    private JFXTextField customerDob;
    @FXML
    private JFXTextField customerPin;
    @FXML
    private JFXTextField CustomerAccType;
    @FXML
    private JFXTextField CustomerNationality;
    @FXML
    private JFXTextField CustomerCaste;
    @FXML
    private JFXTextField CustomerGender;
    @FXML
    private JFXTextField CustomerMobile;
    @FXML
    private JFXTextField CustomerAddress;
    @FXML
    private JFXTextField customerQues;
    @FXML
    private JFXTextField CustomerAns;
    @FXML
    private JFXTextField customerBalance;
   
    @FXML
    private JFXTextField viewAcc;
    @FXML
    private JFXButton ViewBalanceSearch;
    @FXML
    private Label viewName;
    @FXML
    private JFXTextField viewName1;
    @FXML
    private JFXTextField ViewPhone;
    @FXML
    private Label viewName2;
    @FXML
    private JFXTextField viewBalance;
    @FXML
    private JFXButton viewClear;
    @FXML
    private JFXButton submitButton1;
    @FXML
    private Label view;
    @FXML
    private JFXTextField pinAcc;
    @FXML
    private JFXButton pinSearch;
    @FXML
    private Label viewName3;
    @FXML
    private JFXTextField PinPhone;
    @FXML
    private Label view1;
    @FXML
    private JFXTextField PinName;
    @FXML
    private JFXTextField pinNew;
    @FXML
    private Label view11;
    @FXML
    private JFXTextField pinOld;
    @FXML
    private JFXTextField pinRenew;
    @FXML
    private Label view111;
    @FXML
    private JFXButton pinClear;
    @FXML
    private JFXButton pinSubmit;
    @FXML
    private TableView<CustomerModel> table;
    @FXML
    private TableColumn<CustomerModel, String> col_acc;
    @FXML
    private TableColumn<CustomerModel, String> col_name;
    @FXML
    private TableColumn<CustomerModel, String> col_dob;
    @FXML
    private TableColumn<CustomerModel, String> col_acc_type;
    @FXML
    private TableColumn<CustomerModel, String> col_Nationality;
    @FXML
    private TableColumn<CustomerModel, String> col_gender;
    @FXML
    private TableColumn<CustomerModel, String> col_caste;
    @FXML
    private TableColumn<CustomerModel, String> col_mobile;
    @FXML
    private TableColumn<CustomerModel, String> col_address;
    @FXML
    private TableColumn<CustomerModel, String> col_ques;

   ObservableList<CustomerModel> oblist=FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Select * from account";
           rs=connection.createStatement().executeQuery(sql);
            while(rs.next()){
                oblist.add(new CustomerModel(rs.getString("Acc"),rs.getString("Name"),
                        rs.getString("Dob"),rs.getString("Acc_type"),rs.getString("Nationality"),
                        rs.getString("Gender"),rs.getString("Caste"),rs.getString("Mobile"),rs.getString("Address"),rs.getString("Secq")));
            }
            
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
        
        
        AccNumberGenerator();
        col_acc.setCellValueFactory(new PropertyValueFactory<>("acc"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_dob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        col_acc_type.setCellValueFactory(new PropertyValueFactory<>("acc_type"));
        col_Nationality.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        col_gender.setCellValueFactory(new PropertyValueFactory<>("caste"));
        col_caste.setCellValueFactory(new PropertyValueFactory<>("gender"));
        col_mobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
        col_ques.setCellValueFactory(new PropertyValueFactory<>("question"));
        
        table.setItems(oblist);
        
        
    }    
               
    @FXML
    private void OnProfileSearch(ActionEvent event) {
        String acc=profile_acc.getText();
        String sql="Select * from account where Acc=?";
        try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            pst=connection.prepareStatement(sql);
            pst.setString(1,acc);
            
            rs=pst.executeQuery();
            if(rs.next()){
            String name=rs.getString("Name");
            profileName.setText(name);
            
            String Nationality=rs.getString("Nationality");
            profileNationality.setText(Nationality);
            
            String address=rs.getString("Address");
            profileAddress.setText(address);
            
            String Gender=rs.getString("Gender");
            profileGender.setText(Gender);
            
            String acctype=rs.getString("Acc_type");
            profileAcc.setText(acctype);
            
            String Dobs=rs.getString("Dob");
            profileDob.setText(Dobs);
            
            String Accno=rs.getString("Acc");
            profileAccno.setText(Accno);
            
            String caste=rs.getString("Caste");
            profileCaste.setText(caste);
            
            String mob=rs.getString("Mobile");
            profileMob.setText(mob);
            
            String ques=rs.getString("Secq");
            profileSec.setText(ques);
            rs.close();
            pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Account not found");
            }
            
            
        } catch (SQLException ex) { 
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    } 
    } 
    
    

    @FXML
    private void OnProfileEdit(ActionEvent event) {
        profileName.setEditable(true);
        profileNationality.setEditable(true);
        profileAddress.setEditable(true);
        profileAcc.setEditable(true);
        profileDob.setEditable(true);
        profileGender.setEditable(true);
        profileCaste.setEditable(true);
        profileMob.setEditable(true);
        profileSec.setEditable(true);
        
        
    }

    @FXML
    private void OnProfileSubmit(ActionEvent event) {
        String name= profileName.getText();
        String dob= profileDob.getText();
        String nationality= profileNationality.getText();
        String address= profileAddress.getText();
        String profacc=profileAcc.getText();
        String gender= profileGender.getText();
        String caste= profileCaste.getText();
        String mob= profileMob.getText();
        String sec= profileSec.getText();
        String acc= profile_acc.getText();
        
        
        try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
           String sql="Update account set Name='"+name+"',Dob='"+dob+"',"
                + "Nationality='"+nationality+"',Address='"+address+"',Gender='"+gender+"',"
                + "Caste='"+caste+"',Mobile='"+mob+"',"
                + "Secq='"+sec+"',Acc_type='"+profacc+"' where Acc='"+acc+"'";
           pst=connection.prepareStatement(sql);
           int i =pst.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(null,"Update sucessully");
            }
            else{
            JOptionPane.showMessageDialog(null,"Error occured");
            }
           
            
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }

    @FXML
    private void OnDepostiSearch(ActionEvent event) {
        String sql="Select * from account where Acc=?";
        try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            pst=connection.prepareStatement(sql);
            pst.setString(1, deposit_acc.getText());
            
            rs=pst.executeQuery();
            if(rs.next()){
                String name=rs.getString("Name");
                depositName.setText(name);
                String Gender=rs.getString("Gender");
                depositGender.setText(Gender);
                String mob=rs.getString("Mobile");
                depositMob.setText(mob);
                String AvailBal=rs.getString("Balance");
                depositAvailBal.setText(AvailBal);
           
                
            }
            else{
            JOptionPane.showMessageDialog(null,"Accouunt Not found");
        }
            }
        
     catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void OnDepositClear(ActionEvent event) {
        deposit_acc.setText("");
        depositName.setText("");
        depositGender.setText("");
        depositMob.setText("");
        depositAvailBal.setText("");
        DepositAmt.setText("");
        depositTotal.setText("");
    }

    @FXML
    private void OnDeposit(ActionEvent event) {
        String bal=depositTotal.getText();
        String acc=deposit_acc.getText();
        
        try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Update account set Balance='"+bal+"' where Acc='"+acc+"' ";
            pst=connection.prepareStatement(sql);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Deposit sucessufully");
           }
           else{
               JOptionPane.showMessageDialog(null,"ERROR ; while deposit");
           }
           
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void OnDepostiCalculate(ActionEvent event) {
        String depositAvail=depositAvailBal.getText();
        String Deposit=DepositAmt.getText();
        int a=Integer.parseInt(Deposit);
        int b=Integer.parseInt(depositAvail);
        
        String total=String.valueOf(a+b);
        
        depositTotal.setText(total);
    }

    @FXML
    private void OnwithCalculate(ActionEvent event) {
    String avail=withAvailBal.getText();
    String withbals=withbal.getText();
    
    int a=Integer.parseInt(avail);
    int b=Integer.parseInt(withbals);
    String total=String.valueOf(a-b);
    
    withtotalbal.setText(total);
    }

    @FXML
    private void OnwithClear(ActionEvent event) {
        with_acc.setText("");
        WithName.setText("");
        WithGender.setText("");
        withMob.setText("");
        withAvailBal.setText("");
        withbal.setText("");
        withtotalbal.setText("");
    }      

    @FXML
    private void OnwithDraw(ActionEvent event) {
       try{
           ConnectionClass connectionClass=new ConnectionClass();
           connection=connectionClass.getConnection();
           String sql="Update account set balance='"+withtotalbal.getText()+"' where Acc='"+with_acc.getText()+"' ";
          

           pst=connection.prepareStatement(sql);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Withdraw sucessufully");
           }
           else{
               JOptionPane.showMessageDialog(null,"error: while withdraw");
           }
           
       } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
       
        
    }

    @FXML
    private void OnWithdrawSearch(ActionEvent event) {
        try{
            
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Select * from account where Acc=?";
            pst=connection.prepareStatement(sql);
            pst.setString(1,with_acc.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String name=rs.getString("Name");
            WithName.setText(name);
            String gender=rs.getString("Gender");
            WithGender.setText(gender);
            String mob=rs.getString("Mobile");
            withMob.setText(mob);
            String availBal=rs.getString("Balance");
            withAvailBal.setText(availBal);
            }
            
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @FXML
    private void OnfromSearchButton(ActionEvent event) {
        try{
           ConnectionClass connectionClass=new ConnectionClass();
           connection=connectionClass.getConnection();
           String sql="Select * from account where Acc=?";
           pst=connection.prepareStatement(sql);
           pst.setString(1,transferFrom.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String name =rs.getString("Name");
               fromName.setText(name);
               
               String bal =rs.getString("Balance");
               fromAvail.setText(bal);
               
               
           }else{
               JOptionPane.showMessageDialog(null,"Account not found");
           }
           
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void OnToSearchButton(ActionEvent event) {
         try{
           ConnectionClass connectionClass=new ConnectionClass();
           connection=connectionClass.getConnection();
           String sql="Select * from account where Acc=?";
           pst=connection.prepareStatement(sql);
           pst.setString(1,transferTo.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String name =rs.getString("Name");
               toName.setText(name);
               
               String bal =rs.getString("Balance");
               toAvail.setText(bal);
               
               
           }else{
               JOptionPane.showMessageDialog(null,"Account not found");
           }
           
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void OntransferClear(ActionEvent event) {
        transferFrom.setText("");
        transferTo.setText("");
        fromName.setText("");      
        fromAvail.setText("");      
        transferAmt.setText("");    
        AfterTransferFrom.setText("");    
        toName.setText(""); 
        toAvail.setText("");  
        AfterTransferTo.setText("");
                
    }

    @FXML
    private void OntransferSubmit(ActionEvent event) {
        transferFrom();
        transgerTo();
    }

    private void transferFrom() {
        try{
            ConnectionClass connectionClass=new ConnectionClass();
           connection=connectionClass.getConnection();
           String sql="Update account set balance='"+AfterTransferFrom.getText()+"' where Acc='"+transferFrom.getText()+"' ";
          

           pst=connection.prepareStatement(sql);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Withdraw Transfered from sucessufully done");
           }
           else{
               JOptionPane.showMessageDialog(null,"error: while transferring from");
           }
           
       } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
       
       
    }
   
    private void transgerTo() {
        try{
            ConnectionClass connectionClass=new ConnectionClass();
           connection=connectionClass.getConnection();
           String sql="Update account set balance='"+AfterTransferTo.getText()+"' where Acc='"+transferTo.getText()+"' ";
          

           pst=connection.prepareStatement(sql);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Transfered to sucessufully done ");
           }
           else{
               JOptionPane.showMessageDialog(null,"error: while transferring to ");
           }
           
       } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }

    @FXML
    private void fromCalculate(ActionEvent event) {
        String avail=fromAvail.getText();
           String transfer=transferAmt.getText();
           
           int a=Integer.parseInt(avail);
           int b =Integer.parseInt(transfer);
           
           String total1=String.valueOf(a-b);
           
          AfterTransferFrom.setText(total1);
          
          
          String tobal=toAvail.getText();
          int c=Integer.parseInt(tobal);
          String total=String.valueOf(c+b);
          
          AfterTransferTo.setText(total);
    }

    @FXML
    private void OnCustomerClear(ActionEvent event) {
        customerName.setText("");
        customerDob.setText("");
        customerPin.setText("");
        CustomerAccType.setText("");
        CustomerNationality.setText("");
        CustomerCaste.setText("");
        CustomerGender.setText("");
        CustomerMobile.setText("");
        CustomerAddress.setText("");
        customerQues.setText("");
        CustomerAns.setText("");
        customerBalance.setText("");
    }
      void AccNumberGenerator(){
          Random ra=new Random();
          customerAcc.setText(""+ra.nextInt(10000+1));
      }
   

    @FXML
    private void OnviewSearchButton(ActionEvent event) {
        try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Select * from account where Acc=?";
            pst=connection.prepareStatement(sql);
            pst.setString(1,viewAcc.getText());
            
            rs=pst.executeQuery();
            if(rs.next()){
                String name=rs.getString("Name");
                viewName1.setText(name);
                String phone=rs.getString("Mobile");
                ViewPhone.setText(phone);
                String bal=rs.getString("Balance");
                viewBalance.setText(bal);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Account not found");
            }
            
            
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
        
        
    }

    @FXML
    private void OnViewClear(ActionEvent event) {
        viewAcc.setText("");
        viewName1.setText("");
         ViewPhone.setText("");
        viewBalance.setText("");
    }

    @FXML
    private void OnCustomerSubmit1(ActionEvent event) {
          try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Insert into account(Acc,Name,Dob,Pin,Acc_type, Nationality,Caste,Gender,Mobile,Address,Secq,Seca,Balance) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=connection.prepareStatement(sql);
            pst.setString(1,customerAcc.getText());
            pst.setString(2,customerName.getText());
            pst.setString(3,customerDob.getText());
            pst.setString(4,customerPin.getText());
            pst.setString(5,CustomerAccType.getText());
            pst.setString(6,CustomerNationality.getText());
            pst.setString(7,CustomerCaste.getText());
            pst.setString(8,CustomerGender.getText());
            pst.setString(9,CustomerMobile.getText());
            pst.setString(10,CustomerAddress.getText());
            pst.setString(11,customerQues.getText());
            pst.setString(12,CustomerAns.getText());
            pst.setString(13,customerBalance.getText());
             int i=pst.executeUpdate();
           /* if(customerName.getText().equals("")||customerDob.getText().equals("")
                    ||customerPin.getText().equals("")||CustomerAccType.getText().equals("")||
                    CustomerNationality.getText().equals("")||CustomerCaste.getText().equals("")
                    ||CustomerGender.getText().equals("")||CustomerMobile.getText().equals("")||
                    CustomerAddress.getText().equals("")||customerQues.getText().equals("")||
                    CustomerAns.getText().equals("")||customerBalance.getText().equals(""))
                   {
                JOptionPane.showMessageDialog(null,"Please Insert all the records");
            }*/
           if(i>0){
           JOptionPane.showMessageDialog(null,"Customer Record Inserted");
           }
            
            
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void onPinSearch(ActionEvent event) {
          try{
            ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Select * from account where Acc=?";
            pst=connection.prepareStatement(sql);
            pst.setString(1,pinAcc.getText());
            
            rs=pst.executeQuery();
            if(rs.next()){
                String name=rs.getString("Name");
                PinName.setText(name);
                String phone=rs.getString("Mobile");
                PinPhone.setText(phone);
         
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Account not found");
            }
            
            
        } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @FXML
    private void OnPinClear(ActionEvent event) {
        pinAcc.setText("");
        PinPhone.setText("");
        PinName.setText("");
        pinOld.setText("");
        pinNew.setText("");      
         pinRenew.setText("");     
                
                
                
    }

    @FXML
    private void OnPinSubmit(ActionEvent event) {
        try{
              String oldpin=pinOld.getText();
        String pinnew=pinNew.getText();
        String pinrenew=pinRenew.getText();
              ConnectionClass connectionClass=new ConnectionClass();
            connection=connectionClass.getConnection();
            String sql="Select * from account where Acc=?";
            pst=connection.prepareStatement(sql);
            pst.setString(1, pinAcc.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                String pin =rs.getString("Pin");
                if(pin.equals(pinOld.getText())){
                    if(pinnew.equals(pinrenew)){
                String sqli="Update account set Pin=? where Acc=?";
                pst=connection.prepareStatement(sqli);
                pst.setString(1,pinnew);
                pst.setString(2, pinAcc.getText());
             int i=pst.executeUpdate();
             
             if(i>0){
                 JOptionPane.showMessageDialog(null,"update sucessfully");
             }
             else{
                JOptionPane.showMessageDialog(null,"pin not changed");
            }
            }else{
                 JOptionPane.showMessageDialog(null,"pin and repin  doesnot match");
            }
                }else{
                    JOptionPane.showMessageDialog(null,"in correct old pin ");
                }
            }
            
            
            
            
    } catch (SQLException ex) {
        Logger.getLogger(BankDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
     
        
        
        
        
        
    
   
       
}