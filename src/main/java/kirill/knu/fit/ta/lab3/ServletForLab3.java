/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab3;

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
@WebServlet(name = "ServletForLab3", urlPatterns = {"/lab3"})
public class ServletForLab3 extends HttpServlet {

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

        TaskForLab3 tfl3 = new TaskForLab3();
        
        int arlng = 0;
        if (request.getParameter("length") != "")
            arlng = Integer.parseInt(request.getParameter("length"));
        int armax = 10;
        
        if (arlng <= 0){
            request.setAttribute("output", "Please write another length of the array greater than zero");
            request.setAttribute("cfn", "");
            request.setAttribute("check", "");
            
            request.getRequestDispatcher("Lab3.jsp").forward(request,response);
        }
        else {
            int[] x = tfl3.task(arlng, armax);

            String output = tfl3.output(x);
            String cfn = tfl3.checkForNegative(x);
            String check = tfl3.check(x);

            request.setAttribute("output", output);
            request.setAttribute("cfn", "The number of negative numbers is" + cfn);
            request.setAttribute("check", "The number of negative numbers at the beginning is" + check);
            
            request.getRequestDispatcher("Lab3.jsp").forward(request,response);
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
