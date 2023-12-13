<%-- 
    Document   : registrar
    Created on : 29/03/2021, 14:51:14
    Author     : Anderson
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card" col-sm-6>
                <div class="card-body">
                    <form action="controlador?menu=registrar" method="POST">

                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" value="" name="nombre" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Apellido</label>
                            <input type="text" value="" name="ape" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Cedula</label>
                            <input type="text" value="" name="ce" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Telefono</label>
                            <input type="text" value="" name="tele" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Peso</label>
                            <input type="number" value="" name="peso" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Altura</label>
                            <input type="number" value="" name="altura" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Edad</label>
                            <input type="number" value="" name="edad" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Alergias</label>
                            <input type="text" value="" name="alergias" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Enfermedades</label>
                            <input type="text" value="" name="enfer" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Tipo Sangre</label>
                            <input type="text" value="" name="tipo" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-dark">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-dark">
                    </form>
                </div>
            </div>
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Idpaciente</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Cedula</th>
                            <th>Telefono</th>
                            <th>Peso</th>
                            <th>Altura</th>
                            <th>Edad</th>
                            <th>Alergias</th>
                            <th>Enfermedades</th>
                            <th>Tipo Sangre</th>


                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="em" items="${registrar}">
                            <tr>
                                <td>${em.getIdpaciente()}</td>
                                <td>${em.getNombres()}</td>
                                <td>${em.getCedula()}</td>
                                <td>${em.getApellidos()}</td>
                                <td>${em.getTelefono()}</td>
                                <td>${em.getPeso()}</td>
                                <td>${em.getAltura()}</td>
                                <td>${em.getEdad()}</td>
                                <td>${em.getAlergias()}</td>
                                <td>${em.getEnfermedades()}</td>
                                <td>${em.getTiposangre()}</td>

                                <td>
                                    <a class="btn btn-warning" href="controlador?menu=registrar&accion=Editar&id=${em.getIdpaciente() }"> Editar</a>
                                    <a class="btn btn-danger" href="controlador?menu=registrar&accion=Delete&id=${em.getIdpaciente() }"> Delete</a>
                                </td>

                            </tr>
                        </c:forEach>

                    </tbody>
                </table>

            </div>

        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
