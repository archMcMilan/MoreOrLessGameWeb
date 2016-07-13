<%@page import="view.View"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Game</title>
</head>
<body>
	<p>
	<a href = "index.html">Start new game</a><br>
	<h3><c:out value="${answer}"/></h3><br>
	Hideen value is in measures: (<c:out value="${game.getLeftBorder()};${game.getRightBorder()}"/>)</p>
	<p>Enter your value into the field:</p>
	<form method="Post" action="GameProcess">
		<table>
			<tr>
				<td><input type="number" name="userValue" value = "0"></td>
			</tr>
			<tr align="center">
				<td><p><input type="submit" value="Check"></p></td>
			</tr>
		</table>
	</form>
	<c:forEach var="st" items="${game.getStatistics()}">
			<c:out value="${st}"/><br>
	</c:forEach>
</body>
</html>