<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Cadastro de Docentes</title>
</head>
<body>

<h3>Formulário de Cadastro de Docentes</h3>
 
<form:form method="post" action="adicionar.html" commandName="docente">
 
    <table>
    <tr>
        <td>Nome:</td>
        <td><form:input path="nome" /></td> 
    </tr>
    <tr>
        <td>Matrícula:</td>
        <td><form:input path="matricula" /></td>
    </tr>
    <tr>
        <td>Titulação:</td>
        <td><form:input path="titulacao" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Salvar"/>
        </td>
    </tr>
</table>  
</form:form>
 
</body>
</html>