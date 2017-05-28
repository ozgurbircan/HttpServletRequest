package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LENOVO on 28.05.2017.
 */
@WebServlet(urlPatterns = {"/requestform2"})
public class RequestForm2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter=resp.getWriter();
        String serverName=req.getServerName();
        int localPort=req.getLocalPort();
        int serverPort=req.getServerPort();
        String method =req.getMethod();
        String contextPath=req.getContextPath();
        printWriter.println("serverName "+serverName);
        printWriter.println("localPort " +localPort);
        printWriter.println("serverPort "+serverPort);
        printWriter.println("method "+method);
        printWriter.println("contextPath"+contextPath);

    }
}
