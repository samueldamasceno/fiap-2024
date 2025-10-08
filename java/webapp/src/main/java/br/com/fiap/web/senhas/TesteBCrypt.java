package br.com.fiap.web.senhas;

public class TesteBCrypt {
    public static void main(String[] args) {
        String senha = "minhaSenha123";
        String senhaHash = PasswordHash.hashPassoword(senha);
        System.out.println("Senha criptografada: " + senhaHash);

        //Verificação
        boolean senhaValida = PasswordHash.verificaSenha("minhaSenha", senhaHash);
        System.out.println("A senha é válida: " + senhaValida);



    }
}
