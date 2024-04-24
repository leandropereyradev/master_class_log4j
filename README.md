# Log4J - Master Class

🚀 ¡Bienvenido a la Master Class de Log4J! 🚀

Esta master class tiene como objetivo proporcionarte una comprensión profunda de cómo utilizar Log4J para gestionar registros en tus aplicaciones Java, centrándose especialmente en la gestión de excepciones de una manera eficaz sin depender de simples declaraciones de `System.out.println()`.

## Contenido

- **Introducción a Log4J**: Aprenderás por qué es importante utilizar un sistema de registro como Log4J en tus aplicaciones Java y cómo puede mejorar el proceso de depuración y monitorización.

- **Instanciación del Logger**: Te enseñaremos cómo instanciar correctamente un Logger en tu código para capturar registros y cómo configurarlo según tus necesidades.

- **Tipos de registros**: Exploraremos los diferentes niveles de registro en Log4J, desde `DEBUG` hasta `FATAL`, y cómo utilizarlos adecuadamente en tu aplicación.

- **Gestión de Excepciones**: Veremos cómo manejar excepciones de manera efectiva utilizando Log4J, tanto las excepciones personalizadas como las excepciones generales que pueden escapar a nuestro control.

- **Configuración de Log4J**: Aprenderás a configurar Log4J para que guarde registros en la consola y en archivos, y cómo ajustar la configuración para registrar solo los eventos de ciertos niveles de importancia.

- **PatternLayout**: Exploraremos los diferentes tipos de patrones de diseño disponibles en Log4J para formatear tus registros de la manera que desees.

## Requisitos Previos

Se requiere un conocimiento mínimo de Java para seguir esta master class.

## Formato

La master class se presenta en formato de presentación de diapositivas, acompañada de explicaciones paso a paso escribiendo código en vivo.

## Recursos

- Las dependencias necesarias para Log4J se proporcionan en la diapositiva que se conecta con el repositorio de Maven.
- Además, puedes descargar el repositorio de ejemplos proporcionado para acceder a los ejemplos de código utilizados en la master class.

## Configuración

Para configurar Log4J en tu proyecto, asegúrate de incluir las siguientes dependencias en tu archivo `pom.xml`:

```xml
<dependencies>
    <!-- Log4J API -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-api</artifactId>
        <version>2.X</version>
    </dependency>
    <!-- Log4J Core -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.X</version>
    </dependency>
</dependencies>
