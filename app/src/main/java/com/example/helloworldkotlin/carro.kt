package com.example.helloworldkotlin

class Carro constructor(
    private val motor:Motor
) {

    fun ligar(){
        motor.ligar()
    }

    fun desligar(){
        motor.desligar()
    }

    fun anda(){
        when{ //isso simplificou tudo que antes foi tentado por if else
            !motor.status() -> {
                println("Liga o carro primeiro neh!")
            }
            !motor.temAutonomia() -> {
                    when(motor){
                        is MotorEletrico -> println("Tem que carrega neh!")
                        is MotorCombustao -> println("Coloca combustivel neh!")
                    }
                    desligar()
                }
            else -> {
                motor.gastando()
                when(motor){
                    is MotorEletrico -> println("Carro Andando")
                    is MotorCombustao -> println("Carro Andando: vrum vrummm!")
                }
            }
        }
    }
}