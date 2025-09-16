package dev.java10x.CadastroDeNinjas.Ninjas;

// Testando o git amend

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

// Data JPA = Java Persistence API
// Com o Entity eu crio no banco de dados uma entidade
@Entity
// Table eu crio tabelas com colunas (variaveis)
@Table(name = "tb_ninjas")
public class NinjaModel {

    @Id // Essa anotaçao informa que o proximo atributo abaixo será o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Essa anotaçao ajuda a configurar 1 ID por objeto
    private long id;

    private String nome, email;
    private int idade;


    @ManyToOne // Varios Ninjas tem somente um atributo abaixo
    @JoinColumn(name = "missao_id") // eu vou mesclar as colunas "Missao" e "ninjaAtribuido"- Esse é o Foreing Key/ Chave Estrangeira
    private MissoesModel missao;

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel() {
    }

    @Override
    public String toString() {
        return "Ninja " + id + ": " + nome + "\nEmail: " + email + "\nIdade: " + idade;
    }
}
