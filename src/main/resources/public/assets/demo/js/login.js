function aHrefClick(txtButton)
{
  console.log(txtButton)
  var loginMessage = document.getElementById('loginMessage');
  loginMessage.innerHTML = 'Función "' + txtButton + '" aún no implementada';
  loginMessage.classList.add('text-danger');
  return false;
}