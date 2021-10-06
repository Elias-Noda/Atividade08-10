<%@page import="Java.Turno"%>
<%@page import="Java.Semestre"%>
<%@page import="Java.Campus"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Alunos</title>
    </head>
    <body>
        <div>
            <h3>Cadastro de Aluno</h3>
            <div id="div_dados"> <!-- //dar nome a divisória para ser usada na programação-->
                <p> Cadastrar Alunos </p>
                <form action="consulta_aluno.jsp" name="CadastroConsulta" method="post">> <!--  action:local destinado a receber as informações do backend, método é se vai receber ou enviar e target é em qual divisão será mostrado o valor procesado no backend -->
                <pre>
                   Cadastro de Alunos:

    Nome:        <input type="text" name="nome">
    Campus:      <%=new Campus().getCampus()%>
    RA:          <input type="text" name="RA">
    Curso:       <input type="text" name="curso">
    Semestre:    <%=new Semestre().getSemestre()%>
    Turno:       <%=new Turno().getTurno()%>

                   <input type="submit" value="Incluir dados" name="incluir"> <!-- type é o estilo do botão-->
                   <input type="reset" value="Limpar dados">
                </pre>
                
                </form>
            </div>
        </div>
    </body>
</html>