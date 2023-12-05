package FirstAPP.WEB_INF.Classes;

import java.io.PrintWriter;

import jakarta.servlet.*;


public class myServlet extends GenericServlet {

    public void service(ServletRequest rq,ServletResponse rs)
    {
        try{
            PrintWriter pw = rs.getWriter();
            pw.println("This is my First servlet APP");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}