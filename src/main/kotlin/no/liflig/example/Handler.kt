package no.liflig.example

import com.amazonaws.services.lambda.runtime.events.SQSEvent
import mu.KotlinLogging
import net.logstash.logback.marker.Markers

private val log = KotlinLogging.logger {}

/** Entrypoint for AWS Lambda. */
@Suppress("unused") // Called by AWS Lambda
fun handler(sqsEvent: SQSEvent) {
  log.info(Markers.append("build", Config.build)) { "Hello ${Config.exampleProp}" }
}
