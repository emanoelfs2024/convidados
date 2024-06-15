package br.com.empresa.convidado.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_convidado")
public class ConvidadoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private int numeroAcompanhante;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroAcompanhante() {
		return numeroAcompanhante;
	}
	public void setNumeroAcompanhante(int numeroAcompanhante) {
		this.numeroAcompanhante = numeroAcompanhante;
	}
	
	
	
}
