package mu


fun main(args : Array<String>) {
    Example().bar()
}

class Example {
    companion object: KLogging()
    fun bar() {
        val world = "world"
        logger.info { "hello $world" }
    }
}
