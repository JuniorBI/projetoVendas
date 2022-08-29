package com.antonio.pietroguerra.domain;

import com.antonio.pietroguerra.domain.enums.Prioridade;
import com.antonio.pietroguerra.domain.enums.Status;

import java.time.LocalDate;

public class Ticket {

    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacoes;

    private Tecnico tecnico;
    private Vendas vendas;

}
