<%--
  Created by IntelliJ IDEA.
  User: juanjoserodriguez
  Date: 20/08/24
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Formulario de inicio de sesión.</title>
</head>
<body>
<form action="login" method="post">
    <table style="with: 50%">
        <tr>
            <td>Usuario:</td>
            <td><input type="text" name="usuario" /></td>
        </tr>
        <tr>
            <td>Contraseña:</td>
            <td><input type="password" name="clave" /></td>
        </tr>
    </table>
    <input type="submit" value="Iniciar" /></form>
</body>
</html>

