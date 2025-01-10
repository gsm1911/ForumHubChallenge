package com.Alura.ForumHub.domain.topicos;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@Entity
@Table(name = "topicos")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="estado_topico")
    private EstadoTopico estadoTopico;

    @Column(unique=true)
    private String titulo;

    @Column(unique=true)
    private String mensagem;

    @Column(name="data_criacao")
    private LocalDateTime dataCriacao;

    private String autor;
    private String curso;

    public Topico(){
    }

    public Topico(DadosTopico dados){
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = dados.data_criacao();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.estadoTopico = dados.estado_topico();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoTopico getEstadoTopico() {
        return estadoTopico;
    }

    public void setEstadoTopico(EstadoTopico estadoTopico) {
        this.estadoTopico = estadoTopico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoTopico dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
    }
}