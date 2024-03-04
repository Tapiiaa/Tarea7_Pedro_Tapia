Tarea 7 Técnicas de Programación
Realizada por Pedro Alonso Tapia Lobo
Fecha de entrega: 04/03/2024

# Ejercicio 1:
## Enunciado: 
Crear una clase avanzada para simular dados que, además de las funcionalidades básicas, incluya inteligencia artificial para predecir la probabilidad de futuros lanzamientos basada en los resultados anteriores. Implementar un algoritmo que utilice esta clase para realizar simulaciones complejas.
## Pseudocódigo proporcionado:
clase DadoIA:
    # Atributos y métodos como se describen, más lógica de IA para predicciones

algoritmo principal:
    dado1 = DadoIA(6)
    dado2 = DadoIA(10)
    dado3 = DadoIA(12)
    mientras suma de los dados < 20:
        resultado1 = dado1.lanzar()
        resultado2 = dado2.lanzar()
        resultado3 = dado3.lanzar()
        # Procesar y mostrar resultados con predicciones de IA
## Explicación: 
Para este ejercicio, se han creado dos clases: Dado y Juego.
- En la clase Dado, se inicializa un constructor para crear un objeto dado en la clase Juego.  Además, se implementan los getters y setters correspondientes, además de un método para lanzar el dado.
- En la clase juego se implementa el main de la aplicación. En este método se lanzan 3 dados aleatoriamente, donde se suman los resultados. Al finalizar las tiradas, se pregunta al usuario si desea volver a tirar los dados. Cuando el usuario finalmente no quiere volver a tirar, se imprime un array por pantalla que indica las sumas de todos los lanzamientos.
- Se implementa un test para comprobar el lanzamiento del dado
- Se crea un UML del proyecto.

# Ejercicio 2. 
## Enunciado: 
Desarrollar una clase Cliente que, además de almacenar información básica, utilice algoritmos de aprendizaje automático para ofrecer recomendaciones personalizadas de libros basadas en las preferencias y el historial de compras. Implementar un algoritmo de prueba con un sistema de gestión de clientes que incluya estas recomendaciones.
## Pseudocódigo: 
clase Cliente:
    # Atributos y métodos como se describen, más algoritmos de recomendación

algoritmo principal:
    # Lógica del menú para crear y mostrar clientes con recomendaciones personalizada
## Explicación:
En este ejercicio se crean dos clases: Cliente y Menú.
- En la clase cliente se crea un constructor para poder crear "x" clientes en la clase Menú. El método crearCliente() modela un cliente pidiendole al usuario el nombre del cliente, donde se le pide su género de lectura favorito. Un contador inicializa desde 0 un id, donde el primer usuario del programa recibe id "0", hasta que el último recibe id "n".
- En la clase menú, se crea el menú que se imprime en la consola, para que el usuario pueda crear un usuario y ser recomendado en base a sus preferencias.
- Al mostrar los usuarios, se muestra la lista de los nombres junto a su id correspondiente.

# Ejercicio 3.
## Enunciado:
Mejorar la clase Cuadricula para la micro guerra de barcos, incorporando una simulación ambiental que afecte las condiciones del juego (por ejemplo, clima y corrientes marinas). Implementar un algoritmo que use esta clase mejorada, añadiendo complejidad al juego.
## Pseudocódigo:
clase CuadriculaAvanzada:
    # Atributos y métodos como se describen, más simulación ambiental

algoritmo principal:
    cuadricula = CuadriculaAvanzada()
    # Lógica del juego con condiciones ambientales afectando el juego
## Explicación:
En este ejercicio se implementan nuevamente dos clases: JuegoBarcos y CuadriculaJuego. 
- En la clase CuadriculaJuego se inicializan los métodos y constructores para poder crear una cuadricula/tablero en la clase JuegoBarcos. Además, se implementan los métodos para insertar un barco y disparar.
- En la clase JuegoBarcos se imprime el tablero para poder iniciar el juego. A lo largo de la partida, se le va preguntando al usuario donde quiere colocar sus disparos para intentar hundir la flota.
# Ejercicio 4.
## Enunciado: 
Descripción
En esta versión, tanto el jugador como la computadora utilizan estrategias de inteligencia artificial para posicionar y atacar. La computadora no solo dispara en cada celda, sino que aprende y adapta su estrategia basada en los resultados de los disparos.
## Pseudocódigo:
clase CuadriculaConIA:
    # Atributos y métodos como se describen, más estrategias de IA para ataques y defensa

algoritmo principal:
    cuadriculaJugador = CuadriculaConIA()
    cuadriculaComputadora = CuadriculaConIA()
    # Lógica del juego donde ambos jugadores usan IA para estrategias
## Explicación:
- En este ejercicio, se reutiliza el código de CuadriculaJuego del ejercicio tres, debido a que esta cumplirá la misma función.
- En cambio, se crea una nueva clase JuegoBarcosConOrdenador, donde este genera unas cordenadas aleatorias para situar su barco. Al usuario se le pide que ingrese las coordenadas para:
     - Esconder su barco
     - Disparar hacia el barco del ordenador
- El ordenador genera unas coordenadas aleatorias para intentar hundir nuestro barco.

-Todos los ejercicios tienen UML implementados-

