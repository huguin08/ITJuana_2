# ITJuana_2
Devolver los índices de los dos números en la lista cuya suma sea igual al numero dado

Dado un array de enteros nums y un entero target, queremos encontrar los índices de los dos números en el array cuya suma sea igual a target. Como se garantiza que hay exactamente una solución y no se pueden usar elementos duplicados, podemos asumir que solo existe un par de números que cumple con esta condición.

Utilizaremos un HashMap para almacenar los números del array junto con sus índices. Luego, recorremos el array y en cada iteración verificamos si el complemento del número actual (es decir, target - nums[i]) está presente en el HashMap. Si lo encontramos, significa que hemos encontrado el par de números que suman target, y devolvemos los índices correspondientes.
