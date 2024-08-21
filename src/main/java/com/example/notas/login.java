package com.example.notas;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/login")
public class login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Obtener los parámetros del formulario
        String usuarioIngresado = request.getParameter("usuario").toUpperCase(); // Convertir a mayúsculas
        String claveIngresada = request.getParameter("clave");

        // Obtener el usuario y la contraseña registrados desde la sesión
        HttpSession session = request.getSession();
        String usuarioRegistrado = (String) session.getAttribute("usuarioRegistrado");
        String contrasenaRegistrada = (String) session.getAttribute("contrasenaRegistrada");

        // Validar los datos ingresados
        if (usuarioIngresado.isEmpty() || claveIngresada.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("inicio_login.jsp");
            req.include(request, response);
        } else if (usuarioIngresado.equals(usuarioRegistrado) && claveIngresada.equals(contrasenaRegistrada)) {
            // Login exitoso
            request.setAttribute("nombreUsuario", usuarioRegistrado);
            RequestDispatcher req = request.getRequestDispatcher("login_correcto.jsp");
            req.forward(request, response);
        } else {
            // Login fallido
            RequestDispatcher req = request.getRequestDispatcher("inicio_login.jsp");
            req.include(request, response);
        }
    }
}
