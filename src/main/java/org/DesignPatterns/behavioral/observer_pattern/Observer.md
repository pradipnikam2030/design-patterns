# Observer Design Pattern

## What is Observer Pattern?

Observer is a **behavioral design pattern** where an object (called **Subject**) maintains a list of dependents (called **Observers**) and **notifies them automatically whenever its state changes**.

In simple terms, when one object changes, all dependent objects are automatically updated.

---

## Why Observer Pattern?

Without using Observer pattern:

- Tight coupling between objects
- Manual update handling
- Difficult to maintain and extend
- Changes in one object affect multiple classes

The Observer pattern solves this by introducing a **publish-subscribe mechanism**.

---

## When to Use

Use Observer Pattern when:

- One object’s change should affect multiple objects
- You need **event-driven systems**
- You want **loose coupling** between components
- You need a **publish-subscribe model**

---

## Real-Life Analogy

Think of a subscription system:

- Users subscribe to a channel
- When new content is published → all subscribers get notified

This is similar to how observers receive updates from a subject.

---

## Structure

The Observer Pattern consists of:

- **Subject (Publisher)**
    - Maintains list of observers
    - Notifies observers on state change

- **Observer (Subscriber)**
    - Defines update method

- **Concrete Subject**
    - Stores state
    - Triggers notifications

- **Concrete Observers**
    - Receive and handle updates

---

## Key Features

- One-to-many relationship between objects
- Automatic notification system
- Promotes loose coupling
- Supports dynamic subscription and unsubscription

---

## How It Works

1. Observers subscribe to the Subject
2. Subject state changes
3. Subject notifies all observers
4. Observers react to the update

---

## Advantages

- Decouples Subject and Observers
- Supports dynamic addition/removal of observers
- Improves flexibility and scalability
- Ideal for event-driven systems

---

## Disadvantages

- Can lead to excessive notifications
- Hard to debug in complex systems
- Risk of memory leaks if observers are not removed

---

## Observer vs Other Patterns

| Pattern          | Purpose                                |
|------------------|----------------------------------------|
| Observer         | One-to-many notification               |
| Strategy         | Change behavior dynamically            |
| Mediator         | Centralize communication               |
| Publish-Subscribe| Similar but uses message broker        |

---

## Common Interview Points

- Implements **one-to-many dependency**
- Enables **automatic updates**
- Promotes **loose coupling**
- Widely used in event-driven architecture

---

## Real-World Usage

- UI event listeners
- Notification systems
- Stock market updates
- Messaging systems
- Spring event handling

---

## How to Explain in Interview

Observer pattern defines a one-to-many relationship where multiple observers are notified automatically when the subject changes. It helps achieve loose coupling and is widely used in event-driven systems.

---

## Summary

- Observer is a **behavioral design pattern**
- Defines **one-to-many communication**
- Enables automatic updates
- Promotes loose coupling
- Used in event-driven architectures  