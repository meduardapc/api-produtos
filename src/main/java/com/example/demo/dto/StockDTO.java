package com.example.demo.dto;

import com.example.demo.enums.OperationTypeEnum;

public class StockDTO {

    private long id;
    private OperationTypeEnum tipo;
    private int qtd;

    public StockDTO() {

    }

    public StockDTO(long id, OperationTypeEnum tipo, int qtd) {
        this.id = id;
        this.tipo = tipo;
        this.qtd = qtd;
    }

    public long getId() {
        return id;
    }

    public OperationTypeEnum getTipo() {
        return tipo;
    }

    public int getQtd() {
        return qtd;
    }
}
