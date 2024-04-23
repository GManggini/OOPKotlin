package com.example.helloworldkotlin

fun main(){

    val motorCombustao = MotorCombustao()
    val beetle = Carro(motorCombustao)
    beetle.ligar()
    beetle.anda()
    beetle.anda()
    beetle.anda()
    beetle.anda()


    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
    tesla.anda()
    tesla.anda()

}
