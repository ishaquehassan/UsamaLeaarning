class Class1(val data:String)

fun main(args: Array<String>) {
    val c = Class1("as")
    print("Usama" - "Ishaq" - "asdad" - "asdsadas")
    "Usama".printMe()
    c.printMe()

    "Usama" repeatMe 10

    "Ishaq" repeatMe 20
}

fun Class1.printMe(){
    println(this.data)
}


fun String.printMe(){
    println(this)
}

operator fun String.minus(string: String):String = "$this\n$string"

infix fun String.repeatMe(repeatCount:Int){
    for (i in 1..repeatCount){
        println(this)
    }
}

fun <A,B> calcGen(a:A,b:A,res:(B,B)->Unit):(B,B)->Unit{
    return res
}