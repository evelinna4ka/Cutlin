fun main(args: Array<String>) {
/* разница между var and val
var
val статическое и неизменяемое и непереопределяемое
 */
var name = "xy"
name = "yx"
    println(name)
    val c = 3.01
    println(c)
    val url = "www.damirclever.com"
    println("$name and $c and $url")
}