<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>HeloQuest (II) начало</title>
</head>
<body>
<h2>Пролог</h2>
<p>Текст предистории</p>
<p>Как Ваше имя?</p>
<form action="start" method ="post">
     <label for="playerName">"Представтесь, командир:"</label><br>
     <input type="text" id="playerName" name="playerName"
                placeholder="Введите Ваше имя" required
                value="${sessionScope.playername !=null ? sessionScope.playername : ''}"><br><br>
                <button type="submit">Начать приключение</button>
</form>
</body>
</html>
