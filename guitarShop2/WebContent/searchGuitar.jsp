<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	 <div>
	 	<form action="matchingGuitar" method="post">
	 		<label>Builder:</label>
	 		<select name="builder">
	 			<option value=""></option>
	 			<option value="rosen">rosen</option>
	 			<option value="Lankro">Lankro</option>
	 			<option value="Kepma">Kepma</option>
	 			<option value="Geek">Geek</option>
	 			<option value="Matilda">Matilda</option>
	 			<option value="Hailun">Hailun</option>
	 			<option value="Califor">Califor</option>
	 			<option value="Califor">Aidy Music</option>
	 			<option value="Califor">enya</option>
	 			<option value="Califor">Minsine</option>
	 		</select>
	 		
	 		<label>Type:</label>
	 		<select name="type">
	 			<option value=""></option>
	 			<option value="D15">D15</option>
	 			<option value="D16">D16</option>
	 			<option value="A1C">A1C</option>
	 			<option value="CLF390C">CLF390C</option>
	 			<option value="youth599">youth599</option>
	 			<option value="AD401">AD401</option>
	 			<option value="D1C">D1C</option>
	 		</select>
	 		
	 		<label>BackWood:</label>
	 		<select name="backwood">
	 			<option value=""></option>
	 			<option value="椴木">椴木</option>
				<option value="杉木">杉木</option>
				<option value="沙比利">沙比利</option>
				<option value="云杉木">云杉木</option>
				<option value="桃花心木">桃花心木</option>
				<option value="其他">其他</option>
	 		</select>
	 		
	 		<label>TopWood:</label>
	 		<select name="topwood">
	 			<option value=""></option>
	 			<option value="椴木">椴木</option>
				<option value="杉木">杉木</option>
				<option value="云杉木">云杉木</option>
				<option value="其他">其他</option>
	 		</select>
	 		<input type="submit" name="search" value="Search"/>	 		
	 	</form>
	 </div>
	 
</body>
</html>