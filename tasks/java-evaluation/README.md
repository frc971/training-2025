# Virtual Elevator Control System - Java Evaluation Task

Passing this Java evaluation task is a prerequisite to joining 971 software or software training.

## Goal

Create a small Java program that simulates a simple elevator system using multiple classes.
This exercise will help you practice writing clean, structured code - similar to how FRC robot software is organized.

You’ll simulate a 5-floor elevator system (floors 1-5). The elevator can:

- Move up or down between floors
- Be "called" to a specific floor by reading from user input
- Print messages as it moves

## What Your Program Should Do

- Start with the elevator at floor 1
- Calling the elevator to a new floor (from 1-5)
- Step-by-step print each floor it passes
- Reject invalid floor numbers (outside 1-5)

## How to Structure Your Code

Break your code into three classes:

### `Elevator`

- Tracks current floor
- Can only move one floor at a time (no skipping floors)
- Methods: `moveUp()`, `moveDown()`, `getCurrentFloor()`, etc.

### `ElevatorController`

- Given a target floor, tells the elevator how to move
- Handles logic like "go to floor 2"
- Handles output

### `Main`

- The entry point
- Sets up and runs the program loop

## Example Output

```
Elevator is at floor 1.

Request floor: 3
Requested to go to floor 3.
Moving up... now at floor 2.
Moving up... now at floor 3.
Arrived at floor 3.

Request floor: 8
Requested to go to floor 8.
Floor 8 is not a valid floor.

Request floor: 1
Requested to go to floor 1.
Moving down... now at floor 2.
Moving down... now at floor 1.
Arrived at floor 1.

Request floor: quit
```
