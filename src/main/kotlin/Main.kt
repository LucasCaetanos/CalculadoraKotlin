import kotlin.math.pow

fun main(args: Array<String>) {


    println("Bem vindo a sua calculadora, escolha a operação aritimetica que quer fazer para prosseguir:" +
            "\nDigite: 1 - soma, 2 - subtração, 3 - divisão, 4 - multiplicação, 5 - potência")
    var escolha = readLine()!!

    print("Insira o primeiro numero: ")
    var num1 = readLine()!!.toInt()

    print("Insira o segundo numero: ")
    var num2 = readLine()!!.toInt()

    when(escolha){
        "1" -> soma(num1,num2)
        "2" -> subtracao(num1,num2)
        "3" -> divisao(num1.toDouble(),num2.toDouble())
        "4" -> multiplicacao(num1,num2)
        "5" -> potencia(num1.toDouble(), num2.toDouble())
    }

}
fun soma(num1: Int, num2: Int) {
    var resultado = num1 + num2
    println("Soma do $num1 e do $num2 é igual a: $resultado")
}

fun subtracao(num1: Int, num2: Int){
    var resultado = num1 - num2
    println("A subtração do $num1 e do $num2 é igual a: $resultado")
}

fun divisao(num1: Double, num2: Double){
    var resultado = num1 / num2
    println("A divisão do $num1 e do $num2 é igual a: $resultado")
}

fun multiplicacao(num1: Int, num2: Int){
    var resultado = num1 * num2
    println("A multiplicação do $num1 e do $num2 é igual a: $resultado")
}

fun potencia(num1: Double, num2: Double){
    var resultado = num1.pow(num2)
    println("$num1 elevado a $num2 é igual a: $resultado")
}