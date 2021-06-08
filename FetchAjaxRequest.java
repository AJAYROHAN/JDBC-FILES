package MiniCalculators;
 import java.io.IOException;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 public class Calculator extends HttpServlet { private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { int num1 = Integer.parseInt(request.getParameter("number1"));
 int num2 = Integer.parseInt(request.getParameter("number2"));
 String oper =request.getParameter("operator");
 //System.out.println(oper=="+"); if( oper.equals("+")) 
{
 response.getWriter().println(num1+num2);
 }
 else if(oper.equals("-"))
 {
 response.getWriter().println(num1-num2);
 }
 else if(oper.equals("*")) 
{
 response.getWriter().println(num1*num2);
 }
 else if(oper.equals("/")) 
{
 response.getWriter().println(num1/num2);
 }
 else if(oper.equals("%"))
 {
 response.getWriter().println(num1%num2);
 }
 else
 {
 response.getWriter().println("Invaild Operator");
 } 
}
 }