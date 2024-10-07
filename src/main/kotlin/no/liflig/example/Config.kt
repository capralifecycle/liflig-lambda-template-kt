package no.liflig.example

import java.time.Instant
import java.util.Properties
import no.liflig.properties.intRequired
import no.liflig.properties.loadProperties
import no.liflig.properties.stringNotNull

/**
 * Holds configuration of the lambda.
 *
 * @see [Config.load]
 */
data class Config(
    private val properties: Properties,
    val buildInfo: BuildInfo = BuildInfo.from(properties),
) {
  companion object {
    /**
     * Creates a new instance based on `application.properties` and AWS Parameter Store (if
     * available).
     */
    fun load() = Config(loadProperties())
  }
}

data class BuildInfo(
    val timestamp: Instant,
    /** Git commit sha. */
    val commit: String,
    /** Git branch. */
    val branch: String,
    /** CI build number. */
    val number: Int,
) {
  companion object {
    /** Create [BuildInfo] based on keys in `application.properties`. */
    fun from(properties: Properties) =
        BuildInfo(
            timestamp = Instant.parse(properties.stringNotNull("build.timestamp")),
            commit = properties.stringNotNull("build.commit"),
            branch = properties.stringNotNull("build.branch"),
            number =
                try {
                  properties.intRequired("build.number")
                } catch (ex: IllegalArgumentException) {
                  0
                },
        )
  }
}
