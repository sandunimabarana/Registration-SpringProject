/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.submit.registration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sanduni
 */
public class MyConnectionProvider implements MyProvider {
    static Connection con=null;
    
    public static Connection getCon(){
    
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(connUrl,username,pwd);
        
        }catch(Exception e){
        System.out.println(e);
        }
        return con;
    }
    
}
