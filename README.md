# Arquitecturas de Software (ARSW)

## # Arquitecturas de Software (ARSW) - Parcial #1

## Mercado de valores de las acciones en bolsa.

#### Nicolás Toro

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-Build-brightgreen.svg)](https://maven.apache.org/)

---

Se mostró como implementar un controlador REST (APIController) para exponer los servicios de la aplicación.
Además, se implementaron algunos endpoints y se hicieron pruebas.

---

### Ejecutar el Proyecto

A continuación, se describen los pasos para ejecutar ambos proyectos en cualquier sistema operativo compatible con Java y Maven.

#### 1. Requisitos previos

- **Java 17** o superior instalado y configurado en el `PATH`.
- **Apache Maven** instalado y configurado en el `PATH`.
- (Opcional) Un IDE como IntelliJ IDEA, Eclipse o VS Code para facilitar la edición y ejecución.

Verifica las versiones instaladas ejecutando en la terminal:

```bash
java -version
mvn -version
```

#### 2. Clonar el repositorio

Si aún no tiene el repositorio localmente, clónelo con:

```bash
git clone https://github.com/NicoToro25/ARSW-Laboratorio-4-Componentes-Conectores-II.git
```

#### 3. Compilar los proyectos

Ejecutar el siguiente código

```bash
mvn clean package
```

#### 4. Ejecutar los proyectos

Ejecutar el siguiente código:

```bash
mvn exec:java@
```

> **Nota:** Si su IDE lo permite, también puede ejecutar directamente las clases principales desde la interfaz gráfica del IDE.

Si se tiene algún inconveniente con la ejecución, asegúrarse de que las variables de entorno de Java y Maven estén correctamente configuradas y de estar ubicado en la carpeta correspondiente antes de ejecutar los comandos.

---

En este repositorio se busca crear una aplicación que, con ayuda de API keys, se vincule a una plataforma externa que 
nos brinde información sobre el mercado de valores de las acciones negociadas en bolsa.

Para ver más información.

## Creación del proyecto

Para la creación del proyecto se implementó Springboot con Maven y se vinculó al repositorio.

# Lógica del negocio

## Implementación de Service

Se agregaron los paquetes de Service, donde se movía como tal la lógica del negocia donde se implementó principalmente getters y setters.

## Implementación de Model

Se agregaron las clases necesarias para el paso de información, dentro de esto se encuentra una clase valores donde 
se almacena la inforación.

## Implementación de persistencia

Se agregó una interfaz de persistencia que contiene persistencia local, donde se implementó el uso de clientes concurrentes.
Además, se usó inyección de dependencias para cumplir con los requisitos de escalabilidad.

## Implementación de Controller

Se agregaron los controladores, que permite vincular el software a la API key dada.
