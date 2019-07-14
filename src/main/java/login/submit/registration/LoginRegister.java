package login.submit.registration;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Sanduni
 */
@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
    private static final long serialVersionUID =1L;
    
    public LoginRegister(){
    
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        CustomerDAO cd= new CustomerDAOImpl();
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String address=request.getParameter("address");
        String nic=request.getParameter("nic");
        String gender=request.getParameter("gender");
        String email=request.getParameter("email");
        String phoneno=request.getParameter("phoneno");
        String password=request.getParameter("password1");
        String username=request.getParameter("username");
        String submitType=request.getParameter("submit");
        Customer c= new Customer();
        c=cd.getCustomer(username, password);
        if(submitType.equals("login") && c!=null && c.getUsername()!=null){
        request.setAttribute("message",c.getUsername());
        request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }else if(submitType.equals("register")){
        c= new Customer();
        c.setUsername(request.getParameter("username"));
        c.setPassword(firstname);
        c.setUsername(lastname);
        c.setPassword(address);
        c.setUsername(nic);
        c.setPassword(gender);
        c.setUsername(email);
        c.setPassword(phoneno);
        c.setUsername(password);
        cd.insertCustomer(c);
        request.setAttribute("sucessMessage","Registration done , please login to continue !!!");
        request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
        request.setAttribute("message","Data Not Found ,click on Register !!!");
        request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
   
  
}

    


