package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.Homepage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    Homepage homepage = new Homepage(driver);


    @Dado("^que estou na tela inicial$")
    public void que_estou_na_tela_inicial() {
        homepage.acessarTelaInicial();
    }

    @Dado("^clico botao faça seu login$")
    public void clico_botao_faça_seu_login() {
        homepage.clicobotaologin();
    }

    @Quando("^preencho email$")
    public void preencho_email() {
        homepage.preencherEmail();
    }

    @Quando("^clico botao continuar$")
    public void clico_botao_continuar() {
        homepage.clicobotaoContinue();
    }

    @Quando("^preencho senha$")
    public void preencho_senha() {
        homepage.preencherSenha();
    }

    @Quando("^clico botao fazer login$")
    public void clico_botao_fazer_login() {
        homepage.clicobotaoFazerlogin();
    }

    @Dado("^faço uma busca$")
    public void faço_uma_busca() {
        homepage.façoUmaBusca();
    }

    @Dado("^clico botao pesquisar$")
    public void clico_botao_pesquisar() {
        homepage.clicoBotaoPesquisar();
    }

    @Então("^verifico o produto$")
    public void verifico_o_produto() {
        homepage.verificoOproduto();
    }
}
