# 📝 To-Do List - Low Level Design (LLD)

A low-level design (LLD) of a To-Do List application built with Java, showcasing object-oriented principles and clean architecture. This design focuses on modeling real-world requirements using classes, relationships, and responsibilities.

---

## 🚀 Features

- Create, update, delete, and view tasks
- Tasks support multiple subtasks
- Mark tasks and subtasks as complete/incomplete
- Track progress percentage based on completed subtasks
- Filter tasks by status (pending/completed)
- Set due dates and priorities
- Support for user-specific task lists

---

## 🧱 Project Structure

```text
📁 src
├── 📦 model
│   ├── User.java
│   ├── Task.java
│   └── SubTask.java
├── 📦 enums
│   ├── Status.java
│   └── Priority.java
├── 📦 controller
│   └── TaskController.java (for Spring Boot REST API)
└── Main.java
