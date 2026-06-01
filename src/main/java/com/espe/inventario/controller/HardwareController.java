package com.espe.inventario.controller;

import com.espe.inventario.dto.ReporteDTO;
import com.espe.inventario.service.HardwareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
@RequiredArgsConstructor
public class HardwareController {

    private final HardwareService service;

    @GetMapping("/imperativo")
    public List<ReporteDTO> imperativo() {
        return service.reporteImperativo();
    }

    @GetMapping("/funcional")
    public List<ReporteDTO> funcional() {
        return service.reporteFuncional();
    }
}