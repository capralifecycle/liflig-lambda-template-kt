package no.liflig.example

import no.liflig.properties.intRequired
import no.liflig.properties.loadProperties
import no.liflig.properties.stringNotEmpty
import no.liflig.properties.stringNotNull

/**
 * Loads config using Liflig Properties
 *
 * @see <a href="https://github.com/capralifecycle/liflig-properties">Liflig Properties on Github</a>
 */
object Config {
  private val properties = loadProperties()

  val build = Build(
    timestamp = properties.stringNotNull("build.timestamp"),
    commit = properties.stringNotNull("build.commit"),
    branch = properties.stringNotNull("build.branch"),
    buildNumber = properties.intRequired("build.number"),
  )

  val exampleProp = properties.stringNotEmpty("example.prop")
}

data class Build(
  val timestamp: String,
  val commit: String,
  val branch: String,
  val buildNumber: Int,
)
