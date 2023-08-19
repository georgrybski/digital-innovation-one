package br.model;

import br.interfaces.*;

public class IPhone implements AparelhoTelefonico, NavegadorInternet , ReprodutorMusical {

    // Implementações da interface AparelhoTelefonico
    public void ligar(String numero) {
        // Código para realizar ligação
    }

    public void atender() {
        // Código para atender chamada
    }

    public void iniciarCorrerioVoz() {
        // Código para iniciar correio de voz
    }

    // Implementações da interface NavegadorInternet
    public void exibirPagina(String url) {
        // Código para exibir página
    }

    public void adicionarNovaAba(String url) {
        // Código para adicionar nova aba
    }

    public void atualizarPagina() {
        // Código para atualizar página
    }

    // Implementações da interface ReprodutorMusical
    public void tocar() {
        // Código para tocar música
    }

    public void pausar() {
        // Código para pausar música
    }

    public void selecionarMusica(String musica) {
        // Código para selecionar música
    }
}