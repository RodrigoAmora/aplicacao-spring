package br.com.rodrigoamora.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rodrigoamora.model.Pedido;
import br.com.rodrigoamora.repository.PedidoRepository;


@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private PedidoRepository repository;
	
	@GetMapping
	public String home(Model model) {
		
		List<Pedido> pedidos = repository.findAll();
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
