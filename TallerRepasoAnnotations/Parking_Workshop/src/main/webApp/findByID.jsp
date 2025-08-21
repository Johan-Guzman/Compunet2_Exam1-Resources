<%@ page import="org.example.model.Vehicle" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.service.VehicleService" %>
<%@ page import="org.example.app.AppContext" %>
<%@ page import="org.example.model.Driver" %>
<%@ page import="org.example.service.DriverService" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 21/08/2025
  Time: 11:27 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  DriverService driverService = AppContext.getInstance()
          .getBean("driverService", DriverService.class);
  ArrayList<Driver> drivers = driverService.getDrivers();
%>

<label>INGRESA LA CEDULA</label>

<form action="driver" method="get">
  <input TYPE="text" NAME="numberIdentification">
  <INPUT TYPE="SUBMIT"></button>

  <% Driver d = (Driver) request.getAttribute("driver"); %>

  <% if (d != null) { %>
  <h2>Conductor encontrado</h2>
  <table border="1">
    <tr>
      <th>Placa</th>
      <th>Cilindraje</th>
      <th>Combustible</th>
      <th>Motor</th>
      <th>Marca</th>
      <th>Modelo</th>
    </tr>
    <% for (Vehicle v : d.getVehicles()) { %>
    <tr>
      <td><%= v.getPlaca() %></td>
      <td><%= v.getCilindraje() %></td>
      <td><%= v.getTypeFuel() %></td>
      <td><%= v.getNumberMotor() %></td>
      <td><%= v.getBrand() %></td>
      <td><%= v.getModel() %></td>
    </tr>
    <% } %>
  </table>
  <% } else { %>
  <p>No se encontró ningún conductor con esa cédula.</p>
  <% } %>


</form>

<a href="index.jsp">
  <button type="button">HOME</button>
</a>


