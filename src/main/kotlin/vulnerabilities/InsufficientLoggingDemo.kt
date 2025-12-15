package vulnerabilities

object InsufficientLoggingDemo {
    fun demonstrate() {
        println("Demonstrating Insufficient Logging Vulnerability...")

        // Simulated insecure logging of sensitive information
        val sensitiveData = "UserSessionToken12345"
        println("[DEBUG] Sensitive Data: $sensitiveData") // Bad practice
    }
}