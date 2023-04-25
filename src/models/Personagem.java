package models;

import exception.PersonagemMortoException;

public class Personagem extends Carta implements Luta {

    private Integer ataque;
    private Integer defesa;
    private Integer vida;
    private Boolean defesaAtiva = false;

    @Override
    public void atacar(Personagem personagem) throws PersonagemMortoException {

        if (isVivo()) {

            System.out.println(getNome() + " atacou " + personagem.getNome() + " com " + getAtaque() + " de dano");
            personagem.apanhar(getAtaque());
        } else {

            throw new PersonagemMortoException(getNome());
        }
    }

    @Override
    public void defender() {

        if (isVivo()) {

            if (!this.defesaAtiva && this.defesa > 0) {

                System.out.println(getNome() + " ativou a defesa");
                this.defesaAtiva = true;
            }
        } else {

            throw new PersonagemMortoException(getNome());
        }
    }

    @Override
    public void apanhar(Integer dano) {

        if (isVivo()) {

            System.out.println(getNome() + " sofreu " + dano + " de dano");
            if (this.defesaAtiva) {

                this.defesa -= dano;
                this.defesaAtiva = false;

                if (this.defesa < 0) {

                    this.vida += this.defesa;
                    this.defesa = 0;
                }
            } else {
                this.vida -= dano;
            }

            if (this.vida < 0) {
                this.vida = 0;
                System.out.println(getNome() + " morreu");
            }
        } else {

            throw new PersonagemMortoException(getNome());
        }
    }

    public Boolean isVivo() {
        return this.vida > 0;
    }

    public Integer getAtaque() {
        if (this.defesaAtiva) {
            return ataque / 2;
        }
        return ataque;
    }

    public Personagem(String nome, String descricao, Integer ataque, Integer defesa, Integer vida) {
        super(nome, descricao);
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Boolean getDefesaAtiva() {
        return defesaAtiva;
    }

    public void setDefesaAtiva(Boolean defesaAtiva) {
        this.defesaAtiva = defesaAtiva;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "ataque=" + ataque +
                ", defesa=" + defesa +
                ", vida=" + vida +
                ", defesaAtiva=" + defesaAtiva +
                '}';
    }
}
