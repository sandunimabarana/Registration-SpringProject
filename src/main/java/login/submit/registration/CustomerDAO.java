/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.submit.registration;

/**
 *
 * @author Sanduni
 */
public interface CustomerDAO {
    
    public int insertCustomer(Customer c);
    public Customer getCustomer(String username, String pass);
}
