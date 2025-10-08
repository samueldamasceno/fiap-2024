package model;

import enums.TipoSala;

public class Sala {
    private String numero;
    private TipoSala tipo;
    private int capacidade;
    private boolean disponivel;

    public Sala(String numero, TipoSala tipo, int capacidade, boolean disponivel) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.disponivel = disponivel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoSala getTipo() {
        return tipo;
    }

    public void setTipo(TipoSala tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
