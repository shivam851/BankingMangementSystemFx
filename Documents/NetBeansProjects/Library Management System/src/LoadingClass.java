/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class LoadingClass {
    public static void main(String[] args) {
        Loading lo=new Loading();
        Login log=new Login();
        lo.setVisible(true);
        try{
            for (int i=0;i<=100;i++){
                Thread.sleep(50);
               
              
               lo.progressbar.setValue(i);
                lo.splash_value.setText(Integer.toString(i));
                if(i==100){
                    log.setVisible(true);
                    lo.dispose();
                    
                }
            
        }
            
        }
        catch(Exception e){
            
        }
    }
    
}
