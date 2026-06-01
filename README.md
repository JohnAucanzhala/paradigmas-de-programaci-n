Sistema de Inventario - ESPE

## Descripción

En el presente trabajo se desarrolla un sistema de gestión de inventario de equipos tecnológicos utilizando Spring Boot. El objetivo principal es implementar una solución que procese grandes volúmenes de datos y comparar dos paradigmas de programación: el enfoque imperativo y el enfoque funcional.

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
Implementación Imperativa
El enfoque imperativo se desarrolló utilizando estructuras tradicionales como bucles for, condicionales if y variables acumuladoras.
Este enfoque permite un control detallado del flujo del programa, pero genera mayor cantidad de código y es más propenso a errores.
Imperativo
<img width="975" height="106" alt="image" src="https://github.com/user-attachments/assets/1e1c6ed1-0c50-4a18-9bb7-1996bf728f48" />
Implementación Funcional
El enfoque funcional se implementó utilizando Java Streams API, permitiendo realizar operaciones como filtrado, agrupación y cálculos de forma declarativa.
Se utilizaron funciones como:
•	filter
•	groupingBy
•	map
•	reduce
•	max
Este enfoque reduce significativamente las líneas de código y mejora la legibilidad.
<img width="975" height="173" alt="image" src="https://github.com/user-attachments/assets/5e2785fa-f395-4570-90b2-3c3c90a8383a" />
<img width="975" height="260" alt="image" src="https://github.com/user-attachments/assets/32784fec-03cf-4783-9352-a1ca292bb591" />

El sistema procesó correctamente 10,000 registros de hardware, aplicando los siguientes criterios:
•	Filtrado por estado ACTIVO
•	Filtrado por equipos adquiridos en los últimos 5 años
•	Agrupación por categoría
•	Cálculo de total y promedio
•	Identificación del equipo más costoso
Análisis Comparativo
Criterio	           Imperativo	         Funcional
Líneas de código	     Mayor	            Menor
Legibilidad	           Media	            Alta
Facilidad de 
mantenimiento         Baja	              Alta
Complejidad	           Alta	              Media

El enfoque funcional demuestra ser más eficiente y adecuado para el procesamiento de grandes volúmenes de datos.


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

Con este proyecto concluyo que ambos paradigmas permiten resolver el problema planteado, sin embargo, el paradigma funcional ofrece ventajas significativas en términos de legibilidad, mantenimiento y escalabilidad.
El uso de Java Streams facilita la implementación de soluciones más limpias y eficientes, siendo recomendable para sistemas modernos.

