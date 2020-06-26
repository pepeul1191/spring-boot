window.onload = function() {
  var xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function() {
    if (xhr.readyState == XMLHttpRequest.DONE) {
      var types = JSON.parse(xhr.responseText);
      types.forEach(function(type){
        var option = document.createElement('OPTION');
        option.value = type.type;
        option.innerHTML = type.type;
        document.getElementById('slcTypes').appendChild(option);
      });
    }
  };
  xhr.open('GET', BASE_URL + 'pokemon/type/list', false);
  xhr.send()
};

function buscar(){
  // validation
  var valType = document.getElementById('slcTypes').value;
  if(valType == 'E'){
    document.getElementById('message').innerHTML = 'Debe seleccionar un tipo de pokemon';
  }else{
    // clean pokemons
    while (document.getElementById('pokemons').firstChild) {
      document.getElementById('pokemons').removeChild(
        document.getElementById('pokemons').firstChild
      );
    }
    // AJAX
    var url = BASE_URL + 'pokemon/search?name=' + document.getElementById('txtName').value + '&type=' + valType;
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
      if (xhr.readyState == XMLHttpRequest.DONE) {
        var pokemons = JSON.parse(xhr.responseText);
        pokemons.forEach(function(pokemon){
          var col = document.createElement('DIV');
          col.classList.add('col-md-3');
          var card = document.createElement('CARD');
          var img = document.createElement('IMG');
          img.classList.add('card-img-top');
          img.src = pokemon.img;
          img.alt = pokemon.name;
          var h5 = document.createElement('H5');
          h5.innerHTML = pokemon.name;
          var p = document.createElement('P');
          p.innerHTML = 'Tipos: ' + pokemon.type_1 + ', ' + pokemon.type_2 +
            '<br> Peso: ' + pokemon.weight + ' kg' +
            '<br> Altura: ' + pokemon.height + ' m';
          var cardBody = document.createElement('DIV');
          cardBody.classList.add('card-body');
          cardBody.appendChild(h5);
          cardBody.appendChild(p);
          card.appendChild(img);
          card.appendChild(cardBody);
          col.appendChild(card);
          document.getElementById('pokemons').appendChild(col);
        });
      }
    }
    xhr.open('GET', url, true);
    xhr.send();
  }
};

function limpiar(){
  document.getElementById('txtName').value = '';
  document.getElementById('slcTypes').value = 'E';
  while (document.getElementById('pokemons').firstChild) {
    document.getElementById('pokemons').removeChild(
      document.getElementById('pokemons').firstChild
    );
  }
}