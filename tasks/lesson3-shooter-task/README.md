# Lesson 3: Intro to Subsystems (Shooter Task)

In this task, you'll build a basic motor subsystem using the SubsystemIO pattern for a Shooter mechanism.
You'll get hands-on practice with subsystem organization, hardware abstraction, and basic motor control.

## Your Mission

Templates for these files have been created for you in `src/main/java/frc/robot/subsystems`:

- `Shooter.java` (The main subsystem logic)
- `ShooterIO.java` (The interface for hardware/simulation)
- `ShooterIOTalonFX.java` (The real hardware implementation)
- `ShooterIOSim.java` (The simulation implementation)

### `ShooterIO` and `ShooterIOInputs`

In `ShooterIO.java`:

- This template defines the `ShooterIO` interface and the `ShooterIOInputs` class.
- **No TODOs here; this file is complete with the template.**

### `ShooterIOTalonFX`

In `ShooterIOTalonFX.java`:

- This template provides the basic `TalonFX` setup.
- Fill in the `// TODO:` sections to get the motor's velocity and set its output.
- 

### `ShooterIOSim`

In `ShooterIOSim.java`:

- This template provides the class structure.
- Fill in the `// TODO:` sections to simulate motor behavior
  - Track a simulated percentage 
  - Calculate RPM

### `Shooter`

In `Shooter.java`:

-   This template provides the basic `SubsystemBase` structure.
-   Fill in the `// TODO:` sections to:
    -   Add fields for `ShooterIO` and `ShooterIOInputs`.
    -   Create the constructor.
    -   Call `updateInputs` in `periodic()`.
    -   Add public methods (`spin`, `stop`, `getCurrentRPM`).

### 6. Integrate in `RobotContainer.java`

In `RobotContainer.java`:

-   Declare your `Shooter` subsystem.
-   Instantiate it, showing both options (comment out one):
    ```java
    // For real robot:
    // public final Shooter shooter = new Shooter(new ShooterIOTalonFX());
    // For simulation:
    public final Shooter shooter = new Shooter(new ShooterIOSim());
    ```
-   Optional: Bind a button to a command that uses your `shooter` (e.g., `new RunCommand(() -> shooter.spin(0.5), shooter)`). Remember to add necessary imports.

## Test Your Code

-   Start your robot in simulation.
-   If you created a test command, activate it (e.g., press the joystick button).
-   Observe that `getCurrentRPM()` reports a non-zero value when active, and zero when stopped (add a `System.out.println` in `Shooter.java`'s `periodic()` for easy debugging).

## Why This Matters

- You're mastering the SubsystemIO pattern for clean code and testability.
- You're practicing hardware abstraction for flexible development.
- You're learning basic motor control in a structured way.
- You're enabling simulation-driven development for faster iteration.

## Wrap-Up

Once your code is working:

1. Create a branch (e.g., `username/complete-shooter-subsystem`).
2. Commit your changes with a clear message (e.g., `"Implement basic Shooter subsystem with IO pattern"`).
3. Push the branch to GitHub.
4. Ask a training lead or student to review your code.
5. Respond to any code review comments and make changes.
6. You're done when a training lead approves your solution!