# 💱 Conversor de Monedas

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gson](https://img.shields.io/badge/Gson-2.10-brightgreen?style=for-the-badge)
![ExchangeRate API](https://img.shields.io/badge/API-ExchangeRate-blue?style=for-the-badge)

## 📋 Descripción

Conversor de Monedas es una aplicación de consola desarrollada en Java como parte del challenge de **Alura Latam**. Permite convertir diferentes monedas latinoamericanas utilizando tasas de cambio en tiempo real proporcionadas por la API de [ExchangeRate-API](https://app.exchangerate-api.com/).

Este proyecto implementa conceptos fundamentales de Java como:
- ✅ Consumo de APIs REST
- ✅ Deserialización JSON con Gson
- ✅ Manejo de excepciones
- ✅ Records de Java (API moderna)
- ✅ HttpClient (Java 11+)

## 🎯 Características

- 🔄 Conversión de monedas en tiempo real
- 🌎 Soporte para múltiples monedas latinoamericanas:
  - 🇺🇸 Dólar estadounidense (USD)
  - 🇦🇷 Peso argentino (ARS)
  - 🇧🇷 Real brasileño (BRL)
  - 🇵🇪 Sol peruano (PEN)
- 💰 Tasas de cambio actualizadas
- ⚡ Interfaz de consola intuitiva y fácil de usar
- 🛡️ Validación de datos de entrada
- 🔍 Manejo robusto de errores

## 🚀 Tecnologías Utilizadas

- **Java 17+** - Lenguaje de programación
- **Gson** - Biblioteca para deserialización JSON
- **HttpClient** - Cliente HTTP nativo de Java
- **ExchangeRate-API** - API para tasas de cambio

## 📦 Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener instalado:

- Java JDK 17 o superior
- Biblioteca Gson (incluida en el proyecto)
- Conexión a Internet (para consultar la API)

## 🔧 Instalación

1. **Clonar el repositorio**
```bash
git clone https://github.com/luisflorez20/conversor-monedas-App.git
cd conversor-monedas-App
```

2. **Descargar la biblioteca Gson**

Descarga Gson desde [Maven Central](https://search.maven.org/artifact/com.google.code.gson/gson) o utiliza Maven/Gradle.

Para proyectos con Maven, agrega esta dependencia:
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

3. **Compilar el proyecto**
```bash
javac -cp .:gson-2.10.1.jar src/*.java -d out
```

4. **Ejecutar la aplicación**
```bash
java -cp out:gson-2.10.1.jar ConversorMonedas
```

## 💻 Uso

Al ejecutar la aplicación, verás el siguiente menú:

```
**********************************************************************
Sea bienvenido/a al Conversor de Monedas =]

1) Dólar >>> Peso argentino
2) Peso argentino >>> Dólar
3) Dólar >>> Real brasileño
4) Real brasileño >>> Dólar
5) Dólar >>> Sol Peruano
6) Sol Peruano >>> Dólar
7) Salir
Elija una opción válida:
**********************************************************************
```

### Ejemplo de uso:

1. Selecciona una opción (1-7)
2. Ingresa la cantidad que deseas convertir
3. El sistema mostrará el resultado con la tasa de cambio actual
4. Puedes realizar otra conversión o salir del programa

**Ejemplo:**
```
Elija una opción válida: 1
Ingrese el valor que desea convertir de USD a ARS: 100
El valor 100.00 [USD] corresponde al valor final de >>> 95850.00 [ARS]
```

## 📸 Captura de Pantalla

<img width="681" height="372" alt="Conversor de Monedas en acción" src="https://github.com/user-attachments/assets/a129153c-c045-4f0b-a992-8f0c3b7c7a8e" />

## 🏗️ Estructura del Proyecto

```
conversor-monedas-App/
│
├── src/
│   ├── ConversorMonedas.java    # Clase principal con lógica del conversor
│   └── ApiResponse.java          # Records para respuesta API y conversión
│
├── .gitignore                    # Archivos ignorados por Git
├── conversorMonedasApp.iml       # Archivo de configuración IntelliJ
└── README.md                      # Este archivo
```

## 🔑 API Key

El proyecto utiliza una API key pública de ExchangeRate-API. Para uso en producción o tasas más altas de solicitudes, considera registrarte en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tu propia key.

**Ubicación de la API key:** `ConversorMonedas.java`, línea 12

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si estás aprendiendo Java como yo, puedes:

1. Hacer fork del proyecto
2. Crear una rama para tu feature (`git checkout -b feature/nuevaCaracteristica`)
3. Commit tus cambios (`git commit -m 'Agrega nueva característica'`)
4. Push a la rama (`git push origin feature/nuevaCaracteristica`)
5. Abrir un Pull Request

## 📝 Aprendizajes

Este proyecto fue desarrollado como parte del programa **Oracle Next Education (ONE)** de Alura Latam. Durante su desarrollo, aprendí:

- Consumo de APIs REST con HttpClient
- Deserialización de JSON con Gson
- Uso de Records en Java (feature moderna)
- Manejo de excepciones y validaciones
- Arquitectura de aplicaciones de consola

## 👨‍💻 Autor

**Luis Flores**

- GitHub: [@luisflorez20](https://github.com/luisflorez20)

---

## 📄 Licencia

Este proyecto es de código abierto y está disponible para fines educativos. Siéntete libre de usarlo, modificarlo y aprender de él.

---

## 🎓 Agradecimientos

- **Alura Latam** por el desafío y el programa educativo
- **Oracle Next Education (ONE)** por la oportunidad de aprendizaje
- **ExchangeRate-API** por proporcionar la API gratuitamente

---

⭐ Si este proyecto te ayudó a aprender, no olvides darle una estrella!

