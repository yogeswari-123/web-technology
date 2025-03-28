<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Visitor Counter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        h2 {
            color: blue;
        }
    </style>
</head>
<body>

<% 
    // Check if the session is new
    if (session.isNew()) {
        // Retrieve visitor count from application scope
        Integer visitorCount = (Integer) application.getAttribute("visitorCount");
        
        // If visitorCount is null, initialize it
        if (visitorCount == null) {
            visitorCount = 1;
        } else {
            visitorCount++;
        }
        
        // Update visitor count in application scope
        application.setAttribute("visitorCount", visitorCount);
    }
%>

    <h2>Welcome to Our Website</h2>
    <p><strong>Total Visitors:</strong> <%= application.getAttribute("visitorCount") %></p>

</body>
</html>
