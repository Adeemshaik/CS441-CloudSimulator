package com.ADCS441.cloudsim.Simulations

import com.typesafe.scalalogging.LazyLogging
import org.cloudsimplus.util.Log


object simulator extends LazyLogging{
  Log.setLevel(ch.qos.logback.classic.Level.INFO);

  def main(args: Array[String]): Unit = {
    println("")
    println("")

    printf(" 1  --> Simulation example     %n" +
           " 2  --> PaaS Simulation         %n" +
           " 3  --> SaaS Simulation         %n")

    println("")
    println("Choose a simulation ")
    val a = scala.io.StdIn.readInt()
    a match {
      case 1 => Simulation_1


      case 2 => new PaasSimulation
      case 3 => new SaasSimulation
      //case 4 => new IaasSimulation

    }

  }
}
