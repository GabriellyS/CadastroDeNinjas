package dev.java10x.CadastroDeNinjas.Ninjas;

// Testando o git amend

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Data JPA = Java Persistence API
// Com o Entity eu crio no banco de dados uma entidade
@Entity
// Table eu crio tabelas com colunas (variaveis)
@Table(name = "tb_ninjas")
@NoArgsConstructor // Usando o Lombok para criar um contrutor No Args
@AllArgsConstructor // Usando o Lombok para criar um contrutor All Args
@Data // Cria todos os GETs e SETs (nao é muito bom criar todos os SETs pq nem sempre usa)
public class NinjaModel {

    @Id // Essa anotaçao informa que o proximo atributo abaixo será o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Essa anotaçao ajuda a configurar 1 ID por objeto
    private Long id;

    private String nome;
    private int idade;

    @Column(unique = true) // Estou dizendo que o atributo em baixo deve ser unico e nao pode ser repetido
    private String email;


    @ManyToOne // Varios Ninjas tem somente um atributo abaixo
    @JoinColumn(name = "missao_id") // eu vou mesclar as colunas "Missao" e "ninjaAtribuido"- Esse é o Foreing Key/ Chave Estrangeira
    private MissoesModel missao;

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja " + id + ": " + nome + "\nEmail: " + email + "\nIdade: " + idade;
    }
}
