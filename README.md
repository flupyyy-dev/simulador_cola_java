# Simulador de Cola de Atención al Cliente

## Descripción

Este programa simula la atención de clientes en una sucursal.
Usa:

* Cola (para los clientes en espera)
* Pila (para el historial de atendidos)

Todo está hecho desde cero con nodos, sin usar estructuras de Java como ArrayList o Queue.

---

## Cómo funciona

* Los clientes se cargan automáticamente desde el archivo `clientes.txt`
* Se atienden en orden de llegada (FIFO)
* Cada cliente atendido se guarda en el historial (LIFO)

---

## Estructura del proyecto

```
simulador-cola-java/
│
├── src/
│   ├── Cliente.java
│   ├── Nodo.java
│   ├── Cola.java
│   ├── Pila.java
│   ├── Simulador.java
│
├── data/
│   └── clientes.txt
│
└── README.md
```

---

## Cómo ejecutar

Desde la carpeta principal del proyecto:

### Compilar

```
javac src/*.java
```

### Ejecutar

```
java -cp src Simulador
```

---

## Funciones

* Agregar cliente
* Atender cliente
* Ver cola
* Ver historial
* Ver último atendido

---

## Importante

* No se usan colecciones de Java
* Todo está implementado con nodos
* Incluye manejo básico de errores

---

## Datos

* Proyecto del Estructuras de Datos.
* DESCRIPCIÓN COMPLETA EN EL ARCHIVO ADJUNTO
* Dylan Odair Paz Navas (202503824)
* Universidad Da Vinci de Guatemala
