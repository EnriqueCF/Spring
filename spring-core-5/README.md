# Spring
Spring 

Patrones con Spring.

Ambitos de un bean:
- Inyección de dependencias.
- Singleton: restringe la creación de objetos de un tipo a uno solo.
- Prototype: permite la creación de nuevos objetos duplicandolos.

Spring AOP:
- Factory: centralización de la construcción de objetos.

Spring MVC:
- Modelo-Vista-Controlador: separa la lógica y los datos de la interfaz y el control de peticiones.

Spring IoC Container:
- Front Controller: un solo controlador maneja todas las peticiones.
- Factory: centralización de la construcción de objetos.


Inversión de Control (IoC):
- Dejar que sea otro el que controle el flujo del programa.

Inyección de dependencias:


Contenedores IoC.
'Core container' compuesto por: beans, core, context y spel.
Los elementos básicos son:
    - BeanFactory: elemento principal para manejar los objetos.
    - ApplicationContext:Añade AOP, manejo de recursos,  internacionalización, contextos específicos, ...

Beans: son objetos gestionados por el Contenedor IoC.
    - Se crean con los metadatos que proporcionamos en la configuración.
    - Tienen un ID único dentro del contenedor. Si necesita más de un nombre, se puede asignar un alias.


Inyección de dependencias:
    - Vía Setter.
    - Vía constructor.
    - Via autowired


Ámbito de un Bean:
- Singleton: se crae una sóla instancia, y esta es inyectada en cada uno de los beans que la refencian.
  - scope = singleton
- Prototype: se crea una instancia cada vez que se necesita
- Request: se crea un objeto por cada petición HTTP. Cuando la petición termina de procesarse, se descarta el objeto.
- Session: objeto por cada sesón HTTP. Cuando la sesión se destruye, se descarta el objeto.
- Application: se crea un objeto por cada ServletContext, se trata de un objeto por cada instancia de la aplicación.


Ciclo de vida de un bean:
- Podemos interactuar mediante Callbacks.
- Después de que se instancia o antes de que se destruya.
- Interfaces InitializingBean y DisposableBean. 
  - El bean debe implementar las interfaces.
  - InitializingBean -> @
  - DisposableBean -> Antes de eliminar el bean.


Anotaciones:
- Autowired. 3 usos:
  - A nivel de propiedad.
  - A nivel de método setter.
  - A nivel de constructor para los atributos final.

- Primary. Bean que entre iguales, el que esté marcado como primary será el primero en ser elegido.

- Qualifier. Permite especificar el nombre el bean que debe ser vinculado.
  - A nivel de método.
  - A nivee propiedad.

Estereotipos.
Spring proporciona la posiblidad de detectar candidatos a ser beans gestionados por el contenedor.
- @Component. Estereotipo más básicos.
- @Service: orientado a las clases servicio, lógica de negocios.
- @Repository: clases de acceso a datos (DAO).
- @Controller: clases que sirven para gestionar las peticiones recibidas.


Anotaciones clave:
- @Configuration: va a nivel de clase, e indica que una clase va a definiar uno o más @Bean.
- @Bean: va a nivel de méotdo. Devuelve la instancia de una clase.
  - @Primary.
  - Métodos: init-method
@ComponentScan = escanea el paquete en busca de beans.
@Value. Permite inyectar valores de tipo primitivo. Usos:
  - Uso de fichero de propiedades.
  - Variables de entorno.
  - Valores por defecto.