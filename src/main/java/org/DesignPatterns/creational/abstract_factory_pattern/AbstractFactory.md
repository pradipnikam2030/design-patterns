# Abstract Factory Design Pattern

## What is Abstract Factory Pattern?

Abstract Factory is a **creational design pattern** that provides an interface to create **families of related or dependent objects** without specifying their concrete classes.

In simple terms, instead of creating objects directly, you use a factory that creates **multiple related objects together**, ensuring consistency.

---

## Why Abstract Factory Pattern?

Direct object creation can lead to:

- Tight coupling between classes
- Inconsistent object combinations
- Difficulty in switching between object families
- Scattered object creation logic

Abstract Factory solves this by grouping related object creation into a single factory.

---

## When to Use

Use Abstract Factory Pattern when:

- You need to create **families of related objects**
- You want to ensure **consistency between objects**
- You want to **decouple client from concrete classes**
- You need to switch between multiple product families easily

---

## Real-Life Analogy

Think of a **UI Theme system**:

- Dark Theme → Dark Button, Dark Checkbox
- Light Theme → Light Button, Light Checkbox

You should not mix:
- Dark Button with Light Checkbox

A factory ensures that only matching components are created together.

---

## Structure

The Abstract Factory Pattern typically consists of:

- **Abstract Factory**: Interface for creating related objects
- **Concrete Factories**: Implementations that create specific families
- **Abstract Products**: Interfaces for product types
- **Concrete Products**: Actual implementations of products
- **Client**: Uses the factory to create objects

---

## Key Features

- Creates **families of related objects**
- Ensures **consistency between products**
- Promotes **loose coupling**
- Hides object creation logic
- Uses interfaces instead of concrete classes

---

## Advantages

- Ensures compatibility between related objects
- Promotes loose coupling
- Centralizes object creation logic
- Easy to switch between product families
- Supports Open/Closed Principle

---

## Disadvantages

- Increases complexity
- Requires more classes and interfaces
- Difficult to add new product types (requires changes in all factories)

---

## Abstract Factory vs Other Patterns

| Pattern            | Purpose                                      |
|--------------------|----------------------------------------------|
| Factory Pattern    | Creates a single object                      |
| Abstract Factory   | Creates families of related objects          |
| Builder Pattern    | Builds complex objects step by step          |
| Singleton          | Ensures only one instance exists             |

---

## Common Interview Points

- Abstract Factory creates **multiple related objects**
- Ensures **product consistency**
- Client works with **interfaces, not concrete classes**
- Helps in switching between product families easily

---

## Real-World Usage

- UI frameworks (themes, widgets)
- Cross-platform applications
- Dependency Injection frameworks (e.g., Spring)
- Database driver families

---

## How to Explain in Interview

Abstract Factory pattern is used to create families of related objects without exposing their concrete implementations. It ensures that related objects are used together and maintains consistency. It also helps in reducing coupling and makes switching between different families easier.

---

## Summary

- Abstract Factory is a **creational design pattern**
- Creates **families of related objects**
- Ensures **consistency and compatibility**
- Promotes **loose coupling**
- Useful when working with multiple related object types  