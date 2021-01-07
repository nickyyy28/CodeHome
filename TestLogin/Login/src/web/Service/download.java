package web.Service;

import utils.DownloadUtil;
import utils.GetMiMe;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/download")
public class download extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        byte[] bytes = new byte[1024 * 8];
        String filename = req.getParameter("filename");
        String realPath = servletContext.getRealPath("/" + filename);

        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(
                        new File(realPath)
                )
        );

        String name = new File(realPath).getName();

        String agent = req.getHeader("User-Agent");
        String miMe = GetMiMe.getMiMe(name);

        name = DownloadUtil.getFileName(agent,name);

        resp.setHeader("content-type",miMe);
        resp.setHeader("content-disposition","attachment;filename="+name);

//        System.out.println(new File(realPath).getName());
//        System.out.println(realPath);

        ServletOutputStream outputStream = resp.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(
                outputStream
        );
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bis.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
