<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Cadastro de Docentes</title>
</head>
<body>

<h3>Formul�rio de Cadastro de Docentes</h3>
 
<form:form method="post" modelAttribute="docenteModel">
    <table>
    <tr>
        <td>Nome:</td>
        <td><form:input path="nome" /></td> 
    </tr>
    <tr>
        <td>Matr�cula:</td>
        <td><form:input path="matricula" /></td>
    </tr>
    <tr>
        <td>Titula��o:</td>
        <td><form:input path="titulacao" /></td>
    </tr>
    <tr>
        <td>
            <input type="submit" name="_eventId_inserir" value="Salvar"/>            
        </td>
        <td>
            <input type="submit" name="_eventId_cancelar" value="Cancelar"/>                      
        </td>
    </tr>
</table>  
</form:form>
 
</body>
</html>