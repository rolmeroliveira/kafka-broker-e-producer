# Kafka PRODUCER com Docker-compose para levantar o bocker!

### Este repo contem um produtor de mensagens para o Kafa, com o mínimo de configurações possível!
### Também inclui um arquivo compose com as definições dos seguintes serviços:
- Zookeper
- Kafka"
- Kafdrop - GUI para visão do funcionamento do Kafka

Como espera-se que este producer seja testado na mesma máquina que o consumer, sugerimos verificar a definção da porta 
no arquivo application.yml. 

O producer pode ficar na porta padãro (8080 - não precisa definir explicitamente), enquanto o consumer
deve rodar em outra porta (talvez 8081 - neste caso a definição é obrigatória)

Se preferir subir o container, independente de ter que abrir a aplicação do producer,
você deve copiar o arquivo compose para uma pasta externa ou projeto e rodá-lo a partir de lá.

Além desse repo, acesse também o repo do consumer: 






[Aqui você encontra o consumer para as msgs criadas por este producer!](https://github.com/rolmeroliveira/kafka-consumer)