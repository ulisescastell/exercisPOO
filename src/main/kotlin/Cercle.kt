class Cercle() {
    private var radi:Float = 0.0f
    private var color:String = "blanc"

    constructor(radi:Float):this() {
        this.radi = radi
    }

    constructor(radi: Float, color:String):this() {
        this.radi = radi
        this.color = color
    }

    fun perimetre () {
        this.radi = (2*3.14*radi).toFloat()
    }

    fun area () {
        this.radi = (3.14*radi*radi).toFloat()
    }

    override fun toString(): String {
        return "${this.radi}, ${this.color}"
    }
}