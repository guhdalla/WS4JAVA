public class UsuarioPessoaJuridica extends Usuario {

    private String cnpj;

    public UsuarioPessoaJuridica(String nome, String email, String senha, String cnpj, String telefone, String endereco, String fotoPerfil) {
        super(nome, email, senha, telefone, endereco, fotoPerfil);
        this.cnpj = cnpj;
    }

    public UsuarioPessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Polimorfismo de sobrescrita
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ: " + cnpj);
    }
}
