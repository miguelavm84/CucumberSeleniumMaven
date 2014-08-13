package idealistaTest.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class WebConnector {
	//escribimos en el loging
	//inicializamos el fichero de propiedades
	
	Properties ENTORNO = null;
	Properties CONFIG = null;
	WebDriver driver = null;
	
	public WebConnector(){
		
		if (ENTORNO == null){
			
			try {
				
				//Inicializamos el fichero de ENTORNO
				ENTORNO = new Properties();
				FileInputStream ficheroPropiedadesEntorno = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/idealistaTest/config/configPruebas.properties");
				ENTORNO.load(ficheroPropiedadesEntorno);
				
				// Inicializamos el fichero de configuración dependiendo del entorno que tengamos
				
				  CONFIG = new Properties();
				
					FileInputStream ficheroPropiedadesConfiguracion = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/idealistaTest/config/" + ENTORNO.getProperty("entorno") +".properties");
					CONFIG.load(ficheroPropiedadesConfiguracion);
				
			} catch (Exception e) {
				System.out.println("Error al inicializar los ficheros de propiedades");
			}
		}
	}
	
	// Funcion la cual abrimos webdriver segun el tipo de navegador
	public void abrimosNavegador(){
		
		String tipoNavegador = ENTORNO.getProperty("browser");
		
		if (tipoNavegador.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if (tipoNavegador.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			driver = new ChromeDriver();
		}else if (tipoNavegador.equals("Safari")) {
			driver = new SafariDriver();
		}else if (tipoNavegador.equals("Phantom")) {
			driver = new PhantomJSDriver();
		}else {
			System.out.println("No hay driver definido");

		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	//Funcion en la cual establecemos a que dirección url ir 
	
	public void irA(String propiedadUrl){
		driver.get(CONFIG.getProperty(propiedadUrl));
	}
	
	//Funcion en la cual clickeamos by ID
	public void clickById(String id){
		driver.findElement(By.linkText(ENTORNO.getProperty(id))).click();
	}
	
	//Funcion en la cual clickeamos by CSS
	public void clickByCSS(String css){
		driver.findElement(By.cssSelector(ENTORNO.getProperty(css))).click();
	}
		
	//Funcion en la cual clickeamos by Xpath
	public void clickByXpath(String xpath){
		driver.findElement(By.xpath(ENTORNO.getProperty(xpath))).click();
	}
	
	//Funcion en la cual clickeamos by LinkText
	public void clickByLinkText(String linkText){
		driver.findElement(By.linkText(ENTORNO.getProperty(linkText))).click();
	}
	
	//Funcion que chequea si un elemento esta presente o no
	public boolean isElementPresent(String cadenaABuscar,String tipoElemento){
		boolean present = false;
		
		if (tipoElemento.equals("xpath")){
			try {
				driver.findElement(By.xpath(ENTORNO.getProperty(cadenaABuscar)));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
		}else if (tipoElemento.equals("cssSelector")) {
			try {
				driver.findElement(By.cssSelector(ENTORNO.getProperty(cadenaABuscar)));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
			
		}else if(tipoElemento.equals("linkText")){
			try {
				driver.findElement(By.linkText(ENTORNO.getProperty(cadenaABuscar)));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
			
		}else if(tipoElemento.equals("id")){
			try {
				driver.findElement(By.id(ENTORNO.getProperty(cadenaABuscar)));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
			
		}
		return present;
	}
	
	// funcion para borrar la sesion del navegador
	public void finSesionNavegador(){
		driver.quit();
	}
	
	
	
	

}
