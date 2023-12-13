<%-- 
    Document   : cita
    Created on : 29/03/2021, 14:50:11
    Author     : Anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="d-flex">
            <div class="card" col-sm-6>
                <div class="card-body">
                    <form action="controlador?menu=servicio" method="POST">

                        <div class="form-group">
                            <label>Paciente</label>
                            <select name="accion" class="form-control">
                                <option value="Administracion de empresas">Desarrollo de Software</option>
                                <option value="Desarrollo de Software">Administracion de empresas</option>
                                <option value="Diseño Grafico">Diseño Grafico</option>
                                <option value="Derecho">Derecho</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Especialidad</label>
                            <select name="accion" class="form-control">
                                <option value="Administracion de empresas">Desarrollo de Software</option>
                                <option value="Desarrollo de Software">Administracion de empresas</option>
                                <option value="Diseño Grafico">Diseño Grafico</option>
                                <option value="Derecho">Derecho</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Medico</label>
                            <select name="accion" class="form-control">
                                <option value="Administracion de empresas">Desarrollo de Software</option>
                                <option value="Desarrollo de Software">Administracion de empresas</option>
                                <option value="Diseño Grafico">Diseño Grafico</option>
                                <option value="Derecho">Derecho</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <input type="date" name="trip-start"class="form-control">
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
                            <th>Id_Servicio</th>
                            <th>Nombre</th>
                            <th>Descripcio</th>
                        </tr>
                    </thead>
                    <tbody>
                   

                    </tbody>
                </table>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
