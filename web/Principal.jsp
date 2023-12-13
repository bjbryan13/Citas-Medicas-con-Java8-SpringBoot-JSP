<%-- 
    Document   : Principal
    Created on : 29/03/2021, 14:49:44
    Author     : Anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
 <link href="css/principal.css" rel="stylesheet" >
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="ide">
                        <a class="btn btn-outline-light" href="">Inicio</a>
                    </li>
                    <li class="ide">
                        <a  class="btn btn-outline-light" href="controlador?menu=servicio&accion=Listar" target="myFrame">Especialidad</a>
                    </li>
                    <li class="ide">
                        <a class="btn btn-outline-light" href="controlador?menu=medico&accion=Listar" target="myFrame">Medico</a>
                    </li>
                    <li class="ide">
                        <a class="btn btn-outline-light" href="controlador?menu=registrar&accion=Listar" target="myFrame">Paciente</a>
                    </li>
                    <li class="ide">
                        <a class="btn btn-outline-light" href="controlador?menu=cita" target="myFrame">Cita</a>
                    </li>
                     <li class="ide">
                        <a class="btn btn-outline-light" href="controlador?menu=reportes" target="myFrame">Reportes</a>
                    </li>

                </ul>
            </div>
            <div class="dropdown">
                <button  class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                    Usuario Ingresado
                </button>
                <div class=" dropdown-menu text-center">
                    <a class="dropdown-item" href="#">  
                        <img src="usuario.jpg" alt="60" width="60">
                    </a>
                    <a class="dropdown-item" href="#">Usuario</a>
                    <a class="dropdown-item" href="#">example@gmail.com</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Salir</a>
                </div>
            </div>
        </nav>
        <div class="m-4">
            <iframe name="myFrame" class="cuadro">
                <h1>hola</h1>
            </iframe>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
