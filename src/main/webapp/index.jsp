<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>

    </head>
    <body>
        <h2>Startuje index.jsp</h2>
         <form action="/dodaj" method="post">
              Liczba 1:<br>
              <input type="text" name="p1" ><br>
              Liczba 2:<br>
              <input type="text" name="p2" ><br><br>
              <input type="submit" value="Policz">
        </form>

    <div>
        <a href="osoba-form-to-mysql.jsp" >Przejdź do formularza</a>
    </div>
    </body>
</html>
