# Iterator Design Pattern

## What is Iterator Pattern?

Iterator is a **behavioral design pattern** that provides a way to **access elements of a collection sequentially without exposing its internal structure**.

In simple terms, it allows you to traverse a collection without knowing how the data is stored internally.

---

## Why Iterator Pattern?

Without using Iterator:

- Client needs to know internal data structure
- Different traversal logic for different collections
- Tight coupling between client and collection
- Code becomes difficult to maintain

The Iterator pattern solves this by providing a **standard way to traverse collections**.

---

## When to Use

Use Iterator Pattern when:

- You need to traverse a collection
- You want to hide internal data structure
- You need a **uniform way of iteration**
- You want to support multiple traversal strategies

---

## Real-Life Analogy

Think of a TV remote:

- You press "Next" to move to the next channel
- You don’t know how channels are stored internally

The remote acts as an iterator, providing access without exposing implementation details.

---

## Structure

The Iterator Pattern consists of:

- **Iterator Interface**
    - Defines traversal methods like `hasNext()` and `next()`

- **Concrete Iterator**
    - Implements traversal logic

- **Aggregate (Collection Interface)**
    - Defines method to create iterator

- **Concrete Aggregate**
    - Stores data and returns iterator

---

## Key Features

- Provides sequential access to elements
- Hides internal structure of collection
- Supports multiple traversal methods
- Promotes loose coupling

---

## How It Works

1. Collection creates an iterator
2. Iterator maintains current position
3. Client uses iterator methods to traverse
4. Elements are accessed one by one

---

## Advantages

- Hides internal structure
- Provides a common traversal interface
- Promotes loose coupling
- Supports multiple iterators on same collection

---

## Disadvantages

- Adds additional classes
- Can be overkill for simple data structures

---

## Iterator vs Other Patterns

| Pattern   | Purpose                              |
|-----------|--------------------------------------|
| Iterator  | Traverse collection                  |
| Observer  | Notify multiple objects              |
| Strategy  | Change behavior dynamically          |
| Composite | Work with tree structures            |

---

## Common Interview Points

- Iterator provides **sequential access**
- It hides internal structure
- Used heavily in Java Collections Framework
- Supports multiple traversal strategies

---

## Real-World Usage

- Java Collections (`Iterator`, `ListIterator`)
- Stream API (conceptually)
- Database result traversal
- File system traversal

---

## How to Explain in Interview

Iterator pattern provides a way to traverse a collection without exposing its internal structure. It allows sequential access to elements and promotes loose coupling between client and collection.

---

## Summary

- Iterator is a **behavioral design pattern**
- Provides **sequential traversal**
- Hides internal structure
- Promotes loose coupling
- Widely used in Java collections  