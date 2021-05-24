/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab6_7;

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
@WebServlet(name = "ServletForLab6_7", urlPatterns = {"/lab6_7"})
public class ServletForLab6_7 extends HttpServlet {

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
        
        TaskForLab6 tfl6 = new TaskForLab6();
        TaskForLab7 tfl7 = new TaskForLab7();
        
        tfl7.add(3);
        tfl7.add(6);
        tfl7.add(11);
        tfl7.add(10);
        tfl7.add(7);
        tfl7.add(8);
        tfl7.add(1);
        tfl7.add(2);
        
        
        request.setAttribute("l6arrey", request.getParameter("l6arrey"));
        request.setAttribute("l6n", request.getParameter("l6n"));
        request.setAttribute("n1", request.getParameter("n1"));
        request.setAttribute("n2", request.getParameter("n2"));
        /*request.setAttribute("nd", request.getParameter("nd"));*/
        
        String lab6 = "";
        String lab7n1 = "";
        String lab7n2 = "";
        /*String lab7nd = "";*/
        
        if (tfl6.isANumber(request.getParameter("l6n")))
            lab6 = tfl6.answer(request.getParameter("l6arrey"), Integer.parseInt(request.getParameter("l6n")));
        else
            lab6 = "Wrong numbers, try others";
        
        if (tfl6.isANumber(request.getParameter("n1")))
            if (tfl7.containsNode(Integer.parseInt(request.getParameter("n1"))))
                lab7n1 = "true";
            else if (!tfl7.containsNode(Integer.parseInt(request.getParameter("n1"))))
                lab7n1 = "false";
        else
            lab7n1 = "Wrong numbers, try others";
        
        if (tfl6.isANumber(request.getParameter("n2")))
            if (tfl7.containsNode(Integer.parseInt(request.getParameter("n2"))))
                lab7n2 = "true";
            else if (!tfl7.containsNode(Integer.parseInt(request.getParameter("n2"))))
                lab7n2 = "false";
        else
            lab7n2 = "Wrong numbers, try others";
        
        //System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + tfl7.containsNode(Integer.parseInt(request.getParameter("n2"))));
        
        String lab7ind = tfl7.nodeIndexList();
        String lab7sort = tfl7.traverseInOrder(tfl7.root);
        String lab7pre = tfl7.traversePreOrder(tfl7.root);
        String lab7post = tfl7.traversePostOrder(tfl7.root);
        String lab7lev = tfl7.traverseLevelOrder(tfl7.root);

        request.setAttribute("lab6", lab6);
        request.setAttribute("lab7n1", lab7n1);
        request.setAttribute("lab7n2", lab7n2);
        /*request.setAttribute("lab7nd", lab7nd);*/
        request.setAttribute("lab7ind", lab7ind);
        request.setAttribute("lab7sort", lab7sort);
        request.setAttribute("lab7pre", lab7pre);
        request.setAttribute("lab7post", lab7post);
        request.setAttribute("lab7lev", lab7lev);
        
        request.getRequestDispatcher("Lab6-7.jsp").forward(request,response);
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
