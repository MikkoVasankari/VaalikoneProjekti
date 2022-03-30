import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserProfile")
public class UserProfile extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    
    public UserProfile() {
        super();
       
    }
 
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
    PrintWriter out = response.getWriter();
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    
    
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaalikone","root","root");
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select name, pass from userreg where name='"+name+"' and pass='"+pass+"'");
      
      if(rs.next()) {
        response.sendRedirect("http://localhost:8080/index.html");
//      response.sendRedirect("http://localhost:8080/WelcomeUser.jsp?name="+rs.getString("name"));
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        
        
      }else {
        out.println("Wrong name and/or password");
      }
      
      
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
  }
}