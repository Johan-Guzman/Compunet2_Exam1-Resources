package org.example.servlet;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.app.AppContext;
import org.example.model.Vehiculo;
import org.example.service.VehiculoService;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@WebServlet("/vehicles")
public class VehiculoServlet extends HttpServlet {
    private VehiculoService vehiculoService ;


    @Override
    public void init(ServletConfig config) throws ServletException {
        vehiculoService = AppContext.getInstance().getBean("vehiculoService",VehiculoService.class);
    }



    //EN EL JSP LOS NOMBRE QUE LE PONGAS A LAS ETIQUETAS EN EL HTML, DEBEN SER LOS MISMOS QE USASTE EN ESTE METODO O SINO NO TE GUARDAN, GUZ

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        vehiculoService.agregarVehiculo(new Vehiculo(
                req.getParameter("id"),
                req.getParameter("placa"),
                req.getParameter("cilindraje"),
                req.getParameter("tipoCombustible"),
                req.getParameter("numeroMotor"),
                req.getParameter("marca"),
                req.getParameter("modelo"),
                req.getParameter("")

        ));

        //_------------------------------------------------------------------------------------------------------------------
        //SI ALGO DEBE SER OBLIGATORIO INT AQUI TE DEJO, UNA VERSION PARSEANDO:

//        String id = req.getParameter("id");
//        String placa = req.getParameter("placa");
//        int cilindraje = Integer.parseInt(req.getParameter("cilindraje"));
//        String tipoCombustible = req.getParameter("tipoCombustible");
//        String numeroMotor = req.getParameter("numeroMotor");
//        String marca = req.getParameter("marca");
//        int modelo = Integer.parseInt(req.getParameter("modelo"));
//        String conductorId = req.getParameter("conductorId");
//
//        Vehicle vehicle = new Vehicle(id, placa, cilindraje, tipoCombustible,
//                numeroMotor, marca, modelo, conductorId);
//        vehicleService.addVehicle(vehicle);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
