# 📚 Formação Kotlin - Desafio DIO

Este projeto foi desenvolvido como parte do desafio proposto pela **[Digital Innovation One (DIO)](https://www.dio.me/)** com o objetivo de praticar e aplicar conceitos da linguagem **Kotlin**, incluindo **modelagem orientada a objetos**, **abstração de domínio** e boas práticas de codificação.

---

## 🚀 Sobre o projeto

O domínio simula uma plataforma educacional onde:

- A DIO oferece **formações** com foco em stacks tecnológicas específicas;
- Cada **formação** possui:
    - Nome
    - Nível (Básico, Intermediário, Difícil)
    - Lista de **conteúdos educacionais**
- É possível **matricular alunos** em formações e acompanhar os inscritos.

---

## 🧠 Conceitos aplicados

- Organização do código com **separação em camadas de Modelos (`model/`)**
- Uso de **enum classes** para representar níveis
- Boas práticas de entrada e saída via terminal
- Tratamento de entrada do usuário com `readln()` e `readlnOrNull()`
- Uso de `exitProcess()` para controlar o fluxo da aplicação
- Uso de listas e `mutableListOf` para gerenciamento de inscritos

---

## 📁 Estrutura do Projeto

```shell
desafio/
│
├── model/
│   ├── UsuarioModel.kt
│   ├── ConteudoEducacionalModel.kt
│   ├── FormacaoModel.kt
│   └── NivelModel.kt
│
├── test/
│   ├── UsuarioModelTest.kt
│   ├── ConteudoEducacionalModelTest.kt
│   ├── FormacaoModelTest.kt
│   └── NivelModelTest.kt
│
├── Main.kt
└── README.md
```

---

## 🧪 Como executar

Você pode executar esse projeto usando o terminal do IntelliJ ou qualquer outro ambiente com suporte a Kotlin.

```bash
# Certifique-se de estar no diretório do projeto
$ kotlinc Main.kt -include-runtime -d formacao.jar
$ java -jar formacao.jar
```

Ou rode diretamente pelo IntelliJ com o botão ▶️ no `main()`.

---

## 📝 Exemplo de uso no terminal

```
Digite o nome do conteúdo: Fundamentos de Kotlin
Digite a duração do conteúdo em minutos (padrão: 60): 45
Digite o nome da formação: Kotlin Experience
Digite o nível da formação (1 - Básico, 2 - Intermediário, 3 - Difícil): 1
Digite o nome do aluno: Mariana
Aluno Mariana inscrito na formação Kotlin Experience...
Deseja matricular mais um aluno? (1 - Sim, 2 - Não): 2
```

---

## 💡 Ideias para evolução

- Permitir múltiplos conteúdos por formação via menu
- Interface gráfica com Compose Desktop

---

## 🧑‍💻 Desenvolvido por

**Mariana Goto**  
[LinkedIn](https://www.linkedin.com) | [GitHub](https://github.com/marianagoto)
