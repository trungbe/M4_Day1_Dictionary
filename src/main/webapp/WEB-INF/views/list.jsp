<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<h1>Từ điển</h1>
<form method="post" action="/dictionary">
    <input type="text" value="${word}" name="word">
    <h1>Từ ${word} có tiếng việt là ${result}</h1>
</form>
</body>
</html>
