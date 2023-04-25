package models;

import exception.PersonagemMortoException;

public class PocaoDeDano extends Feitico implements Magia {

    @Override
    public void enfeiticar(Personagem personagem) {

        if (personagem.isVivo()) {

            System.out.println(getNome() + " causou " +  getValor() + " de dano no " + personagem.getNome());
            personagem.apanhar(getValor());
        } else {

            throw new PersonagemMortoException(personagem.getNome());
        }
    }

    public PocaoDeDano(String nome, String descricao, Integer valor) {
        super(nome, descricao, valor);
    }
}
