/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.PersonaDAO;
import Modelo.Registrar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson
 */
public class validarr extends HttpServlet {

    PersonaDAO dao ;
    Persona per = new Persona();
    Registrar re = new Registrar();
    
    
     public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
        System.out.println("Conexion exitosa desde el servlet");
        try {
            //doy la orden de establecer la conexion
            dao = new PersonaDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(validarr.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validarr</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validarr at " + request.getContextPath() + "</h1>");
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
        //  processRequest(request, response);
        String accion = request.getParameter("accion");
        String txt1 = request.getParameter("login");
        String txt2 = request.getParameter("correo");
        

        if (accion.equalsIgnoreCase("Ingresar")) {
            String user = request.getParameter("txtnom");
            String pass = request.getParameter("txtcon");

            per = dao.validar(user, pass);
            if (per.getUsu() != null) {
                request.getRequestDispatcher("controlador?menu=Principal").forward(request, response);
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if (accion.equalsIgnoreCase("Registrar")) {

            per = new Persona(0, txt1, txt2);
            if (dao.registrar(per)) {
                request.getRequestDispatcher("controlador?accion=index").forward(request, response);
            } else {
                request.getRequestDispatcher("usuario.jsp").forward(request, response);
            }
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
