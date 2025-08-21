
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="org.example.service.VehicleService" %>
<%@ page import="org.example.app.AppContext" %>
<%@ page import="org.example.model.Vehicle" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.service.DriverService" %>
<%@ page import="org.example.model.Driver" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 20/08/2025
  Time: 5:06 p. m.
  To change this template use File | Settings | File Templates.
--%>

<%
    DriverService driverService = AppContext.getInstance()
            .getBean("driverService", DriverService.class);
    List<Driver> d = driverService.getDrivers();
%>

<html>
<head>
    <title>Lista de CONDUCTORES</title>
</head>
<body>
<h2>CONDUCTORES Registrados</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Cargo</th>
        <th>Tipo ID</th>
        <th>Numero Identificacion</th>

    </tr>

    <% for(Driver driver : d) { %>
    <tr>
        <td><%= driver.getId() %></td>
        <td><%= driver.getName() %></td>
        <td><%= driver.getOccupation() %></td>
        <td><%= driver.getTypeId() %></td>
        <td><%= driver.getNumberIdentification() %></td>

    </tr>
    <% } %>
</table>

<a href="addDriver.jsp">Agregar Conductor</a>

<a href="index.jsp">
    <button type="button">HOME</button>
</a>
</body>
</html>