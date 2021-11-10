package com.zup.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//onde fica o kafka? qual a porta? qual o nome do tópico?
//Que classe faz a serialização dos objetos java para virarem bytes e depois mensagens?
//=============================================================
// OLHA O application.yml e todas as pergunta serão respondidas!
//=============================================================


@Service
public class MeuProducer {
    @Autowired
    private KafkaProperties kafkaProperties;

    //Sabe porque eu defini essa string hadr coded aqui? porque tive prequiça
    //de ir ao applicarion.yml e copiar a chave que contém o nome do tópico lã.
    //Não faça isso. Não seja preguiçoso
    String topic = "emailtpc";

    //Esse cara aqui é o que, de fato, faz a mensagem chegar lá no Kafka
    //Ele é que tem o método send.
    //Para obter um KafkaTemplate, é preciso dizer qual o tipo da chave e do valor
    //Neste caso <String, Teste>
    @Autowired
    private KafkaTemplate<String, Teste> kafkaTemplate;

    //Lá no controller, que recebe o request, a gente chama esse método aqui
    public void sendMessage(Teste t) {
        this.kafkaTemplate.send(topic, t);
    }
}


