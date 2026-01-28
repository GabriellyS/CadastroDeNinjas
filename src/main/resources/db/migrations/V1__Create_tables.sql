-- V1: Criando as tabelas pelo flyway e nao pelo spring
CREATE TABLE tb_missoes (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    dificuldade VARCHAR(100) NOT NULL
);

CREATE TABLE tb_ninjas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    missao_id BIGINT,

    CONSTRAINT fk_tb_ninjas_missao
        FOREIGN KEY (missao_id)
        REFERENCES tb_missoes(id)
);
