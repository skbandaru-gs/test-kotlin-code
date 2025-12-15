package vulnerabilities

object HardcodedSecretsDemo {
    fun demonstrate() {
        println("Demonstrating Hardcoded Secrets Vulnerability...")

        // Simulated hardcoded credentials (do not use in production)
        val username = "admin"
        val password = "password123" // Hardcoded sensitive data

        println("Hardcoded credentials used: Username=$username, Password=$password")
    }
}