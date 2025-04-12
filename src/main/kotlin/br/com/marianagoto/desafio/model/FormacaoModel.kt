package br.com.marianagoto.desafio.model

data class FormacaoModel(val nome: String, var conteudos: List<ConteudoEducacionalModel>, val nivel: NivelModel) {

    val inscritos = mutableListOf<UsuarioModel>()

    fun matricular(usuario: UsuarioModel) {
        inscritos.add(usuario)
        println("Aluno ${usuario.nome} inscrito na formação ${nome} de nível ${nivel.desc} e nos seguintes conteúdos:")
        for (conteudo in conteudos) {
            println("- ${conteudo.nome} de duração de ${conteudo.duracao} minutos.")
        }
    }
}