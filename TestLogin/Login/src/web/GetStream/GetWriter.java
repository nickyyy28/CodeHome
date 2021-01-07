package web.GetStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getWriter")
public class GetWriter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String characterEncoding = req.getCharacterEncoding();
//        System.out.println(characterEncoding);
//        resp.setHeader("content-type","text/html;charset = utf-8");
//        resp.setCharacterEncoding("utf-8");

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
//        pw.write("<h1>hello HTML</h1>");

        pw.write("<h1>你好 HTML</h1>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
