<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600|Open+Sans" rel="stylesheet"> 
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
        <link rel="stylesheet" href="estilos.css">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card" col-sm-6>
                <div class="card-body">
                    <form action="controlador?menu=medico" method="POST">
                        <div class="form-group">
                            <label>Area</label>
                            <select  class="form-control" name="accion" >
                                <option value="1">opcion 1</option>
                                <option value="2">opcion 2</option>
                                <option value="3">opcion 3</option>
                                <option value="4">opcion 4</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Cedula</label>
                            <input type="text" value="" name="txtdescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" value="" name="txtdescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Apellido</label>
                            <input type="text" value="" name="txtdescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> Telefono</label>
                            <input type="text" value="" name="txtdescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                                Fecha Y Hora
                            </button>
                            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Horas y dias Disponibles</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <form action="" method="POST">
                                                <div class="form-group">
                                                    <input type="checkbox" name="so" value="Lunes">Lunes
                                                    <input type="checkbox" name="so" value="Martes">Martes
                                                    <input type="checkbox" name="so" value="Miercoles">Miercoles
                                                    <input type="checkbox" name="so" value="Jueves">Jueves
                                                    <input type="checkbox" name="so" value="Viernes">Viernes
                                                </div>
                                                <div>
                                                    Desde <input type="time" name="so" value="1">
                                                    Hasta<input type="time" name="so" value="1">
                                                </div>
                                            </form>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                            <button type="button" class="btn btn-primary">Guardar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
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
                            <th>Idmedico</th>
                            <th>Area</th>
                            <th>Cedula</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Telefono</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="em" items="${medico}">
                            <tr>
                                <td>${em.getIdmedico()}</td>
                                <td>${em.getFk_servicio_medico()}</td>
                                <td>${em.getCedula()}</td>
                                <td>${em.getNombre()}</td>
                                <td>${em.getApellido()}</td>
                                <td>${em.getTelefono()}</td>
                                <td>
                                    <a class="btn btn-warning" href="controlador?menu=medico&accion=Editar&id=${em.getIdmedico() }"> Editar</a>
                                    <a class="btn btn-danger" href="controlador?menu=medico&accion=Delete&id=${em.getIdmedico() }"> Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="nuevo.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
