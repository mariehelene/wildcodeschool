<%--
  Created by IntelliJ IDEA.
  User: mhd
  Date: 18/07/19
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Identification</title>
</head>
<body>
    <form action="simple-hello" method="POST" class="">
        <div class="">
            <label for="firstname">Prénom :</label>
            <input type="text" name="firstname" id="firstname" required>
        </div>
        <div class="">
            <label for="name">Nom :</label>
            <input type="text" name="name" id="name" required>
        </div>
        <div class="">
            <label for="time">Quelle heure est-il (HHMM) ?</label>
            <input type="time" name="time" id="time" required>
        </div>
        <div class="">
            <input type="submit" value="Hop!">
        </div>
    </form>
</body>
</html>
