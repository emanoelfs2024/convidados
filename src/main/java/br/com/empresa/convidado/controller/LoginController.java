package br.com.empresa.convidado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String abrirTelaLogin() {
		return "telalogin";
	}
@PostMapping("/autenticar")
public String autentificar(String login, String senha) {
	if(login.equals("admin") && senha.equals("admin")) {
		return "redirect:/convidados";
		}else {
			return "redirect:/";
		}
	}
}

