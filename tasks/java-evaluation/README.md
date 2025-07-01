# Virtual Elevator Control System - Java Evaluation Task

Passing this Java evaluation task is a prerequisite to joining 971 software or software training.

**For the purposes of this task, you may not use AI tools**

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

- Only tracks current floor
- Can only move one floor at a time (no skipping floors)
- Methods: `moveUp()`, `moveDown()`, `getCurrentFloor()`.

### `ElevatorController`

- Given a target floor, tells the elevator how to move
- Handles printing elevator status to terminal- **the output format shown below is required**
- Prevents elevator from going to an invalid floor

### `Main`

- The entry point
- Sets up and runs the program loop

## Required Output

```
Elevator instantiated at floor 1

Request floor: 3
Moving up... now at floor 2
Moving up... now at floor 3
Arrived at floor 3

Request floor: 8
Floor 8 is not a valid floor

Request floor: 1
Moving down... now at floor 2
Moving down... now at floor 1
Arrived at floor 1

Request floor: quit
```

## Testing Instructions

**Before submitting** your solution, you should test your code. 

First, download [EvaluationTest.java](https://raw.githubusercontent.com/frc971/training-2025/refs/heads/main/tasks/java-evaluation/EvaluationTest.java?token=GHSAT0AAAAAADGP5OAHS7XKDUCVQPBODVCW2DDODJQ) by following the link and using ctrl+s or cmd+s.

Then, move it to the same folder as your code. Compile and run `EvaluationTest` using the following commands in your terminal:

```sh
javac *.java && java EvaluationTest
```

**Important:** You are not allowed to modify the `EvaluationTest.java` file. All tests must pass with the provided test file.
