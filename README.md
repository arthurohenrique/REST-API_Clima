# REST-API_Clima


API REST desenvolvida utilizando Spring Boot e Maven, com Java 17, para facilitar o acesso a informações climáticas em tempo real. Esta API foi criada para simplificar a busca por dados de clima atual e previsão do tempo, permitindo que usuários consultem o clima para qualquer país através de um único endpoint.

## Funcionalidades
A API oferece um único endpoint para consulta do clima atual e previsão do tempo:

/clima: Retorna informações sobre o clima atual e a previsão do tempo do país. Os dados incluem informações detalhadas sobre as condições climáticas, data da previsão e um texto descritivo.

## Tecnologias Utilizadas
Spring Boot: Utilizado para estruturar a aplicação, facilitar o gerenciamento de dependências, e fornecer uma abordagem rápida para construir APIs RESTful.

Maven: Gerenciamento de dependências e automação do build, simplificando a configuração do projeto e garantindo consistência entre ambientes.

Java 17: A versão mais recente de suporte de longo prazo (LTS) do Java, que oferece melhorias de performance e novos recursos que ajudam a construir uma API robusta.

RestTemplate / WebClient: Para realizar as requisições HTTP à API pública de clima, o Spring oferece duas opções que permitem a fácil integração com APIs externas.

## Como a API Funciona
Consulta à API de Clima: O endpoint /clima realiza uma requisição à API pública de clima, passando o nome do país fornecido pelo usuário. A API faz uma chamada GET para obter o clima atual e a previsão do tempo para o local solicitado.

Resposta ao Cliente: A resposta da API é um JSON contendo as informações climáticas para o país especificado. A estrutura do JSON inclui o nome do país, a data da previsão e um texto descritivo detalhando as condições climáticas atuais e a previsão do tempo.

## Exemplo de Uso

![image](https://github.com/user-attachments/assets/bb42f5f7-6c82-4ddd-91bf-9d8abdc04d29)
