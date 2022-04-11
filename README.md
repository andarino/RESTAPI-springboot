## RESTAPI-springboot
######  CRUD API com persistência no MySQL com JPA.  
![spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![springJPA](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring%20JPA&logoColor=white)
![mysql](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)

## Dependências
```
$ java --version
openjdk 15.0.2 2021-01-19
$ mvn --version
Apache Maven 3.8.2 
```

## Métodos
O prefixo de todos é  `http://localhost:8080/`.
Para a tabela `conta` haverá os endpoints:
Método | Recurso | Descricão
-------|---------|----------
GET| /contas/| Lista todos as contas 
GET| /contas/{num_conta}| Lista a conta de acordo com a PK 
POST| /conta | Adiciona uma nova conta (Recebe um json com as informações)
PUT| /conta | Altera dados de uma conta existente
DELETE| /contas/{num_conta} |Exclui a conta com a pk informada

Para a tabela `lancamento` haverá os endpoints...
Método | Recurso | Descricão
-------|---------|----------
GET| /lancamento/| Lista todos os lancamentos e a conta associada ao lancamento 
GET| /lancamento/{numLanc}| Lista o lancamento de acordo com a PK 
POST| /lancamento | Adiciona um novo lancamento (Recebe um json com as informações, o campo "conta" também é um json com os parâmetros do insert de "conta")
PUT| /lancamento | Altera dados de um lancamento existente
DELETE| /lancamento/{numLanc} |Exclui a conta com a PK informada



## Exemplo de Requisição
A requisição suportada é um `json`.
>Content-Type: application/json

## Dados para insert nos endpoints
Os exemplos de como os dados devem ser inseridos estão logo abaixo:

Conta: 
```json
{
  "saldo": "8953453456",
  "cpf": "100.000.00-000",
	"lancamentos": [
		{
		"num_lancamento" : 78,
		"desc_lancamento": "transacao",
		"natureza_lancamento": "F",
		"valor_lancamento": "546",
		"num_conta": "100"
		}
	]
}
```
Obs: O campo `"lancamentos"` pode ser null.

Lancamento: 
```json
{
  "num_lancamento": 56,
  "data_lancamento": null,
  "valor_lancamento": "345435",
  "natureza_lancamento": "C",
  "desc_lancamento": "transacao",
  "conta": {
    "num_conta": 96,
    "saldo": "654",
    "cpf": "10.100.100-90"
  }
}

```
Obs: O campo `"num_conta"`deve coincidir com alguma conta pré-existente no banco.
