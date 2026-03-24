# Study APIR


API de estudo de Spring Boot.


## Instruções de uso

```
mvn spring-boot:run
```

| Código | Constante                | Significado                                 | Exemplo de Uso                     |
|--------|--------------------------|---------------------------------------------|-----------------------------------|
| 200    | OK                       | Requisição bem-sucedida                     | GET /produtos                     |
| 201    | Created                  | Recurso criado com sucesso                  | POST /produtos                    |
| 204    | No Content               | Sem conteúdo na resposta                    | DELETE /produtos/{id}             |
| 400    | Bad Request              | Dados inválidos enviados pelo cliente       | POST com JSON inválido            |
| 404    | Not Found                | Recurso não encontrado                      | GET /produtos/{id} inexistente    |
| 409    | Conflict                 | Conflito ao processar a requisição          | Criar recurso duplicado           |
| 500    | Internal Server Error    | Erro inesperado no servidor                 | Exceção não tratada               |

| Anotação          | Função            | Descrição                                                                 |
|------------------|------------------|---------------------------------------------------------------------------|
| `@RestController` | Criar API        | Define a classe como um controller REST que retorna dados (JSON/String)  |
| `@RequestMapping` | Rota base        | Define o caminho principal da API (ex: `/produtos`)                      |
| `@PostMapping`    | Criar recurso    | Usado para enviar dados e criar um novo registro                         |
| `@GetMapping`     | Buscar dados     | Recupera informações (um ou vários registros)                            |
| `@PutMapping`     | Atualizar        | Atualiza um recurso existente                                            |
| `@DeleteMapping`  | Deletar          | Remove um recurso existente    