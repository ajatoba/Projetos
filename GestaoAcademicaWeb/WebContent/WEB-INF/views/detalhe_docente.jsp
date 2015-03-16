<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Detalhe de Docentes</title>
</head>
<body>

<h3>Detalhe do Docente</h3>

<h3><a href="form">+ Novo Docente</a></h3>
<c:if  test="${!empty docente}">
	<table border="1">
	<tr>
		<td>Nome:</td><td>${docente.nome} </td>
	</tr>
	<tr>
		<td>Matrícula:</td><td>${docente.matricula} </td>
	</tr>
	<tr>
		<td>Titulação:</td><td>${docente.titulacao} </td>
	 </tr>
	 
	 <c:if  test="${!empty docente.projetos}">
		
		<tr>
		    <td colspan="2" align="center"><b>Projetos</b></td>
		</tr>
		<c:forEach items="${docente.projetos}" var="projeto">
		    <tr>
		        <td colspan="2">${projeto.titulo}</td>
		    </tr>
		</c:forEach>
	</c:if>
	 
	</table>
	
	
</c:if>
 
</body>
</html>