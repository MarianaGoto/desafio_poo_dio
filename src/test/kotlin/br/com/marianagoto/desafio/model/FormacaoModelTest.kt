package br.com.marianagoto.desafio.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FormacaoModelTest {
    @Test
    fun `deve matricular um usuario na formacao`() {
        val conteudos = listOf(
            ConteudoEducacionalModel("Kotlin Básico", 60)
        )
        val formacao = FormacaoModel("Kotlin", conteudos, NivelModel.BASICO)
        val usuario = UsuarioModel("Maria")

        formacao.matricular(usuario)

        assertEquals(1, formacao.inscritos.size)
        assertEquals("Maria", formacao.inscritos.first().nome)
    }
}