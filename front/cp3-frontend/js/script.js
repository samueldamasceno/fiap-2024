class Usuario {
    constructor(nome, email, senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}

const usuariosPredefinidos = [
    new Usuario ("Usuário 1", "usuario1@fiap.com.br", "111111"),
    new Usuario ("Usuário 2", "usuario2@fiap.com.br", "222222"),
    new Usuario ("Usuário 3", "usuario3@fiap.com.br", "333333"),
    new Usuario ("Usuário 4", "usuario4@fiap.com.br", "444444"),
    new Usuario ("Usuário 5", "usuario5@fiap.com.br", "555555"),
    new Usuario ("Usuário 6", "usuario6@fiap.com.br", "666666"),
    new Usuario ("Usuário 7", "usuario7@fiap.com.br", "777777"),
    new Usuario ("Usuário 8", "usuario8@fiap.com.br", "888888"),
    new Usuario ("Usuário 9", "usuario9@fiap.com.br", "999999")
];

const formularioLogin = document.getElementById("formulario-login");
const mensagem = document.getElementById("mensagem");

const botaoLogout = document.getElementById("btn-logout");
const divDados = document.getElementById("dados-usuario");

if (localStorage.getItem("usuarios") === null) {
    localStorage.setItem("usuarios", JSON.stringify(usuariosPredefinidos))
  }

function validarLogin(email, senha) {
    const stringUsuarios = localStorage.getItem("usuarios");
    const usuarios = JSON.parse(stringUsuarios);

    for (let usuario of usuarios) {
        if (email === usuario.email && senha === usuario.senha) {
            exibirMensagem("sucesso", "Login feito com sucesso! Bem-vindo!");
            sessionStorage.setItem("usuarioLogando", JSON.stringify(usuario));
            setTimeout(() => {
                window.location.assign("./index.html");
            }, 5000);
            return;
        }
    }
    exibirMensagem("erro", "Login inválido. Tente novamente.");
}

function fazerLogin() {
    const email = document.getElementById("formulario-email").value;
    const senha = document.getElementById("formulario-senha").value;
    validarLogin(email, senha);
}

function exibirMensagem(tipo, texto) {
    mensagem.classList.remove("sucesso", "erro");
    if (tipo == "sucesso") {
        mensagem.classList.add("sucesso")
    }
    if (tipo == "erro") {
        mensagem.classList.add("erro")
    }
    mensagem.textContent = texto;
    mensagem.style.display = "block";
}

function logout(){
    window.location.assign("./login.html");
}

function exibirDados() {
    const usuarioLogado = JSON.parse(sessionStorage.getItem("usuarioLogando"));
        document.getElementById("dados-usuario").innerHTML = `
            <p>Nome: ${usuarioLogado.nome}</p>
            <p>Email: ${usuarioLogado.email}</p>`;
}

if (window.location.pathname.endsWith("index.html")) {
    exibirDados();
}