package treinamento;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import suporte.Web;

public class CasoDeTeste1PageObjects {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = Web.createDriver();
		
	}
	
	@Test
	public void test() {
		new HomePage(driver)
			.searchProducts("tv 32 polegadas")
			.selectProducts()
			.clicarBuyNow()
			.typeLogin("mattnohype@gmail.com"+ Keys.ENTER, "davihackudo123"+ Keys.ENTER)
			.finishPurchase();
		
		String expecMessage = driver.findElement(By.xpath("(//h4[@class='a-color-success'])")).getText().trim();
		
//		verficar mensagem
		assertEquals("Obrigado, Seu pedido foi feito e será processado após o pagamento do Boleto", expecMessage);
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
