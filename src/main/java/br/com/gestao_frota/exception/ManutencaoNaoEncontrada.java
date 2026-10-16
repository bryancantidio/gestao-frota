package br.com.gestao_frota.exception;

public class ManutencaoNaoEncontrada extends RuntimeException {
    
    public ManutencaoNaoEncontrada (String mensagem){
        super(mensagem);
    }
}
