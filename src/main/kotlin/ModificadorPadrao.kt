class ModificadorPadrao {

    class ModificadorPadrao : Modificador {
        override fun calcularMod(valor: Int): Int {
            return when (valor){
                in 0..1 -> -5
                in 2..3 -> -4
                in 4..5 -> -3
                in 6..7 -> -2
                in 8..9 -> -1
                in 10..11 -> 0
                in 12..13 -> +1
                in 14..15 -> +2
                in 16..17 -> +3
                in 18..19 -> +4
                in 20..21 -> +5
                in 22..23 -> +6
                in 24..25 -> +7
                in 26..27 -> +8
                in 28..29 -> +9
                30 -> +10
                else -> throw IllegalArgumentException("Valor de habilidade inválido: $valor")
            }
        }
    }

}