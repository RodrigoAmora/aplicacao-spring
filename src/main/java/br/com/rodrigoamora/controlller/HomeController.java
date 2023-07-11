package br.com.rodrigoamora.controlller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.rodrigoamora.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeDoProduto("MacBook Air 13");
		pedido.setUrlImage("https://m.media-amazon.com/images/I/51ppYyWOrNL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Notebook-Apple-MacBook-Air-13-polegadas/dp/B0B3CQVB62/ref=sr_1_2_sspa?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=343CL7PWUJDBE&keywords=macbook&psr=PDAY&qid=1689101607&s=prime-day&sprefix=macbook%2Cprime-day%2C204&sr=1-2-spons&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1&m=A1ZZFT5FULY4LN&SPES=1");
		pedido.setDescricao("descição.....");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
