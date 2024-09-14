package com.escolasenai;


public enum Turma {
    TURMA3("Turma 3001"),
    TURMA2( "Turma 2001"),
    TURMA1("Turma 1001");

    private final String turmas;

Turma(String turmas){
    this.turmas = turmas;
}

    public String getTurmasEscola(){
        return turmas;
    }
}