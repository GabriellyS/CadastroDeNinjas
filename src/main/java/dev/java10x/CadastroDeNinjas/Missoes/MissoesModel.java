package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //cada ID é unico
    private Long id;

    private String titulo, descricao;

    // Uma missao vai ter muitos atributos abaixo
    @OneToMany (mappedBy = "missao") // Eu mapeio com a coluna que eu quero juntar da outra classe
    private List<NinjaModel> ninjaAtribuido;


    public MissoesModel(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.ninjaAtribuido = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Missoes : - nada ainda";
    }
}
