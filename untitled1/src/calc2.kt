fun  main (args: Array<String>) {
    var V = readLine()!!.toFloat()
    var D = readLine()!!.toFloat()
    var znak = readLine()

    if (znak=="+")println(V+D)
    if (znak=="*") println(V*D)
    if (znak=="/")println(V/D)
    if (znak=="-")println(V-D)

}