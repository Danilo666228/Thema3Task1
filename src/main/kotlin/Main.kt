import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()

    println("Игра 'Камень-Ножницы-Бумага'")

    while (true) {

        val computerChoice = random.nextInt(3) + 1

        // Запрос выбора игрока
        println("Ваш выбор:")
        println("1. Камень")
        println("2. Ножницы")
        println("3. Бумага")

        val playerChoice = scanner.nextInt()
        scanner.nextLine()

        println()

  
        println("Выбор компьютера:")
        when (computerChoice) {
            1 -> println("Камень")
            2 -> println("Ножницы")
            3 -> println("Бумага")
        }

        println()

      
        if (playerChoice == computerChoice) {
            println("Ничья! Игра переигрывается.")
        } else if ((playerChoice == 1 && computerChoice == 2) ||
            (playerChoice == 2 && computerChoice == 3) ||
            (playerChoice == 3 && computerChoice == 1)
        ) {
            println("Вы выиграли!")
        } else {
            println("Компьютер выиграл!")
        }

        println()

    }
}
