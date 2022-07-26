package Paginas;

import java.io.IOException;

import org.openqa.selenium.By;

import Adaptador.AdaptadorSelenium;

public class Home {

	private AdaptadorSelenium adaptador;
	private String rutaEvidencia = "";

	public Home(String url, String rutaEvidencia) {
		adaptador = AdaptadorSelenium.getInstance(url);
		this.rutaEvidencia = rutaEvidencia;
	}

	public void abrirUrl(String url) throws IOException {
		adaptador.abrirURL(url);
		adaptador.tomarEvidencia(this.rutaEvidencia+"abrirURL.png");
	}

	public void filtroSanjose()throws IOException {
		adaptador.findElementById(("ProvinceId")).click();
		adaptador.findElementXpath(("//option[. = 'San José']")).click();
		adaptador.findElementById(("CantonId")).click();
		adaptador.findElementById(("CantonId"));
		adaptador.findElementXpath(("//option[. = 'Pérez Zeledón']")).click();
		adaptador.findCssSelector((".btn-filter"));
		adaptador.findTagName(("body"));
		adaptador.findElementById(("DistrictId")).click();
		adaptador.findElementById(("PropertyTypeId")).click();
		adaptador.findElementById(("PropertyTypeId"));
		adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
		adaptador.findElementById(("MinPrice")).click();
		adaptador.findElementById(("MinPrice")).sendKeys("0");
		adaptador.findElementById(("MaxPrice")).click();
		adaptador.findElementById(("MaxPrice")).sendKeys("2000000000");
		adaptador.findCssSelector((".btn-filter")).click();
		adaptador.findCssSelector((".property-item-title > strong")).click();
		adaptador.tomarEvidencia(this.rutaEvidencia+"Validacion-filtro-San José.png");
	}

	public void filtroAlajueja()throws IOException {
		adaptador.findElementById(("ProvinceId")).click();
		adaptador.findElementXpath(("//option[. = 'Alajuela']")).click();
		adaptador.findElementById(("CantonId")).click();
		adaptador.findElementById(("CantonId"));
		adaptador.findElementXpath(("//option[. = 'Alajuela']")).click();
		adaptador.findCssSelector((".btn-filter"));
		adaptador.findTagName(("body"));
		adaptador.findElementById(("DistrictId")).click();
		adaptador.findElementById(("PropertyTypeId")).click();
		adaptador.findElementById(("PropertyTypeId"));
		adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
		adaptador.findElementById(("MinPrice")).click();
		adaptador.findElementById(("MinPrice")).sendKeys("0");
		adaptador.findElementById(("MaxPrice")).click();
		adaptador.findElementById(("MaxPrice")).sendKeys("6000000000");
		adaptador.findCssSelector((".btn-filter")).click();
		adaptador.findCssSelector((".property-item-title > strong")).click();
		adaptador.tomarEvidencia(this.rutaEvidencia+"Validacion-filtro-Alajuela.png");
	}

	public void filtroCartago()throws IOException {
		adaptador.findElementById(("ProvinceId")).click();
		adaptador.findElementXpath(("//option[. = 'Cartago']")).click();
		adaptador.findElementById(("CantonId")).click();
		adaptador.findElementById(("CantonId"));
		adaptador.findElementXpath(("//option[. = 'Paraíso']")).click();
		adaptador.findCssSelector((".btn-filter"));
		adaptador.findTagName(("body"));
		adaptador.findElementById(("DistrictId")).click();
		adaptador.findElementById(("PropertyTypeId")).click();
		adaptador.findElementById(("PropertyTypeId"));
		adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
		adaptador.findElementById(("MinPrice")).click();
		adaptador.findElementById(("MinPrice")).sendKeys("0");
		adaptador.findElementById(("MaxPrice")).click();
		adaptador.findElementById(("MaxPrice")).sendKeys("9000000000");
		adaptador.findCssSelector((".btn-filter")).click();
		adaptador.findCssSelector((".property-item-title > strong")).click();
		adaptador.tomarEvidencia(this.rutaEvidencia+"Validacion-filtro-Cartago.png");
	}

	public void filtroGuanacaste()throws IOException {
		adaptador.findElementById(("ProvinceId")).click();
		adaptador.findElementXpath(("//option[. = 'Guanacaste']")).click();
		adaptador.findElementById(("CantonId")).click();
		adaptador.findElementById(("CantonId"));
		adaptador.findElementXpath(("//option[. = 'Liberia']")).click();
		adaptador.findCssSelector((".btn-filter"));
		adaptador.findTagName(("body"));
		adaptador.findElementById(("DistrictId")).click();
		adaptador.findElementById(("PropertyTypeId")).click();
		adaptador.findElementById(("PropertyTypeId"));
		adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
		adaptador.findElementById(("MinPrice")).click();
		adaptador.findElementById(("MinPrice")).sendKeys("0");
		adaptador.findElementById(("MaxPrice")).click();
		adaptador.findElementById(("MaxPrice")).sendKeys("6000000000");
		adaptador.findCssSelector((".btn-filter")).click();
		adaptador.findCssSelector((".property-item-title > strong")).click();
		adaptador.tomarEvidencia(this.rutaEvidencia+"Validacion-filtro-Guanacaste.png");
	}

	public void filtroPuntareanas()throws IOException {
		adaptador.findElementById(("ProvinceId")).click();
		adaptador.findElementXpath(("//option[. = 'Puntarenas']")).click();
		adaptador.findElementById(("CantonId")).click();
		adaptador.findElementById(("CantonId"));
		adaptador.findElementXpath(("//option[. = 'Coto Brus']")).click();
		adaptador.findCssSelector((".btn-filter"));
		adaptador.findTagName(("body"));
		adaptador.findElementById(("DistrictId")).click();
		adaptador.findElementXpath(("//option[. = 'San Vito']")).click();
		adaptador.findElementById(("PropertyTypeId")).click();
		adaptador.findElementById(("PropertyTypeId"));
		adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
		adaptador.findElementById(("MinPrice")).click();
		adaptador.findElementById(("MinPrice")).sendKeys("0");
		adaptador.findElementById(("MaxPrice")).click();
		adaptador.findElementById(("MaxPrice")).sendKeys("4000000000");
		adaptador.findCssSelector((".btn-filter")).click();
		adaptador.findCssSelector((".property-item-title > strong")).click();
		adaptador.tomarEvidencia(this.rutaEvidencia+"Validacion-filtro-Puntarenas.png");
	}
	public void filtroLimon()throws IOException {
		adaptador.findElementById(("ProvinceId")).click();
		adaptador.findElementXpath(("//option[. = 'Limón']")).click();
		adaptador.findElementById(("CantonId")).click();
		adaptador.findElementById(("CantonId"));
		adaptador.findElementXpath(("//option[. = 'Matina']")).click();
		adaptador.findCssSelector((".btn-filter"));
		adaptador.findTagName(("body"));
		adaptador.findElementById(("DistrictId")).click();
		adaptador.findElementXpath(("//option[. = 'Matina']")).click();
		adaptador.findElementById(("PropertyTypeId")).click();
		adaptador.findElementById(("PropertyTypeId"));
		adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
		adaptador.findElementById(("MinPrice")).click();
		adaptador.findElementById(("MinPrice")).sendKeys("0");
		adaptador.findElementById(("MaxPrice")).click();
		adaptador.findElementById(("MaxPrice")).sendKeys("1000000000");
		adaptador.findCssSelector((".btn-filter")).click();
		adaptador.findCssSelector((".property-item-title > strong")).click();
		adaptador.tomarEvidencia(this.rutaEvidencia+"Validacion-filtro-Limón.png");
	}

	public void cerrarDriver() {
		adaptador.cerrarDriver();
	}
	
}
