fun main(){
    char()
    modulers(20,6)
    parameters()
    interpret()
}
fun char(){
    var text="Codehive"
    var t = (text[4].toString()+text[5]+text[6])
    println(t)
}
fun modulers(a:Int,b:Int):Int{
    var numbers=a%b
    return a%b
}
fun parameters(){
    var name="rehema"
    var age=43
    var sentence=("hi,my name is $name and i am $age years old")
    println(sentence)
}
fun interpret(){
    var place ="Nairobi"
    println(place.length)
}
