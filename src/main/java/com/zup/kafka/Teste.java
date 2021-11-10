package com.zup.kafka;

//Essa classe aqui, vai ser usada para ser serializada e compor o VALUE das nossas mensagens
//Poderia ser qualquer classe, contanto que o serializador escolhido seja capaz de lidar com o tipo

public class Teste {
    private String id;
    private String nome;

    public Teste(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Teste() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
