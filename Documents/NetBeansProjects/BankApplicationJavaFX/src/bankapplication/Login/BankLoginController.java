/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication.Login;

import Connectivity.ConnectionClass;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class BankLoginController implements Initializable {
   ResultSet rs=null;
PreparedStatement pst=null;
   Connection connection=null;
    @FXML
    private JFXButton forgetButton;
    @FXML
    private JFXTextField login_uname;
    @FXML
    private JFXPasswordField login_pass;
    @FXML
    private JFXButton clearButton;
    @FXML
    private JFXButton submitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onForget(ActionEvent event) {
    }

    @FXML
    private void onClear(ActionEvent event) {
            login_uname.setText("");
        login_pass.setText("");
    }

    @FXML
    private void onSubmit(ActionEvent event) {
            String uname=login_uname.getText();
        String pass=login_pass.getText();
        try{
            ConnectionClass connectionClass=new ConnectionClass();
        connection=connectionClass.getConnection();
      String sql="Select * from login where accountNo=? and password=?";
       pst=connection.prepareStatement(sql);
       pst.setString(1, uname);
       pst.setString(2, pass);
       rs=pst.executeQuery();
      
            while(rs.next()){
                JOptionPane.showMessageDialog(null, "Welcome user ");
          loadWindow("/bankapplication/Dashboard/bankDashboard.fxml","Dashboard");
              
                
            }
            if(uname.isEmpty()|| pass.isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter all the fields");
            }
              
        } catch (SQLException ex) { 
           Logger.getLogger(BankLoginController.class.getName()).log(Level.SEVERE, null, ex);
       } 
        } 
    void loadWindow(String loc,String title){
       try {
           Parent parent=FXMLLoader.load(getClass().getResource(loc));
           Stage stage=new Stage(StageStyle.DECORATED);
           stage.setTitle(title);
           stage.setScene(new Scene(parent));
           stage.show();
       } catch (IOException ex) {
           Logger.getLogger(BankLoginController.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    }
    

