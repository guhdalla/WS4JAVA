import java.util.ArrayList;
import java.util.List;

public class MainUsuario {

    public static void main(String[] args) {

        UsuarioPessoaFisica usuario = new UsuarioPessoaFisica("Gustavo", "123442134234");
        UsuarioPessoaJuridica usuario2 = new UsuarioPessoaJuridica("Renan", "0012301203");


        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(usuario2);

        for (Usuario u : usuarios) {
            String nome = u.getNome();
            System.out.println("Nome: " + nome);

//            u.imprimir();
        }

    }
}
