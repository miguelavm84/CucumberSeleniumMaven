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
  "name": "the user gets in on the webpage \"http://www.idealista.es\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I press the button with text \"pon tu anuncio gratis\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I must see the button with text \"vale, tengo las fotos, vamos allá »\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the user press the button with text \"vale, tengo las fotos, vamos allá »\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I must see the button with Id \"doLogin\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.idealista.es",
      "offset": 33
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.El_usuario_entra_en_pagina(String)"
});
formatter.result({
  "duration": 1284103000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pon tu anuncio gratis",
      "offset": 30
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.presionamos_boton_anuncios(String)"
});
formatter.result({
  "duration": 975607000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vale, tengo las fotos, vamos allá »",
      "offset": 33
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.chequear_boton_vamos_alla(String)"
});
formatter.result({
  "duration": 43574000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vale, tengo las fotos, vamos allá »",
      "offset": 37
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.presiono_boton_vamos_alla(String)"
});
formatter.result({
  "duration": 576480000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doLogin",
      "offset": 31
    }
  ],
  "location": "LanzadorSimpleCucumberIdealista.chequear_boton_vamos(String)"
});
formatter.result({
  "duration": 14639000,
  "status": "passed"
});
});