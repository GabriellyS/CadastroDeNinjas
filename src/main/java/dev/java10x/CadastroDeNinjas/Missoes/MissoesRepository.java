package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// Preciso extender o JPA para as query do Banco de dados
// Aqui eu informo ap JPA que a entidade utilizada será MissoesModel, e o ID que irá guiar será Long (conforme consta na classe Missao)
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
