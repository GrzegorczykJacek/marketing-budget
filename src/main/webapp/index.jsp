<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <h3>Test header</h3>
    <p>
        This is a sample paragraph <br/>
        <%
            out.print("This is some printed text via sciptlet :)");
        %>
        <br/>
        <%=
            "tralala"
        %>
    </p>
    <form name="login" method="post">
        Username: <input type="text" placeholder="username" name="username">
    </form>
</body>
</html>
