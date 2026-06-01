package com.espe.inventario.ai;

import com.espe.inventario.dto.ReporteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AiService {

    public String generarResumen(List<ReporteDTO> datos) {
        return "Se procesaron " + datos.size() + " categorías correctamente.";
    }
}