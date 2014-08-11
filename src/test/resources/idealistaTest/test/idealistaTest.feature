Feature: DDR-35 - Check on publicar anuncio

Scenario:Enter on Idealista
	Given the user gets in on the webpage "urlBase"
	When I press the button "linkAnuncioGratis"
    Then I must see the button "linkVamosAlla"
	Given the user press the button "linkVamosAlla"
	Then I must see the button "linkDoLogin"