# Command Design Pattern

## What is Command Pattern?

Command is a **behavioral design pattern** that encapsulates a request as an object, allowing you to parameterize clients with different requests, queue them, log them, and support undo/redo operations.

In simple terms, it converts a request into an object so it can be stored, passed, and executed later.

---

## Why Command Pattern?

Without Command pattern:

- Tight coupling between sender and receiver
- Direct method calls reduce flexibility
- Difficult to implement undo/redo
- Hard to log or queue operations

The Command pattern solves this by separating request execution from request invocation.

---

## When to Use

Use Command Pattern when:

- You want to decouple sender and receiver
- You need to support undo/redo functionality
- You want to queue or log requests
- You want to treat operations as objects

---

## Real-Life Analogy

Think of a remote control:

- You press a button
- The remote sends a command
- The device performs the action

The remote does not know how the device works internally.

---

## Structure

The Command Pattern consists of:

- **Command Interface**
    - Declares execution method

- **Concrete Command**
    - Implements command
    - Calls receiver

- **Receiver**
    - Performs actual business logic

- **Invoker**
    - Triggers command execution

- **Client**
    - Creates and assigns commands

---

## Key Features

- Encapsulates request as an object
- Decouples sender and receiver
- Supports undo/redo operations
- Enables logging and queuing

---

## How It Works

1. Client creates command object
2. Command is assigned to invoker
3. Invoker calls execute method
4. Command delegates work to receiver

---

## Advantages

- Promotes loose coupling
- Easy to extend new commands
- Supports undo/redo functionality
- Enables request logging and queuing
- Follows Open/Closed Principle

---

## Disadvantages

- Increases number of classes
- Adds complexity for simple use cases

---

## Command vs Other Patterns

| Pattern   | Purpose                         |
|-----------|---------------------------------|
| Command   | Encapsulate request as object   |
| Strategy  | Change algorithm dynamically    |
| Observer  | Notify multiple objects         |
| Mediator  | Centralize communication        |

---

## Common Interview Points

- Command decouples invoker and receiver
- Treats requests as objects
- Supports undo/redo and queuing
- Widely used in UI and task systems

---

## Real-World Usage

- GUI button actions
- Task scheduling systems
- Job queues
- Transaction management
- Frameworks like Spring for async tasks

---

## Advanced Concepts

### Undo/Redo
- Store previous state
- Reverse command execution

### Command Queue
- Store commands in queue
- Execute later (asynchronously)

### Macro Command
- Combine multiple commands into one

---

## How to Explain in Interview

Command pattern encapsulates a request as an object, allowing it to be passed, queued, logged, and executed later. It decouples the sender from the receiver and is useful in implementing undo/redo and task execution systems.

---

## Summary

- Command is a **behavioral design pattern**
- Encapsulates request as object
- Decouples sender and receiver
- Supports undo/redo and queuing
- Used in UI, task processing, and event systems  