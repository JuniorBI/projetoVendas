package com.antonio.pietroguerra.domain;

import com.antonio.pietroguerra.domain.enums.Perfil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public abstract class Pessoa {

    protected Integer id;
    protected String nome;
    protected String cpf;
    protected String senha;
    protected String email;
    protected Set<Integer> perfis = new HashSet<>();
    protected LocalDate dataCriacao = LocalDate.now();

    public Pessoa() {
        super();
        addPerfil(Perfil.VENDAS);
    }


    public Set<Perfil> getPerfil() {
        return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil) {
        this.perfis.add(perfil.getCodigo());
    }

}
