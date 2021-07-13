## Descrição
Api de Ponto de acesso desenvolvido durante uma live do Bootcamp do Santander na DIO (Digital Innovation One) juntamente com o prficional [Rodolfo Gomes](https://github.com/rodolfogomes), para segui o projeto inicial clique [aqui](https://github.com/rodolfogomes/diolive).

## Ferramentas de desenvolvim
- Java 11
- Intellij IDEA
- Postman
- Gradle 7.0
- PgAdmin 4
- PostegreSQL 12
- Spring Boot 2.5.2

## Testar Projeto
- Fazer download do projeto ``
- Abrir o diretório em uma IDE para fazer o build do projeto (Manualmente execute em .\live o comando gradle run)
- Após fazer build configure o arquivo `application.properties` em `.\live\src\main\resources` com as configurações de sua base de dados
- Para testar a aplicação execute a classe `LiveApplication` no caminho `.\live\src\main\java\com\live\`
- Confirme que a aplicação está no ar acessando `localhost:8081/swagger-ui.html` em um navegador
- Agora é só testar com algum software de teste (Recomendado o POSTMAN) ou na página do Swagger aberta no comando passado