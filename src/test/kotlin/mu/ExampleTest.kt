package mu

import org.junit.Test

private val logger = KotlinLogging.logger {}

class ExampleTest {

    @Test
    fun bar() {
        logger.info { "hi this is a test" }
    }
}