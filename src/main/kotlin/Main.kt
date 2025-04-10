// Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório aprenda-kotlin-com-exemplos.
// Nesse contexto, iremos abstrair o seguinte domínio de aplicação:
// A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais voltados para uma stack tecnológica específica,
// preparando profissionais de TI para o mercado de trabalho.
// Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais.
// Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de matricular um ou mais Alunos.
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel(val desc: String) {
    BASICO("básico"),
    INTERMEDIARIO("intermediário"),
    DIFICIL("difícil")
}

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Aluno ${usuario.nome} inscrito na formação ${nome} de nível ${nivel.desc} e nos seguintes conteúdos:")
        for (conteudo in conteudos) {
            println("- ${conteudo.nome} de duração de ${conteudo.duracao} minutos.")
        }
//        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }

    fun getUsuarios(): List<Usuario>{
        println("Alunos inscritos na formação ${nome}: ")
        var i: Int = 0
        for(inscrito in inscritos) {
            println("[${i+1}] - ${inscrito.nome}")
            i++
        }
        return inscritos
    }
}

fun readUser(): Usuario{
    val nome: String = readln()
    return Usuario(nome)
}


fun menuFormacao(){
    var acao: Int? = null

    val conteudos = listOf<ConteudoEducacional>(
        ConteudoEducacional("Aula01_DIO", 30),
        ConteudoEducacional("Aula02_DIO", 45)
    )

    var formacao = Formacao(nome = "Kotlin Experience", conteudos = conteudos, nivel = Nivel.BASICO)

    while (acao != 2){
        println("""
            
        Selecione a ação desejada:
        1) Matricular aluno
        2) Sair
        """.trimIndent())

        println("\nInsira a ação do menu:")
        println("->")
        acao = readlnOrNull()?.toIntOrNull()
        when (acao){
            1 ->
            {
                println("Digite o nome do aluno a ser adicionado:")
                val usuario = readUser()

                formacao.matricular(usuario)
                formacao.getUsuarios()
            }
            2 -> println("Obrigada, Volte Sempre!")
        }
    }
}


fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    menuFormacao()

}