CREATE TABLE topicos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) UNIQUE NOT NULL,
    mensagem TEXT NOT NULL,
    UNIQUE INDEX mensagem_unique_idx (mensagem(500)),
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP,
    estado_topico ENUM('ativo', 'inativo', 'fechado') DEFAULT 'ativo',
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100)
);


CREATE TABLE usuarios(

    id bigint not null auto_increment,
    login varchar(100) not null,
    senha varchar(255) not null,

    primary key(id)

);