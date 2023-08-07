package mu

import io.github.oshai.kotlinlogging.KotlinLogging
fun main() {
    Example().bar()
}

private val logger = KotlinLogging.logger {}

class Example {
    fun bar() {
        val world = "world"
        logger.info { "hello $world" }
    }
}
