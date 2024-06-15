package br.com.empresa.convidado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.empresa.convidado.Entity.ConvidadoEntity;
import br.com.empresa.convidado.model.Convidado;
import br.com.empresa.convidado.service.ConvidadoService;


@Controller
public class HomeController {
	@Autowired
	ConvidadoService service;

	@GetMapping("/convidados")
	public String listaConvidados(Model model) {
		List<Convidado> convidados = service.listar();
		model.addAttribute("convidados", convidados);
		return "convidados";
	}
	@PostMapping("/salvar")
public String salvarConvidados(Convidado convidado) throws Exception{
		service.cadastrar(convidado);
		System.out.println(convidado.toString());
		return "redirect:/convidados";
		}

@GetMapping("/excluir/{id}")
public String excluirConvidado(@PathVariable Long id) {
	service.excluir(id);
	return "redirect:/convidados";
}
@GetMapping("/atualizar/{id}")
public String atualizarConvidado(@PathVariable Long id, Model model) {
	var convidado = service.editarPorId(id);
	model.addAttribute("convidado",convidado);
	return "editar-convidado";
}
}
