package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Data;
// import lombok.Getter;
// import lombok.RequiredArgsConstructor;
// import lombok.Setter;

// com lombok não precisa criar getter e setter
@Data
// @Getter
// @Setter
// @RequiredArgsConstructor
public class Produto {
    private final Long id;
    private final String nome;
    private final BigDecimal valor; // para valores monetários



}
