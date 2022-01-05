<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>News</title>
</head>
<body background="C:\Users\shree\Desktop\download.jpg">
<header style="text-align:centre">NEWSPAPERS INFORMATION</header>


<h1 >Welcome to NewsPaper App</h1>
<h1>${validationMessage}</h1>

<form action="submitnewspaper.do">
<pre>

NAME:<input type="text" name="newspapername">

PRICE:<input type="text" name="price">

LANGUAGE:English<input type="radio" name="language">Hindi<input type="radio" name="languge">

NOOFPAGES:<input type="text" name="noOfPages">
<div>
<input type="submit" value="submit">
<input type="reset" value="reset">
</div>
</pre>
<footer>copyRight@2021</footer>
</form>
<h2>${searchvalidationMesage}</h2>
<form action="searchNewsPaper.do">
<label>Search</label> <input type="text" name="searchNewsPaper">
<input type="submit" value="searchNewsPaper">


</form>
<h1>${NOTFOUND}</h1>
<ol>
<li>${NEWSPAPERNAME}</li>
<li>${PRICE}</li>
<li>${LANGUAGE}</li>
<li>${NOOFPAGES}</li>
</ol>
</body>
</html>