package org.example.examwebclient;

import java.io.*;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.examwebclient.model.CD;
import org.example.examwebclient.service.CdService;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private CdService cdService;

    public void init() {
        cdService = new CdService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<CD> Cds = cdService.getCds();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Product List</h1>");
        out.println("<ul>");
        for (CD cd : Cds) {
            out.println("<li>" + cd.getNom() + " - $" + cd.getPrix() + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }


}