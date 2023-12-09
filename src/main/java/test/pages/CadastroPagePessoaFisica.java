package test.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class CadastroPagePessoaFisica {

    static WebDriver driver;

    public CadastroPagePessoaFisica(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {

        WebElement pessoaFisica = driver.findElement(By.id("PfButton"));
        pessoaFisica.click();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Vitória");

        WebElement sobreNome = driver.findElement(By.id("lastname"));
        sobreNome.sendKeys("Régia");

        WebElement data  = driver.findElement(By.id("date"));
        data.sendKeys("30061992");

        WebElement cpfPage = driver.findElement(By.id("document"));
        cpfPage.sendKeys("214.635.770-36");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement pesquisaDDIInput = driver.findElement(By.xpath("//body/div[6]/div[1]/input[1]"));
        pesquisaDDIInput.sendKeys("brasil");

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("34162530");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("viregia@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("viregia@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

    }

    public void campoComCpfInvalido() {

        WebElement pessoaFisica = driver.findElement(By.id("PfButton"));
        pessoaFisica.click();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Vitória");

        WebElement sobreNome = driver.findElement(By.id("lastname"));
        sobreNome.sendKeys("Régia");

        WebElement data  = driver.findElement(By.id("date"));
        data.sendKeys("30061992");

        WebElement cpfPage = driver.findElement(By.id("document"));
        cpfPage.sendKeys("022.370.420-00");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement pesquisaDDIInput = driver.findElement(By.xpath("//body/div[6]/div[1]/input[1]"));
        pesquisaDDIInput.sendKeys("brasil");

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("34162530");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("viregia@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("viregia@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

    }

    public void validarMensagemCpfInvalido() {
        WebElement mensagemErroCpf = driver.findElement(By.xpath("//span[contains(text(),'CPF inválido')]"));
        String mensagemErro = mensagemErroCpf.getText();
        String mensagemErroEsperada = "CPF inválido";
        assertEquals(mensagemErroEsperada, mensagemErro);
    }

    public void campoDataDeNascimentoInvalida() {

        WebElement pessoaFisica = driver.findElement(By.id("PfButton"));
        pessoaFisica.click();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Vitória");

        WebElement sobreNome = driver.findElement(By.id("lastname"));
        sobreNome.sendKeys("Régia");

        WebElement data  = driver.findElement(By.id("date"));
        data.sendKeys("30021992");

        WebElement cpfPage = driver.findElement(By.id("document"));
        cpfPage.sendKeys("214.635.770-36");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement pesquisaDDIInput = driver.findElement(By.xpath("//body/div[6]/div[1]/input[1]"));
        pesquisaDDIInput.sendKeys("brasil");

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("34162530");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("viregia@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("viregia@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement checkboxSouPEP = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[1]/label[1]/span[1]"));
        checkboxSouPEP.click();

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

    }
    public void validarDataDeNascimentoInvalida() {
        WebElement mensagemDataDeNascimentoErro = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/span[1]"));
        String mensagemErro = mensagemDataDeNascimentoErro.getText();
        String mensagemErroEsperada = "Obrigatório";
        assertEquals(mensagemErroEsperada, mensagemErro);
    }


}
