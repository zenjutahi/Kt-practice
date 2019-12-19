class Player(val name: String, var score: Int = 0, var lives: Int = 3, var level: Int = 7) {

    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score 
            """)
    }
}