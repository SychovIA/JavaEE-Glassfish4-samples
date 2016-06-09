<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Коментарии (${size}) </h2>
	<div style= "width: 320px; height: auto; border-style: inset;  border-width: 2px; border-color: white; padding: 10px" >
			${comment}
		</div>
		<form name="comments" action="comment" method="post" > 
			<label>Ваш коментарий:</label>
			<br>
			<textarea name="message" rows="10" cols="40" ></textarea>
			<br>
			<br>
			<input type="submit" name="send" value="Отправить коментарий">
		</form>


</body>
</html>