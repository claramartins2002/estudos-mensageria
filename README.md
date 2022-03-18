# Estudos Mensageria: RabbitMQ e Kafka

> Aplicação de delivery que se comunica via mensageria. São construídas duas possibilidades: Uma em Kafka e outra em RabbitMQ.
## Linguagens e tecnologias utilizadas

- Spring Boot
- RabbitMQ
- Kafka
- Gson (Dependência para decodificar o JSON da mensagem)
- Spring Web 
- Docker


## Descrição
### Desenvolvida com Kafka
Nessa aplicação, é preciso inicializar o arquivo kafka-docker-compose.yml, primeiramente: `docker-compose -f kafka-docker-compose.yml up -d`. Assim, o console padrão fica visível em http://localhost:19000. Lá, é criado um topic com o nome pedidos, para armazenar os pedidos em forma de mensagem . Esses pedidos estão salvos como string, mas são do tipo json. Então, para tratá-los e exibí-los personalizadamente, é preciso converter com a dependência do Gson. Ela é capaz de transformar uma string em json e também um json em objeto. `Pedido data = new Gson().fromJson(pedido, Pedido.class);`. 

### Desenvolvida com RabbitMQ
Nessa aplicação, o serviço de mensageria é criado separadamente no terminal: `docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management`. Lembrar de verificar se já não tem outra instância igual a essa rodando ao mesmo tempo. No console padrão (http://localhost:15672), criar um queue com o nome pedidos. Para vincular os serviços ao queue, é preciso configurar no application.properties o usuário, senha e o nome do queue. Aqui também é preciso usar o Gson para converter de Json para String e depois de String para objeto. 







