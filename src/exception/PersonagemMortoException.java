package exception;

public class PersonagemMortoException extends RuntimeException {
    public PersonagemMortoException(String nome) {
        super("Personagem " + nome + " está morto e não pode atacar");
    }
}
