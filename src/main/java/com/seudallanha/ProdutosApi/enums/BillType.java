package com.seudallanha.ProdutosApi.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillType {
    @JsonProperty("INCOME") //RECEITA
    INCOME,
    @JsonProperty("EXPENSE") //DESPESA
    EXPENSE
}
