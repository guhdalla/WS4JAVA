package models;

import exception.PersonagemMortoException;

public class PocaoDeVida extends Feitico implements Magia {

    @Override
    public void enfeiticar(Personagem personagem) {

        if (personagem.isVivo()) {

            System.out.println(personagem.getNome() + " utilizou " + getNome() + " com " + getValor() + " de vida");
            personagem.setVida(personagem.getVida() + getValor());
        } else {

            throw new PersonagemMortoException(personagem.getNome());
        }
    }

    public PocaoDeVida(String nome, String descricao, Integer valor) {
        super(nome, descricao, valor);
    }
}
