# El objetivo de este ejercicio es desarrollar un programa para gestionar centrales nucleares, sus trabajadores e incidencias.

### 1) Base de datos
La base de datos estará representada por el script "nuclear.sql".

### 2) Estructura de archivos
El archivo "index.html" contendrá los siguientes elementos:

• Un botón para acceder al listado de centrales: "listado-centrales.html"   
• Un botón para acceder al listado de incidencias: "listado-incidencias.html"
Las vistas se accederán a través de controladores.

### 3) Carga de datos y filtrado
Desde los controladores se cargarán los datos utilizando servicios que, a su vez, utilizarán repositorios. Se mostrarán los listados y se agregarán botones para aplicar filtros. A continuación se detallan los filtros para cada página:

##### a) En la página "listado-centrales":

• Mostrar todas las centrales.   
• Mostrar solo las centrales activas.   
• Mostrar las centrales de tipo 1.  
• Mostrar las centrales que iniciaron su actividad antes de 1975.   
• En lugar de mostrar la latitud y longitud como campos en la tabla, se deberá mostrar como un enlace a Google Maps que nos lleve a esas coordenadas.   
• Espacio reservado para más opciones.    

##### b) En la página "listado-incidencias":

• Mostrar todas las incidencias.  
• Mostrar solo las incidencias resueltas.    
• Mostrar solo las incidencias del año actual.  
• Espacio reservado para más opciones.  
### 4) Creación de una API que devuelve objetos en formato JSON
Una vez completado lo anterior, procederemos a crear una API que devuelva objetos en formato JSON:

• Se agregará una opción en el index para acceder a la API.   
• Se agregarán dos botones para obtener el contenido de las dos tablas en formato JSON.
