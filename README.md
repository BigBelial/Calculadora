# 🧮 Calculadora Java

Una calculadora básica desarrollada en Java con interfaz gráfica utilizando Java Swing. Este proyecto fue realizado como práctica universitaria para aprender conceptos de programación orientada a objetos e interfaces gráficas.

## 📋 Características

- **Operaciones básicas**: Suma, resta, multiplicación y división
- **Interfaz gráfica intuitiva** con botones numéricos y de operación
- **Validación de punto decimal** para números decimales
- **Función de borrar** carácter por carácter
- **Ventana modal** para entrada de datos adicional

## 🛠️ Tecnologías Utilizadas

- **Java 19**
- **Java Swing** para la interfaz gráfica
- **Maven** para la gestión del proyecto
- **NetBeans** como IDE de desarrollo

## 🚀 Cómo Ejecutar

### Prerrequisitos
- Java JDK 19 o superior
- Maven (opcional)

### Ejecución
1. Clona el repositorio:
   ```bash
   git clone https://github.com/BigBelial/Calculadora.git
   cd Calculadora
   ```

2. Compila y ejecuta con Maven:
   ```bash
   mvn compile exec:java
   ```

3. O ejecuta directamente el archivo Java:
   ```bash
   javac src/main/java/com/mycompany/calculadora/Calculadora.java
   java com.mycompany.calculadora.Calculadora
   ```

## 📁 Estructura del Proyecto

```
Calculadora/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── calculadora/
│                       ├── Calculadora.java    # Clase principal
│                       └── Ventana.java        # Ventana modal
└── target/
```

## 🎯 Funcionalidades

- **Entrada numérica**: Botones del 0 al 9
- **Operaciones**: `+`, `-`, `*`, `/`
- **Punto decimal**: Validación para evitar múltiples puntos
- **Borrar**: Elimina el último carácter ingresado
- **Resultado**: Botón `=` para mostrar el resultado de la operación

## 🎓 Contexto Académico

Este proyecto fue desarrollado como parte de una práctica universitaria para:
- Aprender fundamentos de Java Swing
- Implementar eventos y listeners
- Practicar programación orientada a objetos
- Crear interfaces gráficas de usuario básicas

## 👨‍💻 Autor

**Juan José Ospina Sánchez**  
Ingeniero de sistemas
📍 Colombia

## 📝 Nota

Este es un proyecto educativo desarrollado con fines de aprendizaje. El código puede contener áreas de mejora y es parte del proceso de aprendizaje en programación Java.
