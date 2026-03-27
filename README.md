# Trabalho Goncin - Programação Orientada a Objetos em Java

## Projeto: Sistema de Contas Bancárias

### 📋 Estrutura do Projeto

```
Trabalho Goncin/
├── src/
│   ├── Pessoa.java             (Classe base com atributos pessoais)
│   ├── Funcionario.java        (Estende Pessoa - dados laborais)
│   ├── ContaBancaria.java      (Classe base para contas)
│   ├── ContaEspecial.java      (Estende ContaBancaria - com limite)
│   └── Main.java               (Classes de teste)
├── diagrama_contas.drawio      (Diagrama de classes)
└── README.md                   (Este arquivo)
```

---

## 📚 Classes Implementadas

### 1. **Pessoa**
Classe base que representa uma pessoa com atributos e métodos pessoais.

**Atributos:**
- `nome: String`
- `idade: Integer`
- `cpf: String`
- `email: String`
- `telefone: String`

**Métodos:**
- `apresentar()` - Exibe apresentação
- `fazerAniversario()` - Incrementa idade
- `atualizarEmail(String novoEmail)` - Atualiza email
- `exibirDados()` - Retorna dados formatados

**Construtores:**
- Construtor padrão (sem parâmetros)
- Construtor personalizado (com todos os parâmetros)

---

### 2. **Funcionario**
Classe que estende `Pessoa`, adicionando dados laborais.

**Atributos próprios:**
- `matricula: String`
- `cargo: String`
- `salarioBase: Double`
- `departamento: String`
- `dataAdmissao: Date`
- `taxaComissao: Double` (static)

**Métodos:**
- `calcularSalario()` - Calcula salário com comissão
- `aumentarSalarioBase(Double percentual)` - Aumenta salário
- `registrarPonto()` - Registra ponto do funcionário
- `exibirDados()` - Sobrescreve método da Pessoa

**Construtor:**
- Construtor personalizado que chama super()

---

### 3. **ContaBancaria**
Classe que representa uma conta bancária simples.

**Atributos (privados):**
- `saldo: Double`
- `titular: String`

**Métodos:**
- `depositar(Double quantia)` - Adiciona valor ao saldo
- `sacar(Double quantia)` - Remove valor do saldo (com validação)
- `exibirSaldo()` - Exibe dados da conta
- `getSaldo()` - Retorna saldo
- `getTitular()` - Retorna titular

**Construtor:**
- Requer `titular` e `saldoInicial` na criação

**Validações:**
- Titular não pode ser vazio
- Saldo inicial não pode ser negativo
- Saque não pode exceder saldo disponível

---

### 4. **ContaEspecial**
Classe que estende `ContaBancaria`, adicionando limite de crédito.

**Atributos próprios:**
- `limite: Double` (privado)

**Métodos:**
- `sacar(Double quantia)` - Sobrescreve para permitir usar limite
- `exibirSaldo()` - Sobrescreve para exibir limite também
- `exibirSaldoReal()` - Exibe apenas saldo sem limite
- `getLimite()` - Retorna limite
- `setLimite(Double novoLimite)` - Altera limite

**Construtor:**
- Requer `titular`, `saldoInicial` e `limite`

**Diferenças:**
- Permite sacar até saldo + limite
- Exibe limite disponível
- Método adicional para ver saldo real

---

### 5. **Main**
Classe com métodos de teste.

**Métodos:**
- `teste01()` - Testa classe Pessoa
- `teste02()` - Testa classe Funcionario
- `teste03()` - Testa ContaBancaria e ContaEspecial

**Como usar:**
```java
// Desabilite teste01 e teste02 e execute teste03
// teste01();
// teste02();
teste03();
```

---

## 🔧 Como Compilar e Executar

### Usando IntelliJ IDEA:
1. Abra o projeto no IntelliJ IDEA
2. Clique direito em `Main.java`
3. Selecione "Run Main.main()"

### Usando terminal (Windows):
```bash
cd "C:\Users\Jnews\Desktop\Trabalho Goncin\src"
javac *.java
java Main
```

### Usando terminal (Linux/Mac):
```bash
cd ~/Desktop/Trabalho\ Goncin/src
javac *.java
java Main
```

---

## 📊 Diagrama de Classes

Abra o arquivo `diagrama_contas.drawio` em https://www.diagrams.net/ para visualizar e editar o diagrama de classes.

### Relações:
- `Funcionario` estende `Pessoa`
- `ContaEspecial` estende `ContaBancaria`

---

## ✅ Checklist de Implementação

- ✅ Classe Pessoa implementada com construtores
- ✅ Classe Funcionario estendendo Pessoa
- ✅ Classe ContaBancaria com atributos privados
- ✅ Classe ContaEspecial estendendo ContaBancaria
- ✅ Construtor personalizado em ContaBancaria
- ✅ Sobrescrita de métodos em ContaEspecial
- ✅ Validações de entrada em todos os construtores
- ✅ Testes implementados no método teste03()
- ✅ Código formatado e comentado
- ✅ Diagrama de classes criado

---

## 🚀 Próximos Passos

1. Testar todas as funcionalidades via `teste03()`
2. Fazer commit com mensagem: `(20/03) Implementação de classes de conta bancária`
3. Fazer push para o repositório
4. Criar Pull Request para entrega (até 27/03 23h59)

---

## 📝 Notas

- Todos os atributos de entrada são validados
- Uso de `String.format("%.2f", valor)` para formatação de valores monetários
- Aplicação de Encapsulamento (atributos privados com getters)
- Herança implementada corretamente
- Polimorfismo com override de métodos

---

**Disciplina:** Programação Orientada a Objetos  
**Semestre:** 2026/1  
**Data:** 20 de março de 2026
