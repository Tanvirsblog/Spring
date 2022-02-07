<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingUP</title>
</head>
<body background="D:/java/spring/vaccine-aap/src/main/webapp/images/covidvaccine.jpeg">
<div align="center">
<header style="margin-top:5%;font-size:25px;">Ministry of Health and Family Welfare</header>
<body>
    <h1>Vaccine SignUp Form</h1>
    <form  action="Submit.do">
        
        <div>
            <label>UserName</label>
            <input type="text" name="userName">
        </div>
        <br>
        
        <div>
            <label>Gender</label>
            
            <input type="radio" name="Gender" value="Male">Male
            <input type="radio" name="Gender" value="Female">Female
            <input type="radio" name="Gender" value="Other">Other
        </div>
        <br>
        <div>
            <label> DOB</label>
            <input type="date" name="dob">
        </div>
        <br>
        <div>
            <label>Password</label>
            <input type="password" name="password">
        </div>
        <br>
        <div>
            <label>Confirm Password</label>
            <input type="confirmPassword" name="confirmPassword">
        </div>
        <br>
         <div>
            <input type="submit" value="Submit">
            
        </div>

<footer style="margin-bottom:2%;font-size:15px;" >Copyright@2022 COWIN.All Rights Reserved</footer>
</pre>
</form>
</div>

</body>
</html>