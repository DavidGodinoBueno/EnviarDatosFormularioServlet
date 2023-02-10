<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h2>Enviar sus datos</h2>
    <form action="Controller" method="post">
        <label>Nombre: </label>
        <input type="text" name="nombre"/><br><br>
        <label>Provincia: </label>
        <select name="provincia">
           <option value="Ciudad Real">Ciudad Real</option>
           <option value="Albacete">Albacete</option>
           <option value="Toledo">Toledo</option>
           <option value="Guadalajara">Guadalajara</option>
           <option value="Cuenca">Cuenca</option>
        </select><br><br>
        <label>Género: </label>
        <input type="radio" name="genero" value="Hombre"/>Hombre
        <input type="radio" name="genero" value="Mujer"/>Mujer
        <br><br>
        <input type="submit" value="Enviar"/>
    </form>
</body>
</html>