<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>PockerQuest (II) начало</title>
</head>
<body>
<h2>Классический покер</h2>
<p>Начинаем с трех карт на столе и далее до 5 карт, у игроков на руках по 2 карты. На каждом круге игрок либо участвует в ставке либо говорит ПАС - в таком случае игра для него заканчивается</p>
<p>Как Ваше имя?</p>
<form action="start" method ="post">
     <label for="playerName">"Представтесь, командир:"</label><br>
     <input type="text" id="playerName" name="playerName"
                placeholder="Введите Ваше имя" required
                value="${sessionScope.playerName !=null ? sessionScope.playerName : ''}"><br><br>
                <button type="submit">Начать приключение</button>
</form>
</body>
</html>
