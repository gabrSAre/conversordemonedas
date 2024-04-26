<h1><em>CONVERSOR DE MONEDAS</em></h1>

<P>Este programa utiliza el consumo de la API ExchangeRate-API: (https://www.exchangerate-api.com/).
El objetivo del programa es ofrecer una interacción al usuario, a través de la cual pueda elegir por 
medio de un <strong>menú de opciónes</strong>, la modeda que quiere convertir y a cual modena la 
quiere convertir.</P> 


<h2><em>¡TOMENSÉ EN CUENTA LAS SIGUIENTES INDICACIONES!</em></h2>

<p>
   *Se utilizó al máximo provecho las herramientas de la API ExchangeRate, a fín de minimizar procesos en la conversion de una
   moneda a otra.

  ==>En la API, se ofrece una documentación donde se explican las diferentes funcionalidades del conversor: 
  <strong>(https://www.exchangerate-api.com/docs/pair-conversion-requests) </strong>
  
<Ul>
  <li><strong>https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/COP</strong></li>
  <p>Esta opción, permite convertir el valor de una moneda a otra, solamente por unidad, en este caso se convertirá
  el valor de 1 dolar a pesos colombianos,si se invirtieran los parametros convertiría 1 peso colombiano a dolares</p>

  <img width="533" alt="image" src="https://github.com/gabrSAre/conversordemonedas/assets/158003681/690a6735-db04-4da5-b899-b161f71035ef">

  
  <li><strong>https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/COP/AMOUNT</strong></li>
  <p> En esta opción se agrega un nuevo parametro para cantidad, "AMOUNT", este indica qué cantidad de la moneda se quiere convertir.
  ==> En este ejemplo : <strong><em>https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/COP/50</em></strong>,se convertirán
  50 dolares a pesos colombianos.</p>

  <img width="524" alt="image" src="https://github.com/gabrSAre/conversordemonedas/assets/158003681/413ae6e7-e397-497f-a1e2-63e54fb5c2ff">

  ==> Un dolar convertido a pesos colombianos es igual a 3934.6045 pesos, ese valor multiplicado 50, es igual a: 196730.225 <==
  La API muestra tanto la conversion de dolar a pesos, como también la cantidad a la que se quiere multipicar ese valor.
  
</Ul>

*No se construyó el programa en base al primer ejemplo de solo dos parametros /USD/COP, puesto que luego se tendría que agregar un
nuevo algoritmo para multiplicar la cantidad convertida,  a la cantidad que ingrese el usuario en el menú de opciónes. 
Para optimizar al máximo el uso de la API, basta solo con que el usuario ingrese la cantidad que quiere convertir y la modena que 
quiere convertir con el uso del parametro AMOUNT.  ==> /USD/COP/AMOUNT <==
</p>


<h1>UTILIZACION OPTIMA DE String</h1>

<p>Para mostrar el valor convertido en pantalla se utilizó el formato 
"""
""".format(parmetro1,parametro2,....), ajustando solo dos decimales con la opción %.2f </p>

<img width="847" alt="image" src="https://github.com/gabrSAre/conversordemonedas/assets/158003681/e26ee8c7-4677-4e77-b2dc-8722b204745b">


<p> 
  ==> No se implementaron metodos de redondeo para conservar la exactitud del dato entregado por la API.
</p>

EJEMPLO:

<img width="479" alt="image" src="https://github.com/gabrSAre/conversordemonedas/assets/158003681/01c085a9-6060-4384-8ff1-0765238ef8b0">

COMPILADO POR EL PROGRAMA:

<img width="717" alt="image" src="https://github.com/gabrSAre/conversordemonedas/assets/158003681/14278c08-66c0-42b8-a904-e757204ebbf5">





