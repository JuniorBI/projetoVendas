package com.antonio.pietroguerra.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendas extends Pessoa{

    private List<Ticket> tickets = new ArrayList<>();

}
