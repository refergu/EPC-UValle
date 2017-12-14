### **1011 - Army Strength**<br/>
#### Description<br/>
La próxima invasión MechaGodzilla está en camino a la Tierra. Y una vez más, la Tierra será el campo de batalla de una guerra épica. El ejército de MechaGodzilla se compone de muchos monstruos alienígenas desagradables, tales como Space Godzilla, King Gidorah y MechaGodzilla sí misma. Para detenerlos y defender la Tierra, Godzilla y sus amigos se preparan para la batalla. Cada ejército se compone de muchos monstruos diferentes. Cada monstruo tiene una fuerza que puede ser descrito por un número entero positivo. Cuanto mayor sea el valor, más fuerte es el monstruo. La guerra consistirá en una serie de batallas. En cada batalla, el más débil de todos los monstruos que todavía están vivos es asesinado. Si hay varios monstruos más débiles, pero todos ellos en el mismo ejército, uno de ellos es asesinado al azar. Si ambos ejércitos tienen al menos uno de los monstruos más débiles, un monstruo débil aleatoria del ejército de MechaGodzilla es asesinado. La guerra ha terminado si en uno de los ejércitos a todos los monstruos están muertos. El ejército muerto pierde, el otro ganó. Se le da los puntos fuertes de todos los monstruos. Averigüe quién gana la guerra.
#### Input specification<br/>
La primera línea del archivo de entrada contiene un entero **T** especificando el número de casos de prueba. Cada caso de prueba es precedido por una línea en blanco. Cada caso de prueba comienza con la línea que contiene dos enteros positivos **NG** y **NM** (el número de monstruos en Godzilla y en el ejército de MechaGodzilla). Dos líneas siguen. El primero contiene números enteros positivos **NG** (los puntos fuertes de los monstruos en el ejército de Godzilla ). Del mismo modo, el segundo contiene números enteros positivos **NM** (los puntos fuertes de los monstruos en el ejército de MechaGodzilla).
#### Output specification<br/>
Para cada caso de prueba, la salida de una sola línea con una cadena que describe el resultado de la batalla. Si está seguro de que el ejército de Godzilla gana, salida de la cadena "Godzilla". Si está seguro de que el ejército de MechaGodzilla gana, salida de la cadena "MechaGodzilla". De lo contrario, la salida de la cadena "incierto".
#### Sample Input<br/>
`2`<br/>
<br/>
`1 1`<br/>
`1`<br/>
`1`<br/>
<br/>
`3 2`<br/>
`1 3 2`<br/>
`5 5`<br/>
#### Sample Output<br/>
`Godzilla`<br/>
`MechaGodzilla`<br/>
<br/>
[Link to Problem](http://coj.uci.cu/24h/problem.xhtml?pid=1011)
