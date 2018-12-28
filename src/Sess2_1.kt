fun main(args: Array<String>) {
    button("hello"){
        println("val : ${it.length} $it")

        button("hello world"){ aa ->
            println("val : ${aa.length} $aa")
        }
    }


    returnIng()(){
        print("asas")
    }()

}

fun button(title:String,onClick:(String)->Unit){
    onClick(title)
}

fun returnIng():(()->Unit)->()->Unit{
    return fun(a:()->Unit):()->Unit{
        a()
        return  {
            print("hello")
        }
    }
}
