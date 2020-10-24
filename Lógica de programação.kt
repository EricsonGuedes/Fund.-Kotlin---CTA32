//Comentário de uma linha

/* Comentario 
   de multiplas
   linhas 
*/

fun main() {
    //Declarando variáveis
    //Variáveis Mutáveis = var
    var idade = 20
    
    //alterar o valor da variável mutável
    idade = 21
    println(idade)
    
    // Variáveis Imultáveis: val
    val tipoSanguineo = "A+"
    println(tipoSanguineo)
    
    //tentando alterar a variavel mútavel
    //tipoSanguineo = "A-" 
    //Não é possível
    
    //Saída de dados no console: println() e print()
    //println(idade)
    //print(tipoSanguineo)

        //Tipos de Dados
    //Inteiro: Byte, Short, Int e Long
    //Decimais: Float e Double
    //caractere: char
    //Booleano: fase e true (0 e 1)
    
    //Inferencia de tipo
    var idade1 = 21 // Inteiro -> Int
    var distancia = 154784125L //Inteiro -> Long
    var peso = 81.0 // Decimal -> Double
    var altura = 1.75f //Decimal -> Double
    var casado = false // Boolean
    
    //Declaração Explícita de tipo
    var quartos : Byte = 1
    var salario : Double = 2100.00
    var letra : Char = 'R'

    // String
    var nome = "Ericson"
    var cpf = "111.111.111-11"
    var letra2 = "R" // -> Sequência de caracteres
    var vazio = "" // String vazia
    
    //Concatenação de String
    var sobrenome = "Guedes"
    var nomeCompleto = nome + " " + sobrenome
    println(nomeCompleto)
    
    // Interpolação/Template String/ String Format
    var saudacao = "$nomeCompleto tem $idade anos, pesa $peso e fala inglês"
    println(saudacao)

      //Operadores aritméticos
  val a = 33
  val b = 25
  val c = 33.0
  val d = 25.0
   
  //soma
  val soma = a + b
  println(soma) // 58
  
  //subtracao
  val subtracao = a - b
  println(subtracao) // 8
  
  //multiplicacao
  val mult = a * b //825
  println(mult)
  
  //Divisão
  val div = c/d //1.32
  println(div)
  
  //Resto da divisão (módulo ou mod)
  val resto = c%d
  println(resto)

  //Declarando uma função
    val nome1 = "Ericson"

    dizOi()
    sauda(nome1)
    sauda("Erika")
    
    val valor = 33
    val dobro = dobrar(valor)
    println(dobro)
    
	val som = somar(1,2,3)
    println(som)




    //Operadores Relacionais
	val idadeEricson = 21
    val idadeRaul = 18
    val idadeNicholas = 16
 
// Igualdade: ==
	println(idadeRaul == 18) //true
    println(idadeEricson == 18) //false
    println(idadeNicholas == 18) //false
    println("\n")
    
 // Diferente: =!
 	println(idadeRaul != 18) //false
    println(idadeEricson != 18) //true
    println(idadeNicholas != 18) //true	
    println("\n")
 
 // Maior que: >
   	println(idadeRaul > 18) //false
    println(idadeEricson > 18) //true
    println(idadeNicholas > 18) //false
    println("\n")
    
 // Maior ou igual: >=  
    println(idadeRaul >= 18) //true
    println(idadeEricson >= 18) //true
    println(idadeNicholas >= 18) //false 
 	println("\n")
    
 // Menor: <
    println(idadeRaul < 18) //false
    println(idadeEricson < 18) //false
    println(idadeNicholas < 18) //true
    println("\n")
    
 // Menor ou igual: <=
  	println(idadeRaul <= 18) //true
    println(idadeEricson <= 18) //false
    println(idadeNicholas <= 18) //true
    println("\n")
    
    println("raul" <= "kaory")
    println("\n")

  // Operadores Lógicos:
  
  // Operadore E ou And: &&
  println(false && false) // false
  println(false && true) // false
  println(true && false) // false
  println(true && true) // true
  
    println("\n")

   // Operador OU ou OR: ||
  println(false || false) // false
  println(false || true) // true
  println(true || false) // true
  println(true || true) // true

	println("\n")
  
  // Operador Não ou NOT: !
  println(!false) // true
  println(!true) // false

// Estrutura de repetição: for

    for (n in 10 downTo 1){
        println(2*n)
    }
	 println("\n")   
    for (i in 1 until 20 step 2){
        println(i)
    }
	println("\n")

    for (n in 1..10){
        if(n%2 ==0){
            println(n)
        } else {
            println("kkkkkk")
        }
    }
	//Listas 
	//                        0         1         2           3
	val profs = arrayListOf("Raul", "kaory","Luiz Gustavo","David")

	//imprimir a lista
	println(profs) 

	//imprimir por elemento
	println(profs[0])

	//obtendo o tamanho da lista
	println(profs.size)

	//Exibir o ultimo elemento
	println(profs.size-1)

	//Adicionando um novo item na lista
	profs.add("Joshua")
	println(profs)

	//remover item da lista
	profs.removeAt(profs.size-1)
	println(profs)

	//Obtendo um item aleatóio da lista
	println(profs.random())

	//Interando sobre os itens da lista]
	for (professor in profs)
	println("Olá $professor, Tenho uma dúvida")

}

//Declarando funções
     fun dizOi(){
        println("Oi")
     }

     fun sauda(texto : String){
         println("Oi, $texto, tudo bem?")
 	}
     
     fun dobrar(valor : Int) : Double{
     	var dobro = valor *2
        var vezesDouble = dobro.toDouble()
    	return vezesDouble
	  }
     
     //Declarando função de múltiplos parâmetros
     fun somar (a : Int, b : Int, c : Int) : Int{
     var soma = a + b + c
	 return soma
}
