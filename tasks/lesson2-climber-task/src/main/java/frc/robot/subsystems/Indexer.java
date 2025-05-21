// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {
  // TODO: Add indexing state variable here

  /** Creates a new Indexer subsystem. */
  public Indexer() {
    // TODO: Initialize state if needed
  }

  /** Starts the indexing process. */
  public void startIndexing() {
    // TODO: Set indexing state to true
  }

  /** Stops the indexing process. */
  public void stopIndexing() {
    // TODO: Set indexing state to false
  }

  /**
   * Returns whether the indexer is currently running.
   *
   * @return true if indexing, false otherwise
   */
  public boolean isIndexing() {
    // TODO: Return indexing state
    return false;
  }

  // TODO: Implement indexForSeconds() command factory

  // TODO: Implement printStatusCommand() command factory

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
