# Factory Design Pattern

## What is Factory Pattern?

Factory is a **creational design pattern** used to create objects **without exposing the object creation logic** to the client. Instead of directly using constructors, the client requests objects from a factory.

In simple terms, the Factory pattern provides a way to create objects by delegating the responsibility to a separate class.

---

## Why Factory Pattern?

Creating objects directly using constructors can lead to:

- Tight coupling between classes
- Difficulty in changing object creation logic
- Code duplication
- Reduced flexibility

The Factory pattern centralizes object creation and makes the code more flexible and maintainable.

---

## When to Use

Use Factory Pattern when:

- You don’t know beforehand the exact type of object to create
- Object creation logic is complex
- You want to **decouple object creation from usage**
- You need to follow **Open/Closed Principle** (open for extension, closed for modification)

---

## Real-Life Analogy

Think of a **restaurant**:

- You don’t cook the food yourself
- You place an order
- The kitchen (factory) prepares and gives you the dish

You only care about the result, not how it is created.

---

## Structure

The Factory Pattern typically consists of:

- **Product**: Interface or abstract class
- **Concrete Product**: Actual implementations
- **Factory Class**: Responsible for object creation
- **Client**: Uses factory to get objects

---

## Key Features

- Encapsulates object creation logic
- Promotes **loose coupling**
- Returns objects through a common interface
- Hides implementation details from client

---

## Advantages

- Reduces tight coupling between classes
- Centralizes object creation logic
- Improves code maintainability
- Makes code easier to extend
- Supports Open/Closed Principle

---

## Disadvantages

- Adds extra layer of abstraction
- Can increase number of classes
- Factory class may become complex if not designed properly

---

## Factory vs Other Patterns

| Pattern            | Purpose                                      |
|--------------------|----------------------------------------------|
| Factory Pattern    | Creates one object through a common interface |
| Abstract Factory   | Creates families of related objects          |
| Builder Pattern    | Builds complex objects step by step          |

---

## Common Interview Points

- Factory pattern hides object creation logic
- It promotes **loose coupling**
- Client depends on interface, not concrete classes
- Easy to replace or extend object creation logic

---

## Real-World Usage

- Used in frameworks like Spring (BeanFactory, ApplicationContext)
- Logging frameworks
- Database connection creation
- Parser and driver implementations

---

## How to Explain in Interview

Factory pattern is used to create objects without exposing the creation logic to the client. Instead of using constructors directly, the client uses a factory class to get the required object. This helps reduce coupling and improves flexibility.

---

## Summary

- Factory is a **creational design pattern**
- Hides object creation logic
- Promotes **loose coupling**
- Uses a common interface for object creation
- Improves maintainability and scalability  