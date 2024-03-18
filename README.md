Una clínica veterinaria cuenta con un sistema donde posee dos clases: Mascota y Dueño. Cada mascota puede tener asociado un solo un dueño como responsable.

Un analista funcional realizó el relevamiento de las necesidades del cliente y las características del sistema con el que cuenta actualmente y determina que las clases deben tener la siguiente estructura:

**Mascota** , con los atributos:
* id
* nombre
* especie
* raza.
* color

**Dueño**, con los atributos:
* id
* dni
* nombre
* apellido
* celular

La clínica quiere poder disponer de una aplicación web y de una aplicación móvil que puedan consultar al mismo backend.

1. Realizar CRUD/ABML de mascotas
2. Realizar CRUD/ABML de dueños
3. Obtener el listado de todas las mascotas de especie "perro" y raza "caniche"
4. Obtener un listado de los siguientes datos combinados de una mascota y su dueño (uso del patrón DTO)
  - nombre_mascota
  - especie
  - raza
  - nombre_duenio
  - apellido_duenio

