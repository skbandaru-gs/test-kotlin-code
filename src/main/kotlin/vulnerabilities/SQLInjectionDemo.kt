package vulnerabilities

object SQLInjectionDemo {
    fun demonstrate() {
        println("Demonstrating SQL Injection Vulnerability...")

        // Simulated vulnerable SQL query (do not use in production)
        val userInput = "admin' OR '1'='1" // Attacker's input
        val query = "SELECT * FROM Users WHERE username = '$userInput'"

        println("Vulnerable Query: $query") // Bad practice
    }
}