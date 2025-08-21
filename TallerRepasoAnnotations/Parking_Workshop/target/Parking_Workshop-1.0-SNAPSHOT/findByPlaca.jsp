<%@ page import="org.example.model.Vehicle" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.service.VehicleService" %>
<%@ page import="org.example.app.AppContext" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 21/08/2025
  Time: 11:27 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  VehicleService vehicleService = AppContext.getInstance()
          .getBean("vehicleService", VehicleService.class);
  List<Vehicle> vehicles = vehicleService.getVehicles();
%>

<label>INGRESA LA PLACA</label>

<form action="vehicles" method="get">
<input TYPE="text" NAME="placa">
<INPUT TYPE="SUBMIT"></button>

  <% Vehicle v = (Vehicle) request.getAttribute("vehiculo"); %>

  <% if (v != null) { %>
  <h2>Vehículo encontrado</h2>
  <p>Placa: <%= v.getPlaca() %></p>
  <p>Marca: <%= v.getBrand() %></p>
  <p>Modelo: <%= v.getModel() %></p>
  <P>Conductor: <%=v.getConductorId()%></P>
  <% } else { %>
  <p>No se encontró ningún vehículo con esa placa.</p>
  <% } %>


</form>

<a href="index.jsp">
  <button type="button">HOME</button>
</a>


