Feature: DDR-35 - Check on publicar anuncio

Scenario:Enter on Idealista
	Given the user gets in on the webpage "http://www.idealista.es"
	When I press the button with text "pon tu anuncio gratis"
    Then I must see the button with text "vale, tengo las fotos, vamos allá »"
	Given the user press the button with text "vale, tengo las fotos, vamos allá »"
	Then I must see the button with Id "doLogin"