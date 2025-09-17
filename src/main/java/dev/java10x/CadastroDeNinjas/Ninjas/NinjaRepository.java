package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

// Esse repository vai manipular objetos do tipo NinjaModel
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {


}
