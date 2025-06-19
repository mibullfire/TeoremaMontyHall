# Proyecto para Comprobar el Teorema de Monty Hall
## Descripción

Este proyecto implementa una simulación del famoso **Teorema de Monty Hall** para demostrar matemáticamente que cambiar de puerta incrementa las probabilidades de ganar del 33% al 67%.

## Módulos del Proyecto

### `Puertas.java`
Record que representa el estado de las tres puertas del juego. Implementa:
- Validación para asegurar que exactamente una puerta contenga el premio.
- Método para acceder al estado de una puerta específica por número.
- Inmutabilidad mediante el uso de record de Java.

### `TeoremaSinCambiar.java`
Clase que implementa la simulación del Teorema de Monty Hall sin cambiar de puerta. Contiene:
- Simulación de "x" iteraciones para obtener resultados estadísticamente significativos.
- Lógica para crear situaciones aleatorias con el premio distribuido aleatoriamente.
- Cálculo y visualización de la probabilidad de victoria manteniendo la elección inicial.

### `TeoremaConCambio.java`
Clase que implementa la simulación del Teorema de Monty Hall cambiando de puerta. Contiene:
- Simulación de "x" iteraciones para obtener resultados estadísticamente significativos.
- Lógica para crear situaciones aleatorias con el premio distribuido aleatoriamente.
- Implementación de la estrategia de cambio de puerta tras revelación.
- Cálculo y visualización de la probabilidad de victoria cambiando la elección inicial.

## Resultados Esperados

- **Sin cambiar de puerta**: ~33% de victorias.
- **Cambiando de puerta**: ~67% de victorias.