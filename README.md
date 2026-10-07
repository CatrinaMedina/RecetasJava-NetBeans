# 🍲 RecetasJava-NetBeans

Aplicación de escritorio en **Java** para administrar un recetario. Permite **ingresar, mostrar, buscar, modificar y eliminar recetas**, guardándolas en una base de datos **MySQL**.

Proyecto académico desarrollado en **NetBeans**, con interfaz gráfica **Java Swing** y arquitectura **MVC**.

---

## ✨ Funcionalidades

- ➕ **Ingresar** una receta: nombre, ingredientes, tipo de receta, porciones y tiempo de preparación (en minutos).
- 📋 **Mostrar** todas las recetas guardadas.
- 🔍 **Buscar** una receta por su nombre.
- ✏️ **Modificar** los datos de una receta existente.
- 🗑️ **Eliminar** una receta.
- ⏱️ Cálculo del **tiempo por porción** y comparación del tiempo entre dos preparaciones.

---

## 🧱 Arquitectura (MVC)

```
RecetasJava-NetBeans/
├── baserecetas.sql              # Script con la tabla baserecetas (estructura)
├── build.xml / nbproject/       # Configuración del proyecto NetBeans
└── src/
    ├── modelo/                  # Clases de datos
    │   ├── Recetas.java
    │   └── Preparacion.java
    ├── controlador/             # Acceso a la base de datos
    │   ├── Conexion.java
    │   └── RecetasDAO.java      # CRUD con PreparedStatement
    └── vista/                   # Ventanas Swing
        ├── RecetasCatrinaSofia.java   # Clase principal (main)
        ├── VentanaPrincipal.java
        ├── VentanaIngreso.java
        └── VentanaMostrar.java
tablapreparacion.sql             # Tabla usada por la app + datos de ejemplo
```

- **Modelo:** `Recetas` (nombre, ingredientes, tipo) contiene una `Preparacion` (porciones, tiempo e ID).
- **Controlador:** `RecetasDAO` implementa las operaciones sobre la base de datos con consultas parametrizadas (`PreparedStatement`).
- **Vista:** ventanas hechas con el diseñador visual de NetBeans (archivos `.form`).

---

## 🛠️ Requisitos

- **JDK** 8 o superior
- **NetBeans** (el proyecto fue creado con NetBeans 8.2)
- **MySQL o MariaDB** (por ejemplo, con **XAMPP**)
- **Driver MySQL (MySQL JDBC Driver)**, agregado como librería en NetBeans

---

## ▶️ Cómo ejecutarlo

### 1. Crear la base de datos
En phpMyAdmin o en la consola de MySQL:

```sql
CREATE DATABASE baserecetas;
```

Luego selecciona esa base e **importa el archivo `tablapreparacion.sql`**. Crea la tabla `tablapreparacion`, que es la que usa la aplicación, con un par de recetas de ejemplo.

### 2. Abrir el proyecto en NetBeans
1. Clona el repositorio:
   ```bash
   git clone https://github.com/CatrinaMedina/RecetasJava-NetBeans.git
   ```
2. En NetBeans: **File → Open Project** y elige la carpeta interna `RecetasJava-NetBeans`.
3. Si NetBeans marca un error de librería, haz clic derecho sobre el proyecto → **Properties → Libraries → Add Library…** y agrega **MySQL JDBC Driver**.

### 3. Revisar la conexión
La conexión está en `src/controlador/Conexion.java` y apunta a `localhost`, base de datos `baserecetas`, usuario `root` y contraseña vacía (configuración por defecto de XAMPP). Si tu MySQL usa otros datos, cámbialos ahí.

### 4. Ejecutar
Enciende MySQL (por ejemplo, desde XAMPP) y ejecuta la clase `RecetasCatrinaSofia.java` (**Run File** o `Shift + F6`). Se abrirá el **Menú principal**.

---

## 🧰 Tecnologías

**Java · Java Swing · JDBC · MySQL · NetBeans · Patrón MVC · DAO**

---

👩‍💻 Desarrollado por **Catrina Medina** · [@CatrinaMedina](https://github.com/CatrinaMedina)
