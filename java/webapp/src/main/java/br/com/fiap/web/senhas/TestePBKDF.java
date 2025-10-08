package br.com.fiap.web.senhas;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class TestePBKDF {

    public static void main(String[] args) {
        try{
            String senha = "minhaSenha123";
            //Gerar o salt aleatório
            byte[] salt = PasswordHashPBKDF2.generateSalt();
            System.out.println("Salt: " + Base64.getEncoder().encodeToString(salt));

            //Gerar o hash
            String hashPassword = PasswordHashPBKDF2.hashPassword(senha, salt);
            System.out.println("Senha criptografada: " + hashPassword);

            //Verifica senha
            boolean senhaValida = PasswordHashPBKDF2.verificarSenha("minhaSenha", hashPassword, salt);
            System.out.println("Senha válida? " + senhaValida);
        }
        catch (NoSuchAlgorithmException | InvalidKeySpecException e){
            e.printStackTrace();
        }
    }
}
