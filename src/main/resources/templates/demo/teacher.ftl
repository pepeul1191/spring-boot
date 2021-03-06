<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <link rel="shortcut icon" href="${constants["app.static-url"]}favicon.ico" type="image/x-icon">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta charset="UTF-8">
	<title>${title}</title>
  <#if csss?has_content>
    <#list csss as css>
      <link rel="stylesheet" type="text/css" href="${constants["app.static-url"]}${css}.css"/>
    </#list>
  </#if>
  <script type="text/javascript">
    const BASE_URL = "${constants["app.base-url"]}demo/";
    const STATIC_URL = "${constants["app.static-url"]}";
  </script>
<body>
<nav class="navbar navbar-light navbar-expand-lg navbar-light bg-light" style="background-color: #e3f2fd !important;">
  <div class="container">
    <a class="navbar-brand" href="#">Programación Web</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container" id="workspace">
  <div class="row">
    <div class="col-md-6">
      <h5>Universidad de Lima, Plana Docente</h5>
    </div>
    <div class="col-md-6">
      <label for="" id="message"></label>
    </div>
  </div>
  <div class="row">
    <div class="col-md-6">
      <p>${code} - ${name}</p>
    </div>
    <div class="col-md-6">
      <label for="" id="message"></label>
    </div>
  </div>
  <hr>
  <div class="row">
    <div class="col-md-3">
      <div class="form-group">
        <label for="slcCarrers">Carreras</label>
        <select class="form-control" id="slcCarrers">
          <option value="E"></option>
        </select>
      </div>
    </div>
    <div class="col-md-3">
      <div class="form-group">
        <label for="txtName">Nombre</label>
        <input type="text" class="form-control" id="txtName">
      </div>
    </div>
    <div class="col-md-3">
      <div class="form-group form-btn">
        <button class="btn btn-success" id="btnSearch" onclick="buscar()">Buscar</button>
        <button class="btn btn-warning" id="btnClean" onclick="limpiar()">Limpiar</button>
      </div>
    </div>
  </div>
  <div class="row" id="teachers">

  </div>
</div>
  <#if jss?has_content>
    <#list jss as js>
      <script type='text/javascript' src="${constants["app.static-url"]}${js}.js"></script>
    </#list>
  </#if>
  <script>
  </script>
  </body>
</html>