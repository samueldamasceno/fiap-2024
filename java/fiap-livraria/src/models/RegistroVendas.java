package models;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroVendas {

    private List<Exemplar> lista = new ArrayList<>();
    private double total;
    //Polimorfismo
    public void adicionar(Exemplar item){
        System.out.println("Item adicionado " + item.getTitulo());
        total += item.getPreco();
        lista.add(item);
    }

    public void exibir(){
        System.out.println("-------------------------------------------------------");
        System.out.println("  ITENS COMPRADOS   ");
        System.out.println("Título adquirido    - Preço");
        lista.forEach(e ->
                System.out.println(e.getTitulo() + " -    " + e.getPreco()));
        System.out.println("-------------------------------------------------------" +
                "\nValor total da sua compra: R$ " + total);
    }


    public void imprimirCupom(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        try {
            buffWrite.append("CUPOM FISCAL");
            buffWrite.append("\n-------------------------------------------------------");
            buffWrite.append( "\n  ITENS COMPRADOS   ");
            lista.forEach(e ->
            {
                try {
                    buffWrite.append("\n" + e.getTitulo() + " -    " + e.getPreco());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            buffWrite.append("\n-------------------------------------------------------" +
                    "\nValor total da sua compra: R$ " + total);
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            buffWrite.close();
        }

    }
    public String exibirCupom(){
        String msg = "";
        msg = "CUPOM FISCAL";
        msg += "\n-------------------------------------------------------";
        msg += "\n  ITENS COMPRADOS   ";
        msg += "\nTítulo adquirido    - Preço";
        for(Exemplar livro: lista){
            msg = msg + "\n" + livro.getTitulo() + " -    " + livro.getPreco();
        }
        msg += "\n-------------------------------------------------------" +
                "\nValor total da sua compra: R$ " + total;
        return msg;
    }
    public void imprimirCupom2(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        try {
          buffWrite.append(exibirCupom());
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            buffWrite.close();
        }

    }

    public void teste(){

        for(Exemplar e : lista){
            System.out.println(e.getTitulo());
        }
    }
}
