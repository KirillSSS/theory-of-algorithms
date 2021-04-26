/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author savch
 */
@WebServlet(name = "ServletForLab4", urlPatterns = {"/lab4"})
public class ServletForLab4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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

        TaskForLab4 tfl4 = new TaskForLab4();
        
        String t2 = "" + tfl4.getList(tfl4.text).size();
        String t3 = "" + tfl4.getSet(tfl4.text).size();
        String t4 = "" + tfl4.Task4(tfl4.getList(tfl4.text), Integer.parseInt(request.getParameter("t4")), 1);
        String t5 = "" + tfl4.Task5(tfl4.text, request.getParameter("t5"));
        String t6 = "" + tfl4.Task6(tfl4.text, Integer.parseInt(request.getParameter("t6")));
        String t7 = "" + tfl4.Task7(tfl4.getList(tfl4.text), Integer.parseInt(request.getParameter("t7")));
        
        String a = "" + request.getParameter("t4");
        String letter = "" + request.getParameter("t5");
        String b = "" + request.getParameter("t6");
        String c = "" + request.getParameter("t7");

        request.setAttribute("t2", t2);
        request.setAttribute("t3", t3);
        request.setAttribute("t4", t4);
        request.setAttribute("t5", t5);
        request.setAttribute("t6", t6);
        request.setAttribute("t7", t7);
        
        request.setAttribute("a", a);
        request.setAttribute("letter", letter);
        request.setAttribute("b", b);
        request.setAttribute("c", c);
        
        request.getRequestDispatcher("Lab4.jsp").forward(request,response);
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
