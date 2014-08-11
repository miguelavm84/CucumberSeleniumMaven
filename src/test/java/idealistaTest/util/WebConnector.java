package idealistaTest.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebConnector {
	//escribimos en el loging
	//inicializamos el fichero de propiedades
	
	private static Properties ENTORNO = null;
	private static Properties CONFIG = null;
	private static WebDriver driver = null;
	
	public WebConnector(){
		
		if (ENTORNO == null){
			
			try {
				
				//Inicializamos el fichero de ENTORNO
				ENTORNO = new Properties();
				FileInputStream ficheroPropiedadesEntorno = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\idealistaTest\\config\\configPruebas.properties");
				ENTORNO.load(ficheroPropiedadesEntorno);
				
				// Inicializamos el fichero de configuración dependiendo del entorno que tengamos
				
				CONFIG = new Properties();
				

					FileInputStream ficheroPropiedadesConfiguracion = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\idealistaTest\\config\\" + ENTORNO.getProperty("entorno") +".properties");
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
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromeDriver//chromedriver");
			driver = new ChromeDriver();
		}else if (tipoNavegador.equals("Safari")) {
			driver = new SafariDriver();
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
		driver.findElement(By.linkText(CONFIG.getProperty(id))).click();
	}
	
	//Funcion en la cual clickeamos by CSS
	public void clickByCSS(String css){
		driver.findElement(By.cssSelector(CONFIG.getProperty(css))).click();
	}
		
	//Funcion en la cual clickeamos by Xpath
	public void clickByXpath(String xpath){
		driver.findElement(By.xpath(CONFIG.getProperty(xpath))).click();
	}
	
	//Funcion en la cual clickeamos by LinkText
	public void clickByLinkText(String linkText){
		driver.findElement(By.linkText(CONFIG.getProperty(linkText))).click();
	}
	
	public void finSesionNavegador(){
		driver.quit();
	}
	

}
