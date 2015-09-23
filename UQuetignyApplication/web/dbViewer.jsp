<%-- 
    Document   : index
    Created on : 3 janv. 2014, 15:42:12
    Author     : Yacine
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.uquetignywebapp.data.Collection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UQuetigny Web Page</title>
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>

        <%
            ArrayList col1 = (ArrayList) request.getAttribute("collec");
            if (col1.size() == 0){
                out.print("<BLINK><h1> Aucune donnée recu ou serveur Indisponible </h1></BLINK>");
            }
        %>
    </head>
    <body>
        <%
            
        %>

        <div data-role="page">


            <div data-role="header">
                <h1>DB Name : <% out.println(col1.size()); %></h1>
            </div>
            <div role="main" class="ui-content">
                <ul data-role="listview" data-theme="c" data-filter="true">

                    <% for (int i = 0; i < col1.size(); i++) {
                            out.println("<li data-filtertext="+col1.get(i)+">");
                            out.println("<a href='MainServlet?choice=" + col1.get(i) + "'>");
                            out.println(col1.get(i));
                            out.println("</a>");
                            out.println("</li>");

                        }
                    %>
                </ul>     

            </div>
            <div data-role="footer">
                <div data-role="navbar">
                    <ul>
                        <li><a href="MainServlet" data-icon="grid">Summary</a></li>
                        <li><a href="#" data-icon="star" class="ui-btn-active">Favs</a></li>
                        <li><a href="#" data-icon="gear">Setup</a></li>
                    </ul>
                </div><!-- /navbar -->
            </div>

        </div>
    </body>
</html>
