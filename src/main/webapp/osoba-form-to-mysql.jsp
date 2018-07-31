<%--
  Formularz do wprowadzenia danyh do bazy mySql
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formularz osobowy</title>
</head>
<body>
<h1>Zapisz do bazy danych</h1>
<form action="wynik-dodania-do-bazy.jsp" method="post">
    <table>
        <tr>
            <th><label>Podaj id</label></th>
            <th><label>Podaj imię</label></th>
            <th><label>Podaj nazwisko</label></th>
            <th><label>Podaj wiek</label></th>
        </tr>
        <tr>
            <td><input type="number" name="id"></td>

            <td><input type="text" name="firstname"></td>

            <td><input type="text" name="surname"></td>

            <td><input type="number" name="age" min="18" max="100"></td>
        </tr>
    </table>
    <p><input type="image" src="picture/klawisz-wprowadz.png" onclick="this.form.submit()" title="enter" alt="button-enter" value="Enter" width="200px" align="left"></p>
</form>
<br>
<div>
    <br>
    <a href="index.jsp"><img src="picture/powrot.gif" alt="powrót" title="Powrót" width="200px" ></a>
</div>
<br>


</body>
</html>
