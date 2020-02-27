

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Model m=new Model();
		m.setUsername(username);
		m.setPassword(password);
		
		int x=m.login();
		
		if(x==1)
		{
			String sname=m.getSname();
			HttpSession session=request.getSession(true);
					session.setAttribute("sname",sname);
					
					String age=m.getAge();
					
							session.setAttribute("age",age);
							
							String email=m.getEmail();
							
									session.setAttribute("email",email);
									
									String tenth=m.getTenth();
									    
									    session.setAttribute("tenth",tenth);
				                       
									        String puc=m.getPuc();
											
												session.setAttribute("puc",puc);
													
												      String engg=m.getEngg();
													
													         session.setAttribute("engg",engg);
													              
													         String skills=m.getSkills();
													
													               session.setAttribute("skills",skills);
													                
													                 String username1=m.getUsername();
																	
													                    session.setAttribute("username",username1);
													                    
													                    String password1=m.getPassword();
																		
													                        session.setAttribute("password",password1);
													                       
													                       
							response.sendRedirect("/Application/successfullLogin.jsp");
		}
		else {
			response.sendRedirect("/Application/failedLogin.html");
		}
	
	}
}
