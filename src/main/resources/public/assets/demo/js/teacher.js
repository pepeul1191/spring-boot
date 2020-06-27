window.onload = function() {
  var xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function() {
    if (xhr.readyState == XMLHttpRequest.DONE) {
      var carrers = JSON.parse(xhr.responseText);
      carrers.forEach(function(carrer){
        var option = document.createElement('OPTION');
        option.value = carrer.id;
        option.innerHTML = carrer.name;
        document.getElementById('slcCarrers').appendChild(option);
      });
    }
  };
  xhr.open('GET', BASE_URL + 'carrer/list', false);
  xhr.send()
};

function buscar(){
  // validation
  var valCarrer = document.getElementById('slcCarrers').value;
  if(valCarrer == 'E'){
    document.getElementById('message').innerHTML = 'Debe seleccionar una carrera';
  }else{
    // clean teachers
    while (document.getElementById('teachers').firstChild) {
      document.getElementById('teachers').removeChild(
        document.getElementById('teachers').firstChild
      );
    }
    // AJAX
    var url = BASE_URL + 'teacher/' + valCarrer + '/search?name=' + document.getElementById('txtName').value;
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
      if (xhr.readyState == XMLHttpRequest.DONE) {
        var teachers = JSON.parse(xhr.responseText);
        teachers.forEach(function(teacher){
          var col = document.createElement('DIV');
          col.classList.add('col-md-3');
          var card = document.createElement('CARD');
          var img = document.createElement('IMG');
          img.classList.add('card-img-top');
          img.src = teacher.img;
          img.alt = teacher.last_names + ', ' + teacher.names;
          var h5 = document.createElement('H5');
          h5.innerHTML = teacher.last_names;
          var p = document.createElement('P');
          p.innerHTML = teacher.names;
          var cardBody = document.createElement('DIV');
          cardBody.classList.add('card-body');
          cardBody.appendChild(h5);
          cardBody.appendChild(p);
          card.appendChild(img);
          card.appendChild(cardBody);
          col.appendChild(card);
          document.getElementById('teachers').appendChild(col);
        });
      }
    }
    xhr.open('GET', url, true);
    xhr.send();
  }
};

function limpiar(){
  document.getElementById('txtName').value = '';
  document.getElementById('slcCarrers').value = 'E';
  while (document.getElementById('teachers').firstChild) {
    document.getElementById('teachers').removeChild(
      document.getElementById('teachers').firstChild
    );
  }
}