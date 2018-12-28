fun main(args: Array<String>) {

    val name = "Usama"
    var age = 22
    age = 23


    var sub:String? = null
    val s = sub?.length ?: 0
    sub = "asas"

    var height:Int? = null
    height = 10

    var anything:Any? = "dfsdf"
    //anything = 10
    //anything = 10.0

    if (anything is String){
        anything.length
    }

    var subjects:Array<String>? = arrayOf("asa","")
    subjects!![0]

    for (subject in subjects){

    }

    val myRange = 0 downTo subjects.size

    for(i in 1..10){

    }

    var total = 20

    var final = 0
    if(total > 5){
        final = 1
    }else if(total > 10){
        final = 2
    }else if(total > 15){
        final = 3
    }



    var myFinal = when{
        total > 5 -> 1
        total > 10 -> 1
        else -> 0
    }

    when(anything){
         is String ->{

        }
         is Int ->{
            if(anything > 5){

            }
        }
        is Float ->{

        }
    }

    when(total){
        5 -> {
            print("hello")
        }
        10 -> {
            print("helloas")
        }
        else -> {
            print("asa")
        }
    }

    val myArrList = arrayListOf("")
    myArrList.add("asas")
    myArrList.add("sdfsfad")
    myArrList.add("sdgfsdf")

    val a = myArrList.map { 0 }.map { it*2.0f }
    a.forEach {
        println(it)
    }

    val b = mutableMapOf(
        "name" to "Usama",
        10 to "Usama"
    )
    fun add(a:Int = 10,b:Int = 10):Int {
        return a+b
    }
    val aa = add(b = 10,a = 20)
    println(aa)


    val inp = readLine()?.toInt()
    inp?.also {
        println(inp)
    }




}

