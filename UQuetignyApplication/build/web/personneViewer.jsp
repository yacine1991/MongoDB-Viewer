<%-- 
    Document   : index
    Created on : 3 janv. 2014, 15:42:12
    Author     : Yacine
--%>

<%@page import="com.uquetignywebapp.data.Personne"%>
<%@page import="com.uquetignywebapp.data.Collection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UQuetigny Web Page</title>
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.0/jquery.mobile-1.4.0.min.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="http://code.jquery.com/mobile/1.4.0/jquery.mobile-1.4.0.min.js"></script>

    </head>
    <body>

        <div data-role="page">
            <%
                
                
            %>

            <div data-role="header">
                <h1>Personne Name : <%%></h1>
            </div>
            <div role="main" class="ui-content">
                <ul data-role="listview" data-theme="c">
                
                   
                </ul>
                
                
                
                
            </div>
            <div data-role="footer">
                <div data-role="navbar">
                    <ul>
                        <li><a href="#" data-icon="grid">Summary</a></li>
                        <li><a href="#" data-icon="star" class="ui-btn-active">Favs</a></li>
                        <li><a href="#" data-icon="gear">Setup</a></li>
                    </ul>
                </div><!-- /navbar -->
            </div>

        </div>
    </body>
</html>
