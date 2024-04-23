package com.example.helloworldkotlin

class MotorCombustao : Motor() {

    private var nivelCombustivel:Int = 2

    override fun gastando() {
        println("Gastando gasosa, nivel atual eh ${nivelCombustivel}")
        nivelCombustivel--
    }

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }
}