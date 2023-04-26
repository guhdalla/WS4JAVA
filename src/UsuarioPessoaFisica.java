public class UsuarioPessoaFisica extends Usuario {

    private String cpf;

    public UsuarioPessoaFisica(String nome, String email, String senha, String cpf, String telefone, String endereco, String fotoPerfil) {
        super(nome, email, senha, telefone, endereco, fotoPerfil);
        this.cpf = cpf;
    }

    public UsuarioPessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Polimorfismo de sobrescrita
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: " + cpf);
    }
}
