/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kirill.knu.fit.ta.lab4.TaskForLab4;

/**
 *
 * @author savch
 */
@WebServlet(name = "ServletForLab5", urlPatterns = {"/lab5"})
public class ServletForLab5 extends HttpServlet {

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
            Task1ForLab5 t1fl5 = new Task1ForLab5();
        
        List<String> text = tfl4.getList(tfl4.text);
        String t1find = request.getParameter("t1find");
        int t1start;
        int t1finish;
        String t1 = "";
        String t3string = request.getParameter("t3string");
        byte t3byte = Byte.parseByte(request.getParameter("t3byte"));
        
        if (request.getParameter("t1start") == ""){
            t1start = -1;
        }
        else if (Integer.parseInt(request.getParameter("t1start")) < 0){
            t1 = "Enter search positions that are greater than or equal to 0";
            t1start = Integer.parseInt(request.getParameter("t1start"));
        }
        else{
        
            t1start = Integer.parseInt(request.getParameter("t1start"));
        }
        
        if (request.getParameter("t1finish") == ""){
            t1finish = -1;
        }
        else if (Integer.parseInt(request.getParameter("t1finish")) < 0){
            t1 = "Enter search positions that are greater than or equal to 0";
            t1finish = Integer.parseInt(request.getParameter("t1finish"));
        }
        else{
        
            t1finish = Integer.parseInt(request.getParameter("t1finish"));
        }
        
        TaskForLab5 tfl5 = new TaskForLab5(Integer.parseInt(request.getParameter("t2")));
        
        if (t1 == "")
            t1 = t1fl5.Task1(t1find, t1start, t1finish, text);
        String t2s = "" + tfl5.getUnsortedStringList();
        String t2b = "" + tfl5.getUnsortedByteList();
        String sortedt2s = "" + tfl5.sortApproach2String();
        String sortedt2b = "" + tfl5.sortApproach2Byte();
        String findt3s = tfl5.Task3String(t3string, tfl5.sortApproach2String());
        String findt3b = tfl5.Task3Byte(t3byte, tfl5.sortApproach2Byte());

        request.setAttribute("t1", t1);
        request.setAttribute("t2s", t2s);
        request.setAttribute("t2b", t2b);
        request.setAttribute("sortedt2s", sortedt2s);
        request.setAttribute("sortedt2b", sortedt2b);
        request.setAttribute("findt3s", findt3s);
        request.setAttribute("findt3b", findt3b);
        
        request.setAttribute("t1find", t1find);
        request.setAttribute("t3string", t3string);
        request.setAttribute("t3byte", t3byte);
        
        request.getRequestDispatcher("Lab5.jsp").forward(request,response);
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
