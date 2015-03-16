<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Listagem de Docentes</title>
</head>
<body>

<h3>Docentes Cadastrados</h3>

<h3><a href="form">+ Novo Docente</a></h3>
<c:if  test="${!empty docenteList}">
<table border="1">
<tr>
    <th>Nome</th>
    <th>Matrícula</th>
    <th>Titulação</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${docenteList}" var="docente">
    <tr>
        <td>${docente.nome} </td>
        <td>${docente.matricula}</td>
        <td>${docente.titulacao}</td>
        <td><a href="detalhe/${docente.id}">Ver detalhes</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>