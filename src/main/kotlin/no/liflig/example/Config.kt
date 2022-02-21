package no.liflig.example

import no.liflig.properties.loadProperties
import no.liflig.properties.stringNotEmpty

/**
 * Loads config using Liflig Properties
 *
 * @see <a href="https://github.com/capralifecycle/liflig-properties">Liflig Properties on Github</a>
 */
object Config {
  private val properties = loadProperties()

  val exampleProp = properties.stringNotEmpty("example.prop")
}
