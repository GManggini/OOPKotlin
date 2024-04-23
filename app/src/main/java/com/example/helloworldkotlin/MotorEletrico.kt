package com.example.helloworldkotlin

class MotorEletrico : Motor() {

    private var nivelBateria:Int = 1


    override fun gastando() {
        println("Gastando bateria, nivel atual eh ${nivelBateria}")
        nivelBateria--
    }

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }
}