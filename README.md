# 📚 Formação Kotlin - Simulador de Matrículas

Este repositório contém a solução de um **Desafio de Projeto** proposto pela [DIO (Digital Innovation One)](https://www.dio.me/), como parte da trilha de aprendizado *"Aprenda Kotlin com Exemplos"*.

## 💡 Sobre o Projeto

Neste desafio, o objetivo foi modelar um domínio de aplicação educacional com o uso da linguagem **Kotlin**, utilizando conceitos de orientação a objetos e boas práticas de codificação.

O domínio simula formações técnicas oferecidas pela DIO, contendo conteúdos educacionais organizados por nível de dificuldade e permitindo a matrícula de alunos.

---

## 🧩 Estrutura do Projeto

### 🔷 `enum class Nivel`
Enumeração que representa os níveis de dificuldade de uma formação:

- `BASICO`
- `INTERMEDIARIO`
- `DIFICIL`

### 🔷 `class Usuario`
Classe que representa um aluno com apenas um atributo:

- `nome`: Nome do aluno

### 🔷 `data class ConteudoEducacional`
Classe que representa um conteúdo educacional:

- `nome`: Nome da aula/conteúdo
- `duracao`: Duração do conteúdo em minutos (valor padrão: 60)

### 🔷 `data class Formacao`
Classe que representa uma formação completa:

- `nome`: Nome da formação
- `conteudos`: Lista de conteúdos educacionais
- `nivel`: Nível de dificuldade
- `inscritos`: Lista de alunos matriculados

Métodos importantes:
- `matricular(usuario: Usuario)`: Adiciona um aluno à formação e exibe os conteúdos da formação.
- `getUsuarios()`: Lista todos os alunos matriculados.

### 🔷 Função `menuFormacao()`
Simula um menu de interação via terminal, onde é possível:

1. Matricular um novo aluno
2. Sair do sistema

### 🔷 Função `main()`
Ponto de entrada da aplicação, chama o `menuFormacao()`.

---

## ▶️ Como Executar

Você pode executar este projeto diretamente no **[Kotlin Playground](https://pl.kotl.in/WcteahpyN)** ou utilizando o IntelliJ IDEA ou Android Studio com suporte ao Kotlin.

### Executar via terminal (usando o Kotlin instalado localmente):
```bash
kotlinc Main.kt -include-runtime -d formacao.jar
java -jar formacao.jar
