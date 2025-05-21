# Lesson 2: Intro to WPILib Indexer Task

In this task, you'll define a configurable command for the `Indexer` subsystem.  
You'll get hands-on practice with command factories, method chaining, and parameterized command creation.

> Tip: An indexer, or transfer, is a mechanism that moves game pieces—like balls or cubes—from one part of the robot to another.

## Starter Setup

You've been given a WPILib template project that includes:

- A `Indexer` subsystem in `subsystems/Indexer.java` (partially complete)
- A `RobotContainer.java` with a controller instance (`joystick`) ready to use

## Your Mission

### 1. Add indexer state tracking

In `Indexer.java`:
- Add a boolean field `indexing`
- Create methods:
  - `public void startIndexing()`: set `indexing` to true
  - `public void stopIndexing()`: set `indexing` to false
  - `public boolean isIndexing()`: return `indexing`

> Note: The template already prints the indexer's status in `periodic()`.
> You’ll see messages like "Indexer is running" or "Indexer is idle" when you test.

### 2. Create a parameterized command factory

In `Indexer.java`, write a method `indexForSeconds(double seconds)`.

This should return a command that:
- Starts indexing
- Waits `seconds` seconds
- Stops indexing

> "Parameterized" just means the method takes in a parameter (`seconds`)

### 3. Hook it up in `RobotContainer.java`

- Bind `indexForSeconds(1.5)` to button 1 on the joystick

## 4. Run and test in simulation

- Start your robot in simulation
- Switch to teleoperated mode
- Press button 1 on the joystick
- You should see:
  - `"Indexer is running"` print for ~1.5 seconds
  - Then it returns to `"Indexer is idle"`

## Why This Matters

- You're writing **parameterized command factories**
- You're chaining behaviors using WPILib methods
- You're using **controller bindings**
- You're practicing **state tracking**

## Wrap-Up

Once your code works:

1. **Create a branch** following the proper branch naming conventions (e.g. `username/complete-lesson2-task`)
2. **Commit your changes** with a clear message (e.g. `"Complete indexer command task"`)
3. **Push the branch** to GitHub
4. **Ask a training lead or student** to review your code and give feedback
5. **Respond to code review comments** and make any necessary changes
6. **You're done** with this task when a training lead approves your solution
