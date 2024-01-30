fun main () {

    val persona1: Persona = Persona()
    println(persona1)
    val persona2: Persona = Persona("Ulises", "Castell")
    println(persona2)
    val persona3: Persona = Persona("2322344G", "Ulises", "Castell", 2, false)
    println(persona3)

    println("---------------------------------------------------------------")

    menu()
    val user = readInt("Seleccioneu una opció:", "Input error")
    val radi = readFloat("Introdueix el radi", "Input incorrecte")
    val color = readSentence("Introdueix el color", "Input incorrecte")

    startFunctions(user, color, radi)


}