# TestCapitole
Test Capitole
Canditato: Jaume Llort

 
1. C)

2. A)

3. D)

4. B)

5. A)

6. A)

7. D)

8. A)

9. Asumiendo que el método getName de la clase Employee devuelve el nombre:

System.out.println(createEmployeeList().stream().map(Employee::getName).collect(Collectors.joining(", ")));

10. La solución al problema se encuentra en el archivo SiguienteElementoMayor.java.

A) He utilizado Arraylist porque aunque en el ejercicio no haya números duplicados en el caso de haberlos se soportaría esta circunstancia. De la misma manera nos interesa mantener el orden en el que insertamos los elementos y además poder recuperar elementos por posición.

B) O(n^2). Despues de la primera he implementación del método que busca el siguiente elemento mayor (getSEM) he implementado una segunda versión (getSEM2) con una complejidad O(n log n) que aunque será más rápida la ejecución para volúmenes grandes de datos creo que es mucho menos legible y mantenible. Además, esta segunda versión no mantiene el orden de la salida, por lo que no se si sería correcta esta solución.

Se adjunta (comentado) un tercer array random de 1000 elementos en el que se puede observar que el segundo método es aproximadamente el doble de rápido que el primero para ese volumen de datos.