/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Medico;
import Modelo.MedicoDAO;
import Modelo.Paciente;
import Modelo.PacienteDAO;
import Modelo.PersonaDAO;
import Modelo.Servicio;
import Modelo.ServicioDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson
 */
public class controlador extends HttpServlet {

    PersonaDAO p;
    Servicio se = new Servicio();
    Medico me = new Medico();
    ServicioDAO s;
    MedicoDAO m;
    Paciente pa = new Paciente();
    PacienteDAO padao;

    int ide;

    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
        System.out.println("Conexion exitosa desde el servlet");
        try {
            //doy la orden de establecer la conexion
            s = new ServicioDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            m = new MedicoDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            padao = new PacienteDAO(jdbcURL, jdbcUSERName, jdbcPassword);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        String regis = request.getParameter("registrar");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("servicio")) {
            switch (accion) {
                case "Listar":
                    List lista = s.listar();
                    request.setAttribute("servicio", lista);
                    break;

                case "Agregar":
                    String nom = request.getParameter("txtnom");
                    String des = request.getParameter("txtdes");
                    se.setNombre(nom);
                    se.setDescripcion(des);
                    s.registrar(se);
                    request.getRequestDispatcher("controlador?menu=servicio&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Servicio e = s.listarId(ide);
                    request.setAttribute("servicio", e);
                    request.getRequestDispatcher("controlador?menu=servicio&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nom1 = request.getParameter("txtnom");
                    String des1 = request.getParameter("txtdes");
                    se.setNombre(nom1);
                    se.setDescripcion(des1);
                    se.setIdservicio(ide);
                    s.actualizar(se);
                    request.getRequestDispatcher("controlador?menu=servicio&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    s.delete(ide);

                    request.getRequestDispatcher("controlador?menu=servicio&accion=Listar").forward(request, response);
                    break;

                default:
                    throw new AssertionError();
            }

            request.getRequestDispatcher("servicio.jsp").forward(request, response);

        }
        if (menu.equals("cita")) {
            request.getRequestDispatcher("cita.jsp").forward(request, response);
        }
        if (menu.equals("medico")) {
            switch (accion) {
                case "Listar":
                    List lista = m.listar();
                    request.setAttribute("medico", lista);
                    break;
                case "Agregar":
                    //int area = Integer.parseInt(request.getParameter("txtarea"));
                    String area = request.getParameter("txtarea");
                    int num1 = Integer.parseInt(request.getParameter("txtcedula"));
                    String nom = request.getParameter("txtnombre");
                    String ape = request.getParameter("txtapellido");
                    int num2 = Integer.parseInt(request.getParameter("txttelefono"));

                    me.setFk_servicio_medico(area);
                    me.setCedula(num1);
                    me.setNombre(nom);
                    me.setApellido(ape);
                    me.setTelefono(num2);

                    m.agregar(me);
                    request.getRequestDispatcher("controlador?menu=medico&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Medico medi = m.listarId(ide);
                    request.setAttribute("medico", medi);
                    request.getRequestDispatcher("controlador?menu=medico&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":

                    //int area1 = Integer.parseInt(request.getParameter("txtarea"));
                    String area1 = request.getParameter("txtarea");
                    int num11 = Integer.parseInt(request.getParameter("txtcedula"));
                    String nom1 = request.getParameter("txtnombre");
                    String ape1 = request.getParameter("txtapellido");
                    int num21 = Integer.parseInt(request.getParameter("txttelefono"));
                    me.setFk_servicio_medico(area1);
                    me.setCedula(num11);
                    me.setNombre(nom1);
                    me.setApellido(ape1);
                    me.setTelefono(num21);

                    me.setIdmedico(ide);
                    m.actualizar(me);
                    request.getRequestDispatcher("controlador?menu=medico&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    m.delete(ide);

                    request.getRequestDispatcher("controlador?menu=medico&accion=Listar").forward(request, response);
                    break;

                default:
                    throw new AssertionError();

            }
            request.getRequestDispatcher("medico.jsp").forward(request, response);
        }
        if (menu.equals("registrar")) {
            switch (accion) {
                case "Listar":
                    List lista = padao.listar();
                    request.setAttribute("registrar", lista);
                    break;
                case "Agregar":
                    //int area = Integer.parseInt(request.getParameter("txtarea"));
                    String txtnom = request.getParameter("nombre");
                    String txtape = request.getParameter("ape");
                    String txtce = request.getParameter("ce");
                    String tele = request.getParameter("tele");
                    float peso = Integer.parseInt(request.getParameter("peso"));
                    float altu = Integer.parseInt(request.getParameter("altura"));
                    int edad = Integer.parseInt(request.getParameter("edad"));
                    String aler = request.getParameter("alergias");
                    String enfer = request.getParameter("enfer");
                    String tipo = request.getParameter("tipo");
                    pa.setNombres(txtnom);
                    pa.setApellidos(txtape);
                    pa.setTelefono(tele);
                    pa.setPeso(peso);
                    pa.setAltura(altu);
                    pa.setEdad(edad);
                    pa.setAlergias(aler);
                    pa.setEnfermedades(enfer);
                    pa.setTiposangre(tipo);
                    padao.agregar(pa);
                    request.getRequestDispatcher("controlador?menu=registrar&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("registrar.jsp").forward(request, response);
        }

        if (menu.equals("reportes")) {
            request.getRequestDispatcher("reportes.jsp").forward(request, response);
        }

        switch (regis) {
            case "index":
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            default:
                throw new AssertionError();
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
        processRequest(request, response);
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
