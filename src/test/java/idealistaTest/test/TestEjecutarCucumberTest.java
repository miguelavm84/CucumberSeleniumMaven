package idealistaTest.test;

import org.junit.runner.*;

import cucumber.junit.Cucumber;
import cucumber.junit.Cucumber.Options;


@RunWith (Cucumber.class)
@Cucumber.Options(format={"pretty","html:target/cucumber-html-report","json-pretty:target/cucumber-report.json"})
public class TestEjecutarCucumberTest {
	
}
