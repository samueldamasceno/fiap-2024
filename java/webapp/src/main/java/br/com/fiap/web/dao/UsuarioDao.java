package br.com.fiap.web.dao;


import br.com.fiap.web.model.Usuario;

public class UsuarioDao {


    /**
     * Cadastrar um usuario
     * Receber um usuário, criptografar a senha e gravar no banco
     * os dados com a senha criptografada
     * */
    public void cadastrar(Usuario usuario){

    }

    /**
     * Validar um usuario
     * Receber um usuário (ou login, senha)
     * verificar se o login e a senha estão corretos
     * */
    public String verificarLogin(Usuario usuario){
        return "Usuário correto"; //ou "Login ou senha inválidos"
    }
}
