package com.zup.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class TransacaoController {


    //Esse cara aqui é a classe que efetivamente cria a mensagem no Kafka
    @Autowired
    MeuProducer senderDeTransacao;

    //A gente manda um request para este endpoint e o método do endpoint
    //invoca o método sendMessage, que está lá no nosso producer.
    //Repare que, ao invocar o método que cria a mensagem, passamos para ele um objeto do tipo Teste
    //Esse objeto vai ser serializado e vai se tornar o VALUE da nossa mensagem
    @GetMapping
    public void envia(){
        //Cria o objeto "teste" aqui. Ele vai virar o VALUE da mensagem
        Teste teste = new Teste("id paulinha", "nome paulinha");
       senderDeTransacao.sendMessage(teste);

    }


}
