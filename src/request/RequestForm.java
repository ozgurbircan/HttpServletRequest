package request;

import com.sun.deploy.net.HttpRequest;

import javax.jws.WebService;
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
@WebServlet(urlPatterns = {"/requestform1"})
public class RequestForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String nameText=req.getParameter("nameText");
        String surnameText=req.getParameter("surnameText");
        String passwordInput=req.getParameter("passwordinput");
        PrintWriter printWriter=resp.getWriter();
        printWriter.print("Adınız :"+nameText+" Soyadınız : "+surnameText+" Şifreniz : "+passwordInput);


    }
}
