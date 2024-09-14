package com.escolasenai;

public enum Turno {
    MANHA("Ensino Médio"), 
    TARDE("Ensino Fundamental"), 
    NOITE("Supletivo");

    private final String descricao;

    Turno(String descricao) {
        this.descricao = descricao;
    }

    public String getTurmas() {
        return descricao;
    }
}
