package CasosDePrueba;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Paginas.Home;

public class Busquedas {

	Home home;

	@Parameters({"navegador","rutaEvidencia"})
	@BeforeClass
	public void beforeClass(String navegador, String rutaEvidencia) {
		home = new Home(navegador, rutaEvidencia);
	}

	@Parameters({"url"})
	@BeforeMethod
	public void beforeTest(String url) throws IOException {
		home.abrirUrl(url);
	}

	@Test
	public void TestCpSanJose() throws IOException {
		home.filtroSanjose();
	}
	@Test
	public void TestCpAlajuela() throws IOException {
		home.filtroAlajueja();
	}
	@Test
	public void TestCpCartago() throws IOException {
		home.filtroCartago();
	}
	@Test
	public void TestCpGuanacaste() throws IOException {
		home.filtroGuanacaste();
	}
	@Test
	public void TestCpPuntarenas() throws IOException {
		home.filtroPuntareanas();
	}
	@Test
	public void TestCpLimon() throws IOException {
		home.filtroSanjose();
	}

	@AfterMethod
	public void afterTest() {

	}

	@AfterClass
	public void afterClass() {
		home.cerrarDriver();
	}
}
