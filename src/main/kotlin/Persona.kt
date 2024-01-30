class Persona(){
    private var dni:String = ""
    private var nom:String = ""
    private var cognoms:String = ""
    private var edat:Int = 0
    private var estatCivil = false

    constructor(nom:String, cognoms:String): this() {
        this.nom = nom
        this.cognoms = cognoms
    }

    constructor(dni:String, nom:String, cognoms:String, edat:Int, estatCivil:Boolean): this() {
        this.dni = dni
        this.nom = nom
        this.cognoms = cognoms
        this.edat = edat
        this.estatCivil = estatCivil
    }

    fun aniversari () {
        this.edat++
    }

    fun casament () {
        this.estatCivil = true
    }

    fun divorci () {
        this.estatCivil = false
    }

    override fun toString(): String{
        return "${this.dni}, ${this.nom}, ${this.cognoms}, ${this.edat}, ${this.estatCivil}"
    }
}



