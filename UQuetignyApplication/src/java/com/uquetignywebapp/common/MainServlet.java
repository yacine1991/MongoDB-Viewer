package com.uquetignywebapp.common;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.uquetignywebapp.connection.ConnectionMongoDB;
import com.uquetignywebapp.connection.ConnectionPostgresDB;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Yacine
 */
@WebServlet(urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

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
            throws ServletException, IOException, UnknownHostException, SQLException {
        System.out.println("Processrequest");
        String type = request.getParameter("choice");

        if (type == null || type.isEmpty()) {
        }
        String url = null;

        ArrayList<String> col = new ArrayList<>();
        ArrayList<String> colDbGeneral = new ArrayList<>();
        colDbGeneral = getCollections(colDbGeneral);
        if (type.equals("displayDB")) {
            url = "/dbViewer.jsp";
            col = getCollections(col);
            System.out.println("Taille Apres le getCollections " + col.size());
            request.setAttribute("collec", col);
        }
        else{
             url = "/personneViewer.jsp";
            DBCollection test = getSpecificCollection(type);
            System.out.println("Test.getCount");
            System.out.println(test.getCount());
            ArrayList<Map> test2 = fillSpecificCollection(test);
            request.setAttribute("prof", test2);
            System.out.println("Liste of champs ");
            ArrayList ar = getListofChamps(type, 1);
            System.out.println(ar.toString());
        }
        /* else if (type.equals("Professeur")) {
            url = "/personneViewer.jsp";
            DBCollection test = getSpecificCollection("Professeur");
            System.out.println("Test.getCount");
            System.out.println(test.getCount());
            ArrayList<Map> test2 = fillSpecificCollection(test);
            request.setAttribute("prof", test2);
        } else if (type.equals("Personne")) {
            url = "/personneViewer.jsp";
            DBCollection test = getSpecificCollection("Personne");
            System.out.println("Test.getCount");
            System.out.println(test.getCount());
            ArrayList<Map> test2 = fillSpecificCollection(test);
            request.setAttribute("prof", test2);
        }
         else if (type.equals("Batiment")) {
            url = "/personneViewer.jsp";
            DBCollection test = getSpecificCollection("Personne");
            System.out.println("Test.getCount");
            System.out.println(test.getCount());
            ArrayList<Map> test2 = fillSpecificCollection(test);
            request.setAttribute("prof", test2);
        }*/

        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    public ArrayList getCollections(ArrayList col) throws UnknownHostException {
        ConnectionMongoDB conmgb = new ConnectionMongoDB();
        col = conmgb.getAllClassOfDb();
        return col;

    }
    public ArrayList getListofChamps(String nomdeTable, int numdetuple) throws UnknownHostException{
        DBCollection t = getSpecificCollection(nomdeTable);
        ArrayList<Map> test2 = fillSpecificCollection(t);
        Set s = test2.get(numdetuple).keySet();
        ArrayList<String> s2 = new ArrayList<>(s);
        return s2;
        
    }

    public DBCollection getSpecificCollection(String nomCollection) throws UnknownHostException {
        ConnectionMongoDB conmgb = new ConnectionMongoDB();
        DBCollection ObjectOfCollection = conmgb.getRecordsOfSpecificCollection(nomCollection);
        
        return ObjectOfCollection;
    }



    public ArrayList<Map> fillSpecificCollection(DBCollection ObjectsOfCollection) {
        ArrayList<Map> objectData = new ArrayList<>();
        try (DBCursor dbcur = ObjectsOfCollection.find()) {
            int i = 0;
            while (dbcur.hasNext()) {
                objectData.add(ObjectsOfCollection.find().toArray().get(i).toMap());
                dbcur.next();
                i++;
            }
        }
              return objectData;
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
            throws ServletException, IOException, UnknownHostException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            throws ServletException, IOException, UnknownHostException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
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
