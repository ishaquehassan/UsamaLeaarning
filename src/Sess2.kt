fun main(args: Array<String>) {
    val myAddFun:()->String = {
        if(1>0){
            ""
        }else if(0>0){
            ""
        }else{
            ""
        }
    }

    myAddFun()
    val aaaa = 10
    val ss = when(aaaa){
        10 -> {
            3
        }
        else -> {
            ""
        }
    }
}

