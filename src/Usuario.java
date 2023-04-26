public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;
    private String fotoPerfil;

    // Polimorfismo de sobrecarga
    public Usuario(String nome, String email, String senha, String telefone, String endereco, String fotoPerfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.fotoPerfil = fotoPerfil;
    }

    // Polimorfismo de sobrecarga
    public Usuario(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
