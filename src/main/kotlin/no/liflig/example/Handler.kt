package no.liflig.example

import com.amazonaws.services.lambda.runtime.events.SQSEvent
import mu.KotlinLogging

private val log = KotlinLogging.logger { }

/**
 * Entrypoint for AWS Lambda.
 */
@Suppress("unused") // Called by AWS Lambda
fun handler(sqsEvent: SQSEvent) {
  log.info { "Hello ${Config.exampleProp}" }
}
