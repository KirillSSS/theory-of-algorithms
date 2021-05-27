/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kirill.knu.fit.ta.lab3.TaskForLab3;
import kirill.knu.fit.ta.lab6_7.TaskForLab6;

/**
 *
 * @author savch
 */
@WebServlet(name = "ServletForLab8", urlPatterns = {"/lab8"})
public class ServletForLab8 extends HttpServlet {

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
        TaskForLab6 tfl6 = new TaskForLab6();
        TaskForLab8 tfl8 = new TaskForLab8();
        Timer timer = new Timer();
        
        int[] a;
        String lS;
        String bS;
        String eS;
        String lSTime;
        String bSTime;
        String eSTime;
        String array;
        
        
        if (request.getParameter("array").equals("random"))
            a = tfl8.random();
        else
            a = tfl6.translate(request.getParameter("array"));
        
        
        if (a[0] == Integer.MIN_VALUE || !tfl6.isANumber(request.getParameter("n"))){
        
            array = "{}";
            
            lS = "Error,this array should only contain numbers";
            bS = "Error,this array should only contain numbers";
            eS = "Error,this array should only contain numbers";
            
            lSTime = "?";
            bSTime = "?";
            eSTime = "?";
        }
        else {
            tfl8.bubbleSort(a);
            
            lS = tfl8.linearSearch(a, Integer.parseInt(request.getParameter("n")));
            bS = tfl8.binarySearch(a, Integer.parseInt(request.getParameter("n")), 0, 0);
            eS = tfl8.exponentialSearch(a, Integer.parseInt(request.getParameter("n")));
            
            lSTime = timer.linearSearchTime(a, Integer.parseInt(request.getParameter("n")));
            bSTime = timer.binarySearchTime(a, Integer.parseInt(request.getParameter("n")));
            eSTime = timer.exponentialSearchTime(a, Integer.parseInt(request.getParameter("n")));
        }
        
        array = tfl3.output(a);
        System.out.println(array);
        
        request.setAttribute("array", array);
        request.setAttribute("n", request.getParameter("n"));
        
        request.setAttribute("lS", lS);
        request.setAttribute("bS", bS);
        request.setAttribute("eS", eS);
        
        request.setAttribute("lSTime", lSTime);
        request.setAttribute("bSTime", bSTime);
        request.setAttribute("eSTime", eSTime);
        
        request.getRequestDispatcher("Lab8.jsp").forward(request,response);
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
