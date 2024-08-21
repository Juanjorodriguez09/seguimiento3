<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Formulario de registro</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        table {
            width: 50%;
            margin: 0 auto;
        }

        td {
            padding: 5px 10px; /* Ajusta el espacio interno de las celdas */
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 5px;
            margin: 0;
        }

        input[type="submit"] {
            margin-top: 10px;
            padding: 8px 16px;
        }
    </style>
</head>
<body>
<h1 style="text-align: center;">Formulario para registro de usuarios</h1>
<form action="registro" method="post">
    <table>
        <tr>
            <td><label for="textNombre">Nombre:</label></td>
            <td><input type="text" name="textNombre" id="textNombre" required /></td>
        </tr>
        <tr>
            <td><label for="textApellido">Apellido:</label></td>
            <td><input type="text" name="textApellido" id="textApellido" required /></td>
        </tr>
        <tr>
            <td><label for="textUsuario">Usuario:</label></td>
            <td><input type="text" name="textUsuario" id="textUsuario" required /></td>
        </tr>
        <tr>
            <td><label for="passwordContrasena">Contraseña:</label></td>
            <td><input type="password" name="passwordContrasena" id="passwordContrasena" required /></td>
        </tr>
        <tr>
            <td><label for="textDireccion">Dirección:</label></td>
            <td><input type="text" name="textDireccion" id="textDireccion" required /></td>
        </tr>
        <tr>
            <td><label for="textMovilNro">Móvil Nro:</label></td>
            <td><input type="text" name="textMovilNro" id="textMovilNro" required /></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;"><input type="submit" value="Registrar" /></td>
        </tr>
    </table>
</form>
</body>
</html>
