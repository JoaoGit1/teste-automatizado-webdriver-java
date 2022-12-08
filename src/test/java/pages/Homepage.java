package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.utils;

public class TelaInicialpage extends utils {
    static WebDriver driver;
    private static By tela_inicial = By.id("index-banner");
    private static By acessar_botao_automacao_web = By.className("Começar Automação Web");

    public TelaInicialpage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaInicial() {
        driver.get("https://automacaocombatista.herokuapp.com");
        waitElementBePresent(tela_inicial, (20));
    }

    public void acessarAutomaçãoWeb() {
        driver.findElement(By.className("Começar Automação Web")).click();
    }
}
