package com.espe.inventario.repository;

import com.espe.inventario.entity.HardwareEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareRepository extends JpaRepository<HardwareEntity, Long> {
}