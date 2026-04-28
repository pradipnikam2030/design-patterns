# Strategy Design Pattern

## What is Strategy Pattern?

Strategy is a **behavioral design pattern** that allows you to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

In simple terms, instead of using multiple `if-else` or `switch` statements, you move each behavior into separate classes and choose the required behavior dynamically.

---

## Why Strategy Pattern?

Using conditional logic for multiple behaviors leads to:

- Complex and hard-to-maintain code
- Violation of Open/Closed Principle
- Tight coupling between classes
- Difficult to extend new behaviors

The Strategy pattern solves this by separating behaviors into independent classes.

---

## When to Use

Use Strategy Pattern when:

- You have multiple ways to perform a task
- You want to switch behavior at runtime
- You want to eliminate `if-else` or `switch` logic
- You want to follow Open/Closed Principle

---

## Real-Life Analogy

Think of navigation in a map application:

- You can choose different modes:
    - Car
    - Bike
    - Walking

The destination is the same, but the way to reach it differs. Each mode represents a different strategy.

---

## Structure

The Strategy Pattern typically consists of:

- **Strategy Interface**: Defines common behavior
- **Concrete Strategies**: Different implementations of the behavior
- **Context**: Uses a strategy and delegates work to it
- **Client**: Selects and provides the strategy

---

## Key Features

- Encapsulates algorithms in separate classes
- Allows dynamic behavior switching
- Promotes loose coupling
- Supports composition over inheritance

---

## How It Works

1. Client selects a strategy
2. Context is provided with the strategy
3. Context delegates the task to the selected strategy
4. Strategy executes the behavior

---

## Advantages

- Eliminates complex conditional logic
- Improves code readability
- Promotes loose coupling
- Easy to add new strategies
- Follows Open/Closed Principle

---

## Disadvantages

- Increases number of classes
- Client must be aware of available strategies
- Slight overhead of managing multiple objects

---

## Strategy vs Other Patterns

| Pattern   | Purpose                                   |
|-----------|-------------------------------------------|
| Strategy  | Switch behavior dynamically               |
| State     | Change behavior based on internal state   |
| Command   | Encapsulate a request                     |
| Factory   | Create objects                            |

---

## Common Interview Points

- Strategy replaces `if-else` logic with polymorphism
- Behavior can be changed at runtime
- Uses composition instead of inheritance
- Promotes flexibility and scalability

---

## Real-World Usage

- Payment processing systems
- Sorting algorithms
- Compression techniques
- Authentication mechanisms
- Frameworks like Spring using interface-based implementations

---

## How to Explain in Interview

Strategy pattern is used to define multiple algorithms and switch between them at runtime. It helps eliminate conditional logic and makes the system more flexible and maintainable by using composition.

---

## Summary

- Strategy is a **behavioral design pattern**
- Encapsulates a family of algorithms
- Allows runtime behavior change
- Removes complex conditional logic
- Improves flexibility and maintainability  