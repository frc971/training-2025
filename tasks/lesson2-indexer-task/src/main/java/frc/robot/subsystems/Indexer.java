// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;


public class Indexer extends SubsystemBase {
  // TODO: Add indexing state variable here
  boolean indexing = false;
  /** Creates a new Indexer subsystem. */
  public Indexer() {}

  /** Starts the indexing process. */
  public void startIndexing() {
    // TODO: Set indexing state to true
    indexing = true;
  }

  /** Stops the indexing process. */
  public void stopIndexing() {
    // TODO: Set indexing state to false
    indexing = false;
  }

  /**
   * Returns whether the indexer is currently running.
   *
   * @return true if indexing, false otherwise
   */
  public boolean isIndexing() {
    // TODO: Return indexing state
    return indexing;
  }

  // TODO: Implement indexForSeconds() command factory
  public Command indexForSeconds(double seconds) {
    return run(this::startIndexing)
      .withTimeout(seconds)
      .andThen(this::stopIndexing);
  }

  @Override
  public void periodic() {
    // This method will always be called once per scheduler run
    System.out.println("Indexer is " + (isIndexing() ? "running" : "idle"));
  }

  @Override
  public void simulationPeriodic() {
    // This method will always be called once per scheduler run during simulation
  }
}
