package tests;

import models.ManipuladorArquivo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestaManipulacaoArquivo {
    public static void main(String[] args) {
        try{
            String path = "C:\\Users\\logonpflocal\\Downloads\\fiap-livraria\\Cupom.txt";
            ManipuladorArquivo.escrever(path);
            ManipuladorArquivo.leitor(path);
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
