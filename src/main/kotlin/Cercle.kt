class Cercle() {
    private var radi:Float = 0.0f
    private var color:String = ""

    constructor(radi:Float):this() {
        this.radi = radi
    }

    constructor(radi: Float, color:String):this() {
        this.radi = radi
        this.color = color
    }

    fun perimetre () {
        this.radi = (2.0*(3.14)*radi).toFloat()
    }

    fun area (): Float {
        this.radi =
    }

    override fun toString(): String {

    }
}