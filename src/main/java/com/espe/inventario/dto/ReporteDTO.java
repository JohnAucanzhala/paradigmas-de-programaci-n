package com.espe.inventario.dto;

import com.espe.inventario.entity.HardwareEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ReporteDTO {

    private String categoria;
    private BigDecimal total;
    private Double promedio;
    private HardwareEntity masCaro;
}