import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CalcServlet extends HttpServlet
{ public void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
{ response.setContentType("text/html");
PrintWriter out = response.getWriter();
int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));
int c=0;
String op=request.getParameter("btn");
if (op.equals("+"))
c=a+b;
else if (op.equals("-"))
c=a-b;
else if (op.equals("*"))
c=a*b;
else if (op.equals("/"))
c=a/b;
out.println("<b>"+a+op+b+" = "+c+"<b>");
}
}