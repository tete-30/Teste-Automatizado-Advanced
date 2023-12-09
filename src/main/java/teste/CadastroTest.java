package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.pages.CadastroPagePessoaFisica;
import test.pages.CadastroPagePessoaJuridica;

import java.time.Duration;

public class CadastroTest {

    static WebDriver driver;

    static CadastroPagePessoaFisica cadastroPagePessoaFisica;
    static CadastroPagePessoaJuridica cadastroPagePessoaJuridica;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");
        driver.manage().window().maximize();

        cadastroPagePessoaFisica = new CadastroPagePessoaFisica(driver);
        cadastroPagePessoaJuridica = new CadastroPagePessoaJuridica(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        WebElement buttonCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        buttonCookies.click();;
    }

    @Test
    public void cadastroPessoaFisica() {
        cadastroPagePessoaFisica.preencherCampo();
    }


    @Test
    public void cadastroPessoafisicaCPFInvalido() {
        cadastroPagePessoaFisica.campoComCpfInvalido();
        cadastroPagePessoaFisica.validarMensagemCpfInvalido();
    }

    @Test
    public void campoDataDeNascimentoInvalida() {
        cadastroPagePessoaFisica.campoDataDeNascimentoInvalida();
        cadastroPagePessoaFisica.validarDataDeNascimentoInvalida();
    }

    @Test
    public void cadastroPessoaJuridica() {
        cadastroPagePessoaJuridica.preencherCampo();
    }

    @Test
    public void EmailInvalido() {
        cadastroPagePessoaJuridica.EmailInvalido();
        cadastroPagePessoaJuridica.validarEmailIcorreto();
    }

    @Test
    public void nomeSobrenomeObrigatorios() {
        cadastroPagePessoaJuridica.nomeSobrenomeObrigatorios();
        cadastroPagePessoaJuridica.validarSobrenomeObrigatorio();
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {
         driver.quit();
    }
}


