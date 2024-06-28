<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<body>
<h1>File Upload Status</h1>

    <form action="/savesamples" method="POST">
        Id: <input type="text" name="id" /><br>
        Name: <input type="text" name="name" /><br>
        Age: <input type="text" name="age" /><br>
        
        <input type="submit" value="submit" />
    </form>

</body>
</html>