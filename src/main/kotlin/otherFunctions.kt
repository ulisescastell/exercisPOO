fun menu () {
    println("\n=== Menú de Gestió de Cercles ===")
    println("1. Crear un cercle amb un radi i color determinats")
    println("2. Crear un cercle amb un radi determinat")
    println("3. Mostrar l'últim cercle creat")
    println("4. Mostrar el perímetre de l'últim cercle creat")
    println("5. Mostrar l'àrea de l'últim cercle creat")
    println("6. Sortir")
}

fun startFunctions (user: Int, color: String, radi: Float) {
    when(user) {
        1 -> println(Cercle(radi, color))
        2 -> println(Cercle(radi))
        3 -> println(Cercle())
        4 -> Cercle().perimetre()
        5 -> println(Cercle().area())
        6 -> println("D'acord, fins la próxima")
    }
}


