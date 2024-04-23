package com.example.helloworldkotlin

abstract class Motor {
    private var ligado:Boolean = false

    fun ligar(){
        println("Ligando Carro...")
        ligado = true
    }

    fun desligar(){
        println("Desligando Carro...")
        ligado = false
    }

    fun status():Boolean {
        return ligado
    }

    //essas abstracoes salvam vidas, economizado umas 50 linha de codigo, pois cada motor executava as mesmas acoes porem com parametros diferentes, assim em cada motor apenas implementamos a abstract fun (override) e deu
    abstract fun temAutonomia() : Boolean
    abstract fun gastando()
}