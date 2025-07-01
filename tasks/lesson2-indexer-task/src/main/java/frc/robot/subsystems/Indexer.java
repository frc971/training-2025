// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {
  private boolean indexing = false;

  /** Creates a new Indexer subsystem. */
  public Indexer() {}

  /** Starts the indexing process. */
  public void startIndexing() {
    indexing = true;
  }

  /** Stops the indexing process. */
  public void stopIndexing() {
    indexing = false;
  }

  /**
   * Returns whether the indexer is currently running.
   *
   * @return true if indexing, false otherwise
   */
  public boolean isIndexing() {
    return indexing;
  }

  /**
   * Returns a command that indexes for a given number of seconds.
   *
   * @param seconds duration to index
   * @return a command that runs the indexer for the given time
   */
  public Command indexForSeconds(double seconds) {
    return Commands.runOnce(this::startIndexing)
        .andThen(Commands.waitSeconds(seconds))
        .andThen(Commands.runOnce(this::stopIndexing));
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
