<#include "../partials/blank_header.ftl"/>
<form class="form-signin" action="/demo/login" method="post">
  <h1 class="h3 mb-3 font-weight-normal">Bienvenido</h1>
  <input type="hidden" name="key" value="value">
  <span class="extraData"></span>
  <!--USER -->
  <label for="user" class="sr-only">Código</label>
  <input type="text" id="code" class="form-control" placeholder="Código" required="" autofocus="" name="code">
  <!--USER -->
  <label for="user" class="sr-only">Nombre Completo</label>
  <input type="text" id="name" class="form-control" placeholder="Nombre Completo" required="" autofocus="" name="name">
  <!--MESSAGE-->
  <p class="${message_color} message" style="margin-top:10px;" id="loginMessage">${message}</p>
  <!--BUTTON -->
  <button class="btn btn-lg btn-primary btn-block" type="submit">
    Ingresar
  </button>
  <!--FooTER LOGIN NAV -->
  <div class="link-login">
    <a class="" href="#" onclick="aHrefClick('Registrarse')">
      Registrarse
    </a>
    <a id="forgotpassword" class="pull-right" href="#" onclick="aHrefClick('Olvidó su Contraseña')">
      Olvidó su Contraseña
    </a>
  </div>
  <p class="mt-5 mb-3 text-muted">Powered By <a href="https://github.com/pepeul1191"> Pepito</a> © 2020</p>
</form>
<#include "../partials/blank_footer.ftl"/>