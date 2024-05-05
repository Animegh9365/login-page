<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>
    <h1>Welcome to the login page</h1>
    <br>
    <br>
    <h2>${errorMsg}</h2>
    <form action="/login" method="post">
        <input type="text" name="userid" placeholder="User Id">
        <br><br>
        <input type="text" name="password" placeholder="Password">
        <br><br>
        <button>Submit</button>
    </form>
</body>
</html>