Sistema de Inventario - ESPE

## Descripción

Este proyecto es un sistema de gestión de inventario desarrollado con 
**Spring Boot**, que permite administrar equipos de hardware como PCs, laptops y servidores.

Se aplican paradigmas de programación:

* Imperativo
* Funcional

## Tecnologías utilizadas

* Java 17
* Spring Boot
* Maven
* JPA / Hibernate
* IntelliJ IDEA

## 📂 Estructura del proyecto

```
com.espe.inventario
│
├── controller   → Controladores REST
├── service      → Lógica de negocio
├── repository   → Acceso a datos
├── entity       → Entidades JPA
├── dto          → Objetos de transferencia
├── ai           → Servicios adicionales
```
---

##  Funcionalidades

✔ Registro de hardware
✔ Clasificación por categoría
✔ Cálculo de totales y promedios
✔ Obtención del producto más caro
✔ Generación de reportes

##  Ejemplo de salida

```json
[
  {
    "categoria": "PC",
    "total": 2487761.40,
    "promedio": 2500.26
  }
]
```
---

##  Ejecución del proyecto

1. Clonar repositorio:

```
git clone https://github.com/JohnAucanzhala/paradigmas-de-programaci-n.git
```

2. Abrir en IntelliJ

3. Ejecutar:

```
InventarioEspeApplication.java
```

4. Probar en navegador o Postman:

```
http://localhost:8080/api/inventario/imperativo
```

---

## estudainte

**John Aucanzhala**
 [johnande294@gmail.com](johnande294@gmail.com)


## Conclusión

Este proyecto nos demuestra la implementación de buenass prácticas
en desarrollo backend utilizando Spring Boot, así como la aplicación 
de paradigmas de programación modernos.
