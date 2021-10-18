# CRUD-springBoot
######  Projeto para portifólio usando JPA, MySQL and Maven 
## Dependências
* Java:
```
$ java --version
openjdk 15.0.2 2021-01-19
OpenJDK Runtime Environment (build 15.0.2+7)
OpenJDK 64-Bit Server VM (build 15.0.2+7, mixed mode)
```
* Maven:
```
$ mvn --version
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00)
Maven home: C:\Program Files\apache-maven-3.5.4
Java version: 1.8.0_171, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_171\jre
Default locale: pt_BR, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
## Inicializando o server
1 - Baixe o projeto na máquina com `git clone https://github.com/andarino/crud-springBoot.git` Após o `clone`. Entre na pasta do projeto.
```sh
cd crud-springBoot/
```
Rode o arquivo compilado `projeto-0.0.1-SNAPSHOT.jar` no terminal:
```sh
java -jar projeto-0.0.1-SNAPSHOT.jar.jar
```
>O server estará acessível em `http://localhost:8080`

## Métodos
O prefixo de todos é  `http://localhost:8080/`.
Para fazer as requisições você pode usar o insomnia ou o postman.
Para a tabela `conta` haverá os endpoints...
Método | Recurso | Descricão
-------|---------|----------
GET| /contas/| Lista todos as contas 
GET| /contas/{num_conta}| Lista a conta de acordo com a PK passada 
POST| /conta | Adiciona uma nova conta (envia um json com as informações)
PUT| /conta | Altera dados de uma conta existente
DELETE| /contas/{num_conta} |Exclue a conta com a pk informada

Para a tabela `lancamento` haverá os endpoints...
Método | Recurso | Descricão
-------|---------|----------
GET| /lancamento/| Lista todos os lancamentos e a conta associada ao lancamento 
GET| /lancamento/{numLanc}| Lista o lancamento de acordo com a PK passada 
POST| /lancamento | Adiciona um novo lancamento (envia um json com as informações, o campo "conta" também é um json com os parâmetros do insert de "conta")
PUT| /lancamento | Altera dados de um lancamento existente
DELETE| /lancamento/{numLanc} |Exclue a conta com a PK informada



## Requisição
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
Obs: O campo `"num_conta"`deve coincidir com alguma conta existente no banco.
