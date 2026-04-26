# Builder Design Pattern

## What is Builder Pattern?

Builder is a **creational design pattern** used to construct **complex objects step by step**. It allows the same construction process to create different representations of an object.

In simple terms, instead of creating an object in a single step using a large constructor, the Builder pattern helps build the object gradually in a more readable and controlled way.

---

## Why Builder Pattern?

When an object has many fields (especially optional ones), using constructors becomes problematic:

- Hard to read and understand
- Confusion due to parameter order
- Too many constructors (constructor overloading problem)
- Difficult to maintain and extend

The Builder pattern solves these problems by providing a clear and flexible way to create objects.

---

## When to Use

Use Builder Pattern when:

- An object has **many optional parameters**
- Constructor becomes **too large or complex**
- You want to create **immutable objects**
- You need **readable and maintainable object creation**

---

## Real-Life Analogy

Think of ordering a burger:

You can customize:
- Bread
- Cheese
- Sauce
- Veg/Non-veg options

The process is the same, but the final product differs based on your choices. This is similar to how Builder constructs objects step by step.

---

## Structure

The Builder Pattern typically consists of:

- **Product**: The complex object being created
- **Builder**: Interface or class responsible for building the object
- **Concrete Builder**: Implements the building steps
- **Director (optional)**: Controls the construction process

---

## Key Features

- **Step-by-step object creation**
- **Method chaining** for better readability
- Supports **immutability**
- Separates construction logic from representation

---

## Advantages

- Improves code readability
- Handles optional parameters effectively
- Avoids constructor overloading (telescoping constructor problem)
- Supports creation of immutable objects
- Easy to extend and maintain

---

## Disadvantages

- Increases code complexity
- Requires additional classes
- Not suitable for simple objects

---

## Builder vs Other Patterns

| Pattern            | Purpose                                   |
|--------------------|-------------------------------------------|
| Factory Pattern    | Creates object in a single step           |
| Abstract Factory   | Creates families of related objects       |
| Builder Pattern    | Builds complex objects step by step       |

---

## Common Interview Points

- Builder pattern helps avoid the **telescoping constructor problem**
- It is commonly used to create **immutable objects**
- Improves **code readability and maintainability**
- Often used in modern APIs and libraries

---

## Real-World Usage

- Used in libraries like Lombok (`@Builder`)
- Common in API design (e.g., HTTP request builders)
- Widely used in enterprise applications for DTO creation

---

## How to Explain in Interview

Builder pattern is used to construct complex objects step by step. It is especially useful when an object has multiple optional fields. Instead of using large constructors, we use a builder to create the object in a readable and maintainable way. It also helps in creating immutable objects.

---

## Summary

- Builder is a **creational design pattern**
- Used for **complex object creation**
- Provides **step-by-step construction**
- Improves **readability, flexibility, and maintainability**
- Helps in building **immutable objects**