package main

import vulnerabilities.SQLInjectionDemo
import vulnerabilities.HardcodedSecretsDemo
import vulnerabilities.InsufficientLoggingDemo

fun main() {
    println("Starting application with known vulnerabilities...")

    // Simulate unsafe operations
    SQLInjectionDemo.demonstrate()
    HardcodedSecretsDemo.demonstrate()
    InsufficientLoggingDemo.demonstrate()
}