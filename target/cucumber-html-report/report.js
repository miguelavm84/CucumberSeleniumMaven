$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('idealistaTest/test/idealistaTest.feature');
formatter.feature({
  "line": 1,
  "name": "DDR-35 - Check on publicar anuncio",
  "description": "",
  "id": "ddr-35---check-on-publicar-anuncio",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Enter on Idealista",
  "description": "",
  "id": "ddr-35---check-on-publicar-anuncio;enter-on-idealista",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user gets in on the webpage \"urlBase\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I press the button \"linkAnuncioGratis\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I must see the button \"linkVamosAlla\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the user press the button \"linkVamosAlla\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I must see the button id \"linkDoLogin\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "urlBase",
      "offset": 33
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.El_usuario_entra_en_pagina(String)"
});
formatter.result({
  "duration": 1704410000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "linkAnuncioGratis",
      "offset": 20
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.presionamos_boton_anuncios(String)"
});
formatter.result({
  "duration": 1081762000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "linkVamosAlla",
      "offset": 23
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.chequear_boton_vamos_alla(String)"
});
formatter.result({
  "duration": 46660000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "linkVamosAlla",
      "offset": 27
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.presiono_boton_vamos_alla(String)"
});
formatter.result({
  "duration": 633982000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "linkDoLogin",
      "offset": 26
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.chequear_boton_vamos(String)"
});
formatter.result({
  "duration": 10565000,
  "status": "passed"
});
});