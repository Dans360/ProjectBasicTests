package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class PrimeiroStep  extends RunCucumberTest {

    HomePage homepage = new HomePage(driver);

    @Dado("^que tenho um step de teste$")
    public void que_tenho_um_step_de_teste() throws Throwable {
        homepage.acessarSite();
    }

    @Quando("^eu realizo todos os cenarios$")
    public void eu_realizo_todos_os_cenarios() throws Throwable {
        System.out.println("passou2");
    }

    @Então("^confirmo validos ou não\\.$")
    public void confirmo_validos_ou_não() throws Throwable {
        System.out.println("passou3");
    }

}
