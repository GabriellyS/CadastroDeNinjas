package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_missoes")

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //cada ID é unico
    private Long id;

    private String titulo, descricao;
    private NinjaModel ninjaAtribuido;

    public MissoesModel(String titulo, String descricao, NinjaModel ninjaAtribuido) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.ninjaAtribuido = ninjaAtribuido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NinjaModel getNinjaAtribuido() {
        return ninjaAtribuido;
    }

    public void setNinjaAtribuido(NinjaModel ninjaAtribuido) {
        this.ninjaAtribuido = ninjaAtribuido;
    }

    @Override
    public String toString() {
        return "Missoes : - nada ainda";
    }
}
