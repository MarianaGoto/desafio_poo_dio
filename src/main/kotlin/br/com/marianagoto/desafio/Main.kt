package br.com.marianagoto.desafio

import br.com.marianagoto.desafio.model.ConteudoEducacionalModel
import br.com.marianagoto.desafio.model.FormacaoModel
import br.com.marianagoto.desafio.model.NivelModel
import br.com.marianagoto.desafio.model.UsuarioModel
import kotlin.system.exitProcess

// Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório aprenda-kotlin-com-exemplos.
// Nesse contexto, iremos abstrair o seguinte domínio de aplicação:
// A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais voltados para uma stack tecnológica específica,
// preparando profissionais de TI para o mercado de trabalho.
// Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais.
// Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de matricular um ou mais Alunos.
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)


fun main() {
    val conteudoEducacional = cadastrarConteudoEducacional()

    val formacao = cadastrarFormacao(listOf(conteudoEducacional))

    matricularAlunoFormacao(formacao)
}

fun cadastrarConteudoEducacional(): ConteudoEducacionalModel {
    print("Digite o nome do conteúdo: ")
    val nome = readln()
    print("Digite a duração do conteúdo em minutos (padrão: 60): ")
    val duracaoStr = readlnOrNull()
    val duracao = duracaoStr?.toIntOrNull() ?: 60

    val conteudoEducacional = ConteudoEducacionalModel(nome = nome, duracao = duracao)

    return conteudoEducacional
}

fun cadastrarFormacao(conteudosEducacionais: List<ConteudoEducacionalModel>): FormacaoModel {
    print("Digite o nome da formação: ")
    val nome = readln()

    print("Digite o nível da formação (1 - Basico, 2 - Intermediario, 3 - Difícil): ")
    val nivel = readln()

    val nivelEscolhido: NivelModel = when (nivel) {
        "1" -> NivelModel.BASICO

        "2" -> NivelModel.INTERMEDIARIO

        "3" -> NivelModel.DIFICIL

        else -> {
            println("Opção inválida.")
            exitProcess(1)
        }
    }

    val formacao = FormacaoModel(nome = nome, conteudos = conteudosEducacionais, nivelEscolhido)

    return formacao
}

fun matricularAlunoFormacao(formacao: FormacaoModel) {
    print("Digite o nome do aluno: ")
    val nome = readln()

    val aluno = UsuarioModel(nome)

    formacao.matricular(aluno)
}
