package idealistaTest.test;

import static org.junit.Assert.*;
import idealistaTest.util.WebConnector;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.*;

public class LanzadorSimpleCucumberIdealista {
	
	WebConnector conectorSelenium = new WebConnector();
	
	@Before
	public void setUp(){
		conectorSelenium.abrimosNavegador();
	}

	@Given ("the user gets in on the webpage \"([^\"]*)\"")
	public void El_usuario_entra_en_pagina(String nombrePagina)
	{
		conectorSelenium.irA(nombrePagina);
	}
	
	@When ("I press the button \"([^\"]*)\"")
	public void presionamos_boton_anuncios(String nombreBoton){
		conectorSelenium.clickByLinkText(nombreBoton);
	}
	
	@Then("I must see the button \"([^\"]*)\"")
	public void chequear_boton_vamos_alla(String nombreBoton){
		boolean present;
		present = conectorSelenium.isElementPresent(nombreBoton, "linkText");
		assertTrue("No se encuentra el boton con texto " + nombreBoton , present);

	}
	
	@Given ("the user press the button \"([^\"]*)\"")
	public void presiono_boton_vamos_alla (String nombreBoton)
	{
		boolean present;
		
		try {
			conectorSelenium.clickByLinkText(nombreBoton);
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		assertTrue("No se encuentra el boton con texto " + nombreBoton , present);
	}

	@Then("I must see the button id \"([^\"]*)\"")
	public void chequear_boton_vamos(String idBoton){
		
		boolean present;
		present = conectorSelenium.isElementPresent(idBoton, "id");
		assertTrue("No se encuentra el boton con texto " + idBoton , present);

	}
	
	
	@After
	public void tearDown(){
		conectorSelenium.finSesionNavegador();
	}

}
