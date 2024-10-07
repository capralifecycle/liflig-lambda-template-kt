package no.liflig.example

import com.amazonaws.services.lambda.runtime.events.SQSEvent
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class LambdaHandlerTest {
  @Test
  fun `finds handler function at path used in infra`() {
    assertDoesNotThrow {
      // Our infra repo references our lambda handler by its full package name.
      // We use reflection here to verify that we find our handler at that path, and that it has a
      // constructor with no parameters (as expected by AWS Lambda).
      val handler = Class.forName("no.liflig.example.LambdaHandler")
      handler.getMethod("handle", SQSEvent::class.java)
      handler.getConstructor() // Empty constructor
    }
  }

  @Test
  fun `successfully invokes handler`() {
    assertDoesNotThrow { LambdaHandler().handle(buildSqsEvent("test")) }
  }

  private fun buildSqsEvent(messageBody: String): SQSEvent {
    return SQSEvent().apply {
      records =
          listOf(
              SQSEvent.SQSMessage().apply { body = messageBody },
          )
    }
  }
}
