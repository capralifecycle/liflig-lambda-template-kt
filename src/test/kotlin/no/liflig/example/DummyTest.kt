package no.liflig.example

import com.amazonaws.services.lambda.runtime.events.SQSEvent
import org.junit.jupiter.api.Test

/** A simple dummy test to make sure we have atleast one test so that SonarCloud can be set up */
class DummyTest {

  @Test
  fun dummyTest() {
    handler(SQSEvent())
  }
}
