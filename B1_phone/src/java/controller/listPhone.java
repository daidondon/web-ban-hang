/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.listphone;

/**
 *
 * @author HDC
 */
public class listPhone extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listPhone</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listPhone at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number = request.getParameter("number");
        int num;
        try {
            num= Integer.parseInt(number);
            int ID;
            String name;
            float price;
            String dateEX;
            String Des;
            String[] n = {"Abvc","Cdkxf","GASEGD","FDCDas","Sgeage","agina","fasfaVC","Xfargh"};
            String[] d = {"13-11-1988","2-3-1972","1-6-1934","23-8-1976","9-3-2014","3-5-1972","2-4-1977","15-12-1989"};
            String[] k = {"88 vb","123 sd","25 dd","57 vbhg","238 sdr","083 fgg","45 ff","87 ff"};
            Random rand = new Random();
            List<listphone> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                ID= i+1;
                name= n[rand.nextInt(n.length)];
                dateEX = d[rand.nextInt(d.length)];
                Des = k[rand.nextInt(k.length)];
                price = rand.nextFloat();
                listphone s = new listphone(ID, name, price, dateEX, Des);
                list.add(s);
            }
            request.setAttribute("data", list);
            request.getRequestDispatcher("listPhone.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
