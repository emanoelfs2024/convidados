package br.com.empresa.convidado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empresa.convidado.Entity.ConvidadoEntity;

@Repository
public interface ConvidadoRepository extends JpaRepository<ConvidadoEntity, Long>{

}
