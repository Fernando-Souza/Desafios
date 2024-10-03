package com.dio;



public class ReprodutorMusical extends Iphone {

    private String faixaSelecionada = "";
    private Boolean isPlayingMusic = false;

    public void tocar() {
        if (!faixaSelecionada.isEmpty()) {
            System.out.println("Tocando a música " + this.faixaSelecionada);
        } else {
            System.out.println("Erro: Nenhuma música selecionada");
        }
    }

    public void pausar() {
        System.out.println("Reprodução de áudio pausada...");
    }

    
    public void selecionarMusica(String faixa) {
        this.faixaSelecionada = faixa;
        System.out.println("Foi selecionada a música: " + faixa);
    }

}