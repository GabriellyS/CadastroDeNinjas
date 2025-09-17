package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// Preciso extender o JPA para as query do Banco de dados
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
