# ¿Que es TDD (test Driven Development)?

Es un tipo de metodología ágil, se trata de confeccionar primero las pruebas y luego el desarrollo del código, para ello hay que pensar bien
en cuales son los resultados del código que estamos desarrollando
Trabajaremos a partir de las entradas y las salidas esperadas de nuestro sistema

Seguimos el siguiente esquema:

1. Definimos los objetivos de nuestra prueba y escribimos su posible implementación. Nuestras pruebas deben fallar al principio porque, claramente, todavía no hemos programado el código que les permita funcionar correctamente. 🤔
2. Programamos el código necesario para pasar las pruebas. 😎
3. Redefinimos los objetivos. Podemos añadir nuevos casos de uso y refactorizar nuestro código para mejorar la aplicación. 😏

De esta manera, primero escribimos las pruebas, y usándolas como plantilla escribimos e implementamos el código
Primero se identifican a propósito los casos de prueba que suelen fallar, y luego se redacta únicamente el código necesario para superar los test.
Luego se refactorizan los componentes: manteniendo las funciones, se amplía o se reestructura el código fuente, según sea necesario.

---

### Referencias:

- https://platzi.com/blog/que-es-y-como-funciona-tdd
- https://www.ionos.es/digitalguide/paginas-web/desarrollo-web/que-es-el-test-driven-development
