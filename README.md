# 🧠 Talleres de Inversión de Control (IoC) en Spring

## 📘 Introducción

El **contenedor de inversión de control (IoC)** de **Spring Framework** es el núcleo que gestiona los objetos (*beans*) de una aplicación, controlando su **creación**, **ciclo de vida**, **inyección de dependencias** y **visibilidad** dentro del contexto de la aplicación.

Sin embargo, los *beans* no siempre se comportan como esperamos. En algunos casos, su interacción puede generar resultados **inesperados** si no comprendemos cómo opera internamente el contenedor.  
Estos talleres están diseñados para **poner a prueba tu capacidad de análisis, observación y resolución de comportamientos anómalos**, ayudándote a comprender la lógica real detrás del motor de Spring.

---

## 🎯 Objetivos de Aprendizaje

A través de los ejercicios y experimentos propuestos, aprenderás a:

- ✅ **Comprender** cómo se crean, gestionan y destruyen los *beans* en el contenedor IoC.  
- 🧩 **Diferenciar** los efectos de las anotaciones:
  - `@Component`
  - `@Service`
  - `@Repository`
  - `@Configuration`
  - `@Bean`
- 🔄 **Analizar** los efectos de los *scopes* (`singleton`, `prototype`, `request`, `session`).
- ⚙️ **Resolver conflictos** de inyección y dependencias circulares.
- 🧠 **Explicar comportamientos inesperados** como:
  - Lazy loading inefectivo
  - Duplicación de beans
  - Inyección ambigua
- 🧾 **Documentar hallazgos y soluciones** aplicando pensamiento crítico y razonamiento técnico.

---

## 🧩 Contenido del Repositorio

El repositorio está estructurado por módulos o talleres, cada uno enfocado en un aspecto específico del contenedor IoC.

