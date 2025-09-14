// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class Indexer extends SubsystemBase {
  public boolean indexing; // Index State Variable
  
  /** Creates a new Indexer subsystem. */
  public Indexer() {}

  /** Starts the indexing process. */
  public void startIndexing() {
    indexing = true; // Set indexing to True
  }

  /** Stops the indexing process. */
  public void stopIndexing() {
    indexing = false; // Set indexing to False
  }

  /**
   * Returns whether the indexer is currently running.
   *
   * @return true if indexing, false otherwise
   */
  public boolean isIndexing() {
    return indexing; // Return Value of Indexing
  }

  /**
   * Returns a command that start indexing, waits for seconds, then stops indexing.
   * 
   * @param seconds
   * @return Command Object
   */
  public Command indexForSeconds(double seconds) { 
    return Commands.runOnce(() -> startIndexing()) // Return Value of indexForSeconds
                   .andThen(Commands.waitSeconds(seconds))
                   .andThen(() -> stopIndexing());
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
