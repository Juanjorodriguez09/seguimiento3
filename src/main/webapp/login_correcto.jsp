<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ingreso correcto</title>
</head>
<body>
<table style="width: 50%">
    <tr>
        <td>
            <%
                String usuario = (String) request.getAttribute("nombreUsuario");
            %>
            <a>Bienvenid@ <%= usuario.toUpperCase() %> Su inicio de sesión es correcto!!!.</a>
        </td>
    </tr>
    <tr></tr>
    <tr>
        <td>
            <a href="index.jsp"><b>Cerrar sesión</b></a>
        </td>
    </tr>
</table>

<hr>
<h3>Información sobre directivas JSP:</h3>
<table border="1" style="width: 100%">
    <tr>
        <th>Directiva</th>
        <th>De que trata</th>
    </tr>
    <tr>
        <td>La directiva page</td>
        <td>Atributos de la directiva page: language, extends, import, session, buffer, autoFlush, isThreadSafe, info, errorPage, isErrorPage, contentType, pageEncoding</td>
    </tr>
    <tr>
        <td>La directiva taglib</td>
        <td>Atributos de la directiva: uri, prefix</td>
    </tr>
    <tr>
        <td>La directiva include</td>
        <td>Atributos de la directiva: file. y hacer un ejemplo en esta misma sección</td>
    </tr>
</table>



</body>
</html>