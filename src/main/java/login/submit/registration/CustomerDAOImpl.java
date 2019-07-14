/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.submit.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sanduni
 */
public class CustomerDAOImpl implements CustomerDAO {

    static Connection con;
    static PreparedStatement ps;
    @Override
    public int insertCustomer(Customer c) {
        int status=0;
        try{
        con=MyConnectionProvider.getCon();
        ps=con.prepareStatement("insert into customer value(?,?)");
        ps.setString(1, c.getFirstname());
        ps.setString(2, c.getLastname());
        ps.setString(3, c.getAddress());
        ps.setString(4, c.getNic());
        ps.setString(5, c.getGender());
        ps.setString(6, c.getEmail());
        ps.setString(7, c.getPhoneno());
        ps.setString(8, c.getPassword());
        ps.setString(9, c.getUsername());
        status=ps.executeUpdate();
        con.close();
        
        }catch(Exception e){
        System.out.println(e);
        }
      return status;
    }

    @Override
    public Customer getCustomer(String username, String pass) {
        
        Customer c = new Customer();
        
         try{
        con=MyConnectionProvider.getCon();
        ps=con.prepareStatement("select * from customer where username=? and password=?");
        ps.setString(9, username);
        ps.setString(8, pass);
        
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
        c.setFirstname(rs.getString(1));
        c.setLastname(rs.getString(2));
        c.setAddress(rs.getString(3));
        c.setNic(rs.getString(4));
        c.setGender(rs.getString(5));
        c.setEmail(rs.getString(6));
        c.setPhoneno(rs.getString(7));
        c.setPassword(rs.getString(8));
        c.setUsername(rs.getString(9));
        }
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return null;
    }
    
}
