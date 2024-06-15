package br.com.empresa.convidado.service;

import java.util.List;

import br.com.empresa.convidado.Entity.ConvidadoEntity;
import br.com.empresa.convidado.model.Convidado;

public interface ConvidadoService {
	
	public void cadastrar(Convidado convidado) throws Exception;
	

	public List<Convidado> listar();
	
	public void excluir(Long id);
	
	public ConvidadoEntity editarPorId(Long id);
}
