package com.espe.inventario.service;

import com.espe.inventario.dto.ReporteDTO;
import com.espe.inventario.entity.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HardwareService {
    public List<HardwareEntity> generarDatos() {
        List<HardwareEntity> lista = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            lista.add(HardwareEntity.builder()
                    .modelo("Modelo " + i)
                    .categoria(Categoria.values()[i % 3])
                    .precio(BigDecimal.valueOf(Math.random() * 5000))
                    .fechaCompra(LocalDate.now().minusDays((long)(Math.random() * 3000)))
                    .estado(i % 2 == 0 ? Estado.ACTIVO : Estado.DEBAJA)
                    .build());
        }

        return lista;
    }
    public List<ReporteDTO> reporteImperativo() {

        List<HardwareEntity> lista = generarDatos();

        Map<Categoria, List<HardwareEntity>> agrupado = new HashMap<>();
        LocalDate limite = LocalDate.now().minusYears(5);

        for (HardwareEntity h : lista) {

            if (h.getEstado() == Estado.ACTIVO && h.getFechaCompra().isAfter(limite)) {

                if (!agrupado.containsKey(h.getCategoria())) {
                    agrupado.put(h.getCategoria(), new ArrayList<>());
                }

                agrupado.get(h.getCategoria()).add(h);
            }
        }

        List<ReporteDTO> resultado = new ArrayList<>();

        for (Categoria categoria : agrupado.keySet()) {

            List<HardwareEntity> equipos = agrupado.get(categoria);

            BigDecimal total = BigDecimal.ZERO;
            HardwareEntity masCaro = null;

            for (HardwareEntity h : equipos) {

                total = total.add(h.getPrecio());

                if (masCaro == null || h.getPrecio().compareTo(masCaro.getPrecio()) > 0) {
                    masCaro = h;
                }
            }

            double promedio = total.doubleValue() / equipos.size();

            resultado.add(new ReporteDTO(
                    categoria.name(),
                    total,
                    promedio,
                    masCaro
            ));
        }

        return resultado;
    }
    public List<ReporteDTO> reporteFuncional() {

        List<HardwareEntity> lista = generarDatos();
        LocalDate limite = LocalDate.now().minusYears(5);

        return lista.stream()

                .filter(h -> h.getEstado() == Estado.ACTIVO)
                .filter(h -> h.getFechaCompra().isAfter(limite))

                .collect(Collectors.groupingBy(HardwareEntity::getCategoria))

                .entrySet().stream()

                .map(entry -> {

                    List<HardwareEntity> equipos = entry.getValue();

                    BigDecimal total = equipos.stream()
                            .map(HardwareEntity::getPrecio)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);

                    double promedio = equipos.stream()
                            .mapToDouble(h -> h.getPrecio().doubleValue())
                            .average()
                            .orElse(0);

                    HardwareEntity masCaro = equipos.stream()
                            .max(Comparator.comparing(HardwareEntity::getPrecio))
                            .orElse(null);

                    return new ReporteDTO(
                            entry.getKey().name(),
                            total,
                            promedio,
                            masCaro
                    );
                })

                .toList();
    }
}