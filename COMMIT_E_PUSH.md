# Instruções para Commit e Push no GitHub

## Pré-requisitos
- Git instalado no computador
- Conta GitHub com repositório forked a partir de `github.com/faustocintra/oo-ads-2026-1`
- IntelliJ IDEA configurado com integração GitHub

## Passo a Passo no IntelliJ IDEA

### 1. Commit Local

1. Clique no ícone **VCS** (Controle de Versão) na barra vertical esquerda do IntelliJ
   - Alt: Pressione `Ctrl + Shift + A` e digite "Commit"

2. No painel que abrir:
   - Marque todas as caixas em "Changes" e "Unversioned Files"
   - Na área inferior, escreva a **mensagem de commit**:
     ```
     (20/03) Implementação de classes de conta bancária
     ```

3. Clique no botão **"Commit"**

### 2. Push para o GitHub

1. No menu superior, clique em **Git > Push** (ou pressione `Ctrl + Shift + K`)

2. Você será perguntado:
   ```
   Push commits to 'origin'?
   ```
   - Clique em **"Push"**

3. Se tudo correu bem, você verá:
   ```
   ✓ Pushed successfully
   ```

---

## Mensagens de Commit Recomendadas

Conforme o exercício, use este padrão:

### Para etapa 1 (Pessoa e Funcionário):
```
(06/03) Criação da primeira classe (Pessoa)
(10/03) Criação da classe Funcionário e do primeiro objeto
(13/03) Criação do primeiro objeto da classe Funcionario
```

### Para etapa 2 (Contas Bancárias):
```
(17/03) Introdução de construtores personalizados nas classes Pessoa e Funcionario
(20/03) Implementação de classes de conta bancária
```

### Para entrega final:
```
TRABALHO 1
```

---

## Pull Request para Entrega

### 1. Acessar GitHub

1. Acesse `github.com/<SEU_USUARIO>/oo-ads-2026-1`
2. Clique na aba **"Pull requests"**
3. Clique no botão verde **"New pull request"**

### 2. Preencher Informações

- **Título:** `TRABALHO 1`
- **Descrição:** Seu nome completo

### 3. Criar o Pull Request

1. Clique em **"Create pull request"**
2. Aguarde a criação

### 4. Verificar Entrega

Acesse: `https://github.com/faustocintra/oo-ads-2026-1/pulls`

Procure por seu PR na lista para confirmar que foi enviado.

---

## ⚠️ Importante: Prazos

- **Prazo de entrega:** até **27/03 (sexta-feira) às 23h59**
- Se tiver conflicts durante o PR, o professor resolverá

---

## Dicas de Troubleshooting

### Se der erro "Remote origin not found":
```bash
git remote add origin https://github.com/<SEU_USUARIO>/oo-ads-2026-1.git
git push -u origin main
```

### Se der erro de autenticação:
- Faça login no GitHub novamente via IntelliJ
- Menu: VCS > Git > Log In to GitHub

### Se o código não apareceu:
1. Verifique se o commit foi bem-sucedido
2. Verifique se o push foi bem-sucedido
3. Atualize o GitHub (F5) no navegador

---

## Estrutura de Arquivos a Enviar

```
seu-fork/empresa/src/
├── Pessoa.java
├── Funcionario.java
├── ContaBancaria.java
├── ContaEspecial.java
└── Main.java

seu-fork/empresa/
├── diagrama_contas.drawio
├── README.md
└── .gitignore
```

---

**Boa sorte com o Pull Request!** 🚀
