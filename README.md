# Gestão de Frota

## Stack

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA

### Banco de dados

* PostgreSQL

### Frontend

* HTML
* CSS
* JavaScript

### Ferramentas

* Maven
* Git
* GitHub

---

# Arquitetura

```text
Frontend
    ↓
REST API
    ↓
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL
```

### Camadas

**Controller**

* Recebe requisições HTTP
* Define os endpoints da API
* Retorna as respostas

**Service**

* Contém as regras de negócio
* Coordena as operações

**Repository**

* Acesso ao banco de dados
* Persistência das entidades

**Model**

* Representa as entidades do sistema

**DTO**

* Define os dados de entrada e saída da API

**Config**

* Configurações da aplicação

---

# MVP

## Veículos

* Cadastro
* Listagem
* Visualização
* Edição
* Exclusão

Dados:

* Placa
* Patrimônio
* Marca
* Modelo
* Ano
* Categoria
* KM / horímetro
* Tipo de combustível
* Status

## Abastecimentos

* Registrar abastecimento
* Listar histórico
* Visualizar abastecimento
* Editar
* Excluir

Dados:

* Veículo
* Data
* Litros
* Valor total
* Preço por litro
* KM / horímetro
* Posto
* Observações

Cálculos:

* Consumo médio
* Gasto por veículo
* Gasto por período
* Custo por KM

## Manutenções

* Registrar manutenção
* Listar histórico
* Visualizar manutenção
* Editar
* Excluir

Dados:

* Veículo
* Tipo: preventiva / corretiva
* Data
* Serviço
* Custo
* KM / horímetro
* Oficina
* Próxima manutenção
* Observações

## Validações:

* Patrimônio: obrigatório
* Marca: obrigatória
* Modelo: obrigatório
* Ano: obrigatório, entre 1900 e 2100
* Categoria: obrigatória
* KM / horímetro: obrigatório, maior ou igual a 0
* Tipo de combustível: obrigatório
* Placa: opcional
* Status: opcional

## Dashboard

* Total de veículos
* Veículos disponíveis
* Veículos em manutenção
* Gastos com abastecimento
* Gastos com manutenção
* Próximas manutenções
* Resumo de abastecimentos

---

# Entidades

```text
Veiculo
Abastecimento
Manutencao
```

Relacionamentos:

```text
Veiculo
 ├── 1:N → Abastecimento
 └── 1:N → Manutencao
```

---

# Futuras funcionalidades

* Gestão de operadores
* Controle de utilização
* Controle de documentos
* Sistema de alertas
* Relatórios
* Exportação PDF/Excel
* Usuários e permissões
* Anexos e fotos
* Múltiplas empresas/filiais
* Aplicação mobile

---

# Objetivo técnico

Utilizar o projeto para praticar:

* API REST
* Spring Boot
* Controller / Service / Repository
* JPA / Hibernate
* MySQL
* Modelagem de banco
* Relacionamentos
* HTTP / JSON
* DTOs
* Validações
* Tratamento de exceções
* Git / GitHub
* Integração frontend + backend
