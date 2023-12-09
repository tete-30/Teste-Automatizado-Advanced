package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class CadastroPagePessoaJuridica {

    static WebDriver driver;

    public CadastroPagePessoaJuridica(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {

        WebElement pessoaJuridica = driver.findElement(By.id("PjButton"));
        pessoaJuridica.click();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Vitória");

        WebElement sobreNome = driver.findElement(By.id("lastname"));
        sobreNome.sendKeys("Régia");

        WebElement razaoSocial = driver.findElement(By.id("companyName"));
        razaoSocial.sendKeys("Vitória Régia Floricultura");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("08122021");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("20.937.497/0001-86");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("34162530");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vitoriaregiafloricultura@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("vitoriaregiafloricultura@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

    }

    public void EmailInvalido(){

        WebElement pessoaJuridica = driver.findElement(By.id("PjButton"));
        pessoaJuridica.click();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Vitória");

        WebElement sobreNome = driver.findElement(By.id("lastname"));
        sobreNome.sendKeys("Régia");

        WebElement razaoSocial = driver.findElement(By.id("companyName"));
        razaoSocial.sendKeys("Vitória Régia Floricultura");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("08122021");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("20.937.497/0001-86");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("34162530");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vitoriaregiafloriculturagmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("vitoriaregiafloriculturagmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

    }

    public void validarEmailIcorreto() {
        WebElement mensagemEmailErro = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[8]/div[1]/span[1]"));
        String mensagemErro = mensagemEmailErro.getText();
        String mensagemErroEsperada = "Digite um email válido";
        assertEquals(mensagemErroEsperada, mensagemErro);
    }

    public void nomeSobrenomeObrigatorios(){

        WebElement pessoaJuridica = driver.findElement(By.id("PjButton"));
        pessoaJuridica.click();

        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys("Vitória");

        WebElement sobreNome = driver.findElement(By.id("lastname"));
        sobreNome.sendKeys("");

        WebElement razaoSocial = driver.findElement(By.id("companyName"));
        razaoSocial.sendKeys("Vitória Régia Floricultura");

        WebElement data = driver.findElement(By.id("date"));
        data.sendKeys("08122021");

        WebElement cnpj = driver.findElement(By.id("document"));
        cnpj.sendKeys("20.937.497/0001-86");

        WebElement ddi = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]/span[2]"));
        ddi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement ddiSelecionado = driver.findElement(By.xpath(" //a[contains(text(),'Brasil - +55')]"));
        ddiSelecionado.click();

        WebElement ddd = driver.findElement(By.id("ddd"));
        ddd.sendKeys("51");

        WebElement telefone = driver.findElement(By.id("phone"));
        telefone.sendKeys("34162530");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vitoriaregiafloricultura@gmail.com");

        WebElement confEmail = driver.findElement(By.id("confEmail"));
        confEmail.sendKeys("vitoriaregiafloricultura@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement checkboxLGPD = driver.findElement(By.xpath("//body/div[@id='root-app']/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/label[1]/span[1]"));
        checkboxLGPD.click();

    }

    public void validarSobrenomeObrigatorio() {
        WebElement mensagemSobrenomeObrigatoriolErro = driver.findElement(By.xpath("//span[contains(text(),'Obrigatório')]"));
        String mensagemErro = mensagemSobrenomeObrigatoriolErro.getText();
        String mensagemErroEsperada = "Obrigatório";
        assertEquals(mensagemErroEsperada, mensagemErro);
    }


}
