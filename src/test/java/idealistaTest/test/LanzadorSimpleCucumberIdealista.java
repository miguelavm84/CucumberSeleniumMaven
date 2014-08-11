package idealistaTest.test;

import static org.junit.Assert.*;

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
	protected WebDriver driver ;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
	}

	@Given ("the user gets in on the webpage \"([^\"]*)\"")
	public void El_usuario_entra_en_pagina(String nombrePagina)
	{
		driver.get(nombrePagina);
	}
	
	@When ("I press the button with text \"([^\"]*)\"")
	public void presionamos_boton_anuncios(String nombreBoton){
		driver.findElement(By.linkText(nombreBoton)).click();
	}
	
	@Then("I must see the button with text \"([^\"]*)\"")
	public void chequear_boton_vamos_alla(String nombreBoton){
		
		boolean present;
		
		try {
			driver.findElement(By.linkText(nombreBoton));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		assertTrue("No se encuentra el boton con texto " + nombreBoton , present);

	}
	
	@Given ("the user press the button with text \"([^\"]*)\"")
	public void presiono_boton_vamos_alla (String nombreBoton)
	{
		boolean present;
		
		try {
			driver.findElement(By.linkText(nombreBoton)).click();
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		assertTrue("No se encuentra el boton con texto " + nombreBoton , present);
	}

	@Then("I must see the button with Id \"([^\"]*)\"")
	public void chequear_boton_vamos(String idBoton){
		
		boolean present;
		
		try {
			driver.findElement(By.id(idBoton));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		assertTrue("No se encuentra el boton con texto " + idBoton , present);

	}
	
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
