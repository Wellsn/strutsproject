<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro de Alunos</title>
</head>
<body>
<s:actionerror />
<s:actionmessage />
<s:form action="cadastrar">
	<s:textfield label="Nome" name="pessoa.nome"/>
	<s:textfield label="idade" name="pessoa.idade"/>
	<s:textfield label="Sexo" name="pessoa.sexo"/>
	<s:submit value="Enviar"/>
	
		<table border="1" cellspacing="0">
	<tr>
		<th>Nome</th>
		<th>Idade</th>
		<th>sexo</th>
	</tr>
	<s:iterator value="lista">
		<tr>
			<td><s:property value="nome"/></td>
			<td><s:property value="idade"/></td>
			<td><s:property value="sexo"/></td>
		</tr>
	</s:iterator>
	</table>
</s:form>
</body>
</html>