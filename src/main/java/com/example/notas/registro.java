package com.example.notas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/registro")
public class registro extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recibir los parámetros del formulario
        String nombre = request.getParameter("textNombre");
        String apellido = request.getParameter("textApellido");
        String usuario = request.getParameter("textUsuario").toUpperCase(); // Convertir a mayúsculas
        String contrasena = request.getParameter("passwordContrasena");
        String direccion = request.getParameter("textDireccion");
        String movilNro = request.getParameter("textMovilNro");

        // Guardar los datos en la sesión
        HttpSession session = request.getSession();
        session.setAttribute("usuarioRegistrado", usuario);
        session.setAttribute("contrasenaRegistrada", contrasena);

        // Redirigir al JSP de inicio de sesión
        response.sendRedirect("inicio_login.jsp");
    }
}
