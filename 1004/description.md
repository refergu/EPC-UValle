### **1004 - Rejilla de desplazamiento**<br/>
#### Description<br/>
Comenzando en la esquina superior izquierda de una rejilla **M x N** y mirando hacia la derecha, se sigue caminando un cuadrado a la vez en la dirección que está enfrentando. Si alcanza el límite de la red o si la próxima plaza que está a punto de visitar ya ha sido visitada, gire a la derecha. Te detienes cuando se han visitado todas las plazas de la parrilla. ¿En qué dirección va a estar enfrentando cuando te detienes? Por ejemplo: Consideremos el caso con **N = 3, M = 3**. El camino seguido será *(0,0) -> (0,1) -> (0,2) -> (1,2) -> (2 , 2) -> (2,1) -> (2,0) -> (1,0) -> (1,1)*. En este punto, todas las plazas se han visitado, y se enfrentan a la derecha.  
#### Input specification<br/>
La primera línea contiene **T**, que es el número de casos de prueba. Cada una de las siguientes líneas **T** contiene dos números enteros **N** y **M**, que denota el número de filas y columnas respectivamente.
#### Output specification<br/>
Salida **T** líneas, una para cada caso de prueba, que contiene la dirección requerida a la que se enfrenta al final. Salida **L** para izquierda, **R** para la derecha, **U** para arriba, y **D** para abajo. **1 <= t <= 5000**, **1 <= N, M <= 10 ^ 9**. 
#### Sample Input<br/>
`4`<br/>
`1 1`<br/>
`2 2`<br/>
`3 1`<br/>
`3 3`<br/>
#### Sample Output<br/>
`R`<br/>
`L`<br/>
`D`<br/>
`R`<br/>
<br/>
[Link to Problem](http://coj.uci.cu/24h/problem.xhtml?pid=1004)
