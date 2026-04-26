# Singleton Design Pattern

## What is Singleton Pattern?

Singleton is a **creational design pattern** that ensures a class has **only one instance** and provides a **global access point** to that instance.

In simple terms, no matter how many times you try to create an object, only one instance will exist throughout the application.

---

## Why Singleton Pattern?

Creating multiple objects of certain classes can lead to:

- Inconsistent state across the application
- Resource wastage (e.g., database connections, configurations)
- Difficulty in managing shared resources

The Singleton pattern ensures controlled access to a single shared instance.

---

## When to Use

Use Singleton Pattern when:

- Exactly **one instance is required**
- You need a **global access point**
- You are managing **shared resources** (e.g., configuration, logging, caching)
- Object creation is **expensive**

---

## Real-Life Analogy

Think of a **printer in an office**:

- Multiple people use it
- But there is only **one shared printer**

Everyone accesses the same instance instead of creating new ones.

---

## Structure

The Singleton Pattern typically consists of:

- **Private Constructor**: Prevents direct object creation
- **Static Instance Variable**: Holds the single instance
- **Public Static Method**: Provides global access to the instance

---

## Key Features

- Ensures **only one instance** exists
- Provides **global access point**
- Controls object creation
- Can be implemented using **lazy or eager initialization**

---

## Types of Singleton

### 1. Eager Initialization
- Instance is created at class loading time
- Simple but may waste memory if not used

### 2. Lazy Initialization
- Instance is created only when needed
- Saves memory but needs thread safety handling

### 3. Thread-Safe Singleton
- Ensures only one instance in multithreaded environments
- Uses synchronization or other techniques

### 4. Bill Pugh Singleton (Recommended)
- Uses inner static class
- Lazy, thread-safe, and efficient

### 5. Enum Singleton
- Simplest and safest way
- Prevents serialization and reflection issues

---

## Advantages

- Ensures single instance across application
- Saves memory and resources
- Provides controlled access to shared data
- Easy to implement

---

## Disadvantages

- Difficult to test (global state)
- Can lead to tight coupling
- Not suitable for all scenarios
- Thread safety can be tricky
- Violates Single Responsibility Principle (in some cases)

---

## Singleton vs Other Patterns

| Pattern            | Purpose                                      |
|--------------------|----------------------------------------------|
| Singleton          | Ensures only one instance exists             |
| Factory Pattern    | Creates objects without exposing logic       |
| Builder Pattern    | Builds complex objects step by step          |

---

## Common Interview Points

- Singleton restricts object creation to one instance
- Uses private constructor and static method
- Must handle **thread safety** in multithreaded applications
- Enum Singleton is the safest implementation

---

## Real-World Usage

- Logging frameworks
- Configuration classes
- Database connection managers
- Caching mechanisms
- Thread pools

---

## How to Explain in Interview

Singleton pattern ensures that only one instance of a class exists and provides a global access point to it. It is commonly used for shared resources like configuration or logging. Proper implementation must consider thread safety.

---

## Summary

- Singleton is a **creational design pattern**
- Ensures **single instance**
- Provides **global access**
- Used for **shared resources**
- Must handle **thread safety carefully**  