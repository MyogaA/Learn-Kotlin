fun main() {
    // 1. Deklarasi dasar Character
    println("=== DEKLARASI CHARACTER ===")
    val char1: Char = 'A'
    val char2 = 'B' // Tipe inferensi otomatis ke Char
    val char3 = '1' // Karakter angka
    val char4 = '@' // Karakter simbol

    println("char1: $char1")
    println("char2: $char2")
    println("char3: $char3")
    println("char4: $char4")

    // 2. Unicode Characters
    println("\n=== UNICODE CHARACTERS ===")
    val copyright = '\u00A9' // Copyright symbol ©
    val heart = '\u2764'     // Heart symbol ❤
    val smile = '\u263A'     // Smile symbol ☺
    val theta = '\u03B8'     // Greek letter θ

    println("Copyright: $copyright")
    println("Heart: $heart")
    println("Smile: $smile")
    println("Theta: $theta")

    // 3. Operasi dengan Character
    println("\n=== OPERASI CHARACTER ===")
    val charA = 'A'
    val charB = 'B'

    // Perbandingan
    println("A < B: ${charA < charB}")
    println("A > B: ${charA > charB}")
    println("A == B: ${charA == charB}")

    // Increment dan Decrement
    var letter = 'A'
    println("Original letter: $letter")
    println("Next letter: ${++letter}") // B
    println("Previous letter: ${--letter}") // A

    // 4. Konversi Character
    println("\n=== KONVERSI CHARACTER ===")
    val digit = '5'
    val letterChar = 'C'

    // Ke Int (mendapatkan kode ASCII/Unicode)
    println("Kode ASCII dari '$digit': ${digit.code}")
    println("Kode ASCII dari '$letterChar': ${letterChar.code}")

    // Dari Int ke Char
    val asciiCode = 65
    val charFromCode = asciiCode.toChar()
    println("Karakter dari kode $asciiCode adalah $charFromCode")

    // 5. Character Properties dan Functions
    println("\n=== PROPERTIES DAN FUNCTIONS ===")
    val testChar1 = 'a'
    val testChar2 = '9'
    val testChar3 = ' '

    println("'$testChar1' isLetter(): ${testChar1.isLetter()}")
    println("'$testChar1' isUpperCase(): ${testChar1.isUpperCase()}")
    println("'$testChar1' isLowerCase(): ${testChar1.isLowerCase()}")
    println("'$testChar1' toUpperCase(): ${testChar1.uppercaseChar()}")

    println("'$testChar2' isDigit(): ${testChar2.isDigit()}")
    println("'$testChar2' isLetterOrDigit(): ${testChar2.isLetterOrDigit()}")

    println("'$testChar3' isWhitespace(): ${testChar3.isWhitespace()}")

    // 6. Escape Characters
    println("\n=== ESCAPE CHARACTERS ===")
    println("Newline: \nBaris baru")
    println("Tab: A\tB")
    println("Single quote: \'")
    println("Double quote: \"")
    println("Backslash: \\")

    // 7. Contoh Praktis
    println("\n=== CONTOH PRAKTIS ===")
    fun isVowel(c: Char): Boolean {
        return c.lowercaseChar() in "aeiou"
    }

    val huruf = 'E'
    println("Apakah '$huruf' huruf vokal? ${isVowel(huruf)}")

    // Range karakter
    val alfabetKecil = 'a'..'z'
    println("Apakah 'c' ada dalam alfabet? ${'c' in alfabetKecil}")
}

// Mari saya jelaskan poin-poin penting dari kode di atas:
//
//Deklarasi Dasar:
//
//Character di Kotlin dideklarasikan menggunakan tanda kutip tunggal (')
//Bisa berisi huruf, angka, atau simbol
//
//
//Unicode:
//
//Bisa menggunakan karakter Unicode dengan format \uXXXX
//Berguna untuk simbol khusus dan karakter non-Latin
//
//
//Operasi:
//
//Character bisa dibandingkan (<, >, ==)
//Bisa di-increment (++) dan decrement (--)
//
//
//Konversi:
//
//.code untuk mendapatkan nilai ASCII/Unicode
//toChar() untuk mengkonversi Int ke Char
//
//
//Properties dan Functions:
//
//isLetter(): cek apakah huruf
//isDigit(): cek apakah angka
//isWhitespace(): cek apakah spasi/whitespace
//uppercaseChar()/lowercaseChar(): ubah ke huruf besar/kecil
//
//
//Escape Characters:
//
//\n: baris baru
//\t: tab
//\': tanda kutip tunggal
//\": tanda kutip ganda
//\\: backslash
//
//
//Contoh Praktis:
//
//Range karakter
//Fungsi untuk mengecek vokal