package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class Homepage extends Utils {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaInicial() {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.br");
    }

    public void clicobotaologin() {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        System.out.println("clicou login");
    }

    public void preencherEmail() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("ap_email")).sendKeys("estudoconta1234@gmail.com");
        System.out.println("preencheu email ");
    }

    public void clicobotaoContinue() {
        driver.findElement(By.id("continue")).click();
        System.out.println(" clicou continue");

    }

    public void preencherSenha() {
        driver.findElement(By.id("ap_password")).sendKeys("estudoconta123456");
        System.out.println("preencheu senha ");

    }

    public void clicobotaoFazerlogin() {
        driver.findElement(By.id("auth-signin-button")).click();
        System.out.println("clicou login");
    }

    public void façoUmaBusca() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smartphone");
        System.out.println("fez a busca ");
    }

    public void clicoBotaoPesquisar() {
        driver.findElement(By.id("nav-search-submit-button")).click();

        System.out.println("clicou pesquisar ");
    }

    public void verificoOproduto() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String texto_produto = driver.findElement(By.cssSelector("#search > span > div > h1 > div > div.sg-col-14-of-20.sg-col-18-of-24.sg-col.s-breadcrumb.sg-col-10-of-16.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold")).getText();
        Assert.assertEquals("verificou o produto", "smartphone", texto_produto);
        System.out.println("verificou produto");
    }

}






