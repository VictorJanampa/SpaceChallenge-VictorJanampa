import item.Item

fun Int.toKgs() = this*1000

fun String.toItem(): Item? {
    if (contains("=") && length>2){
        val name = subSequence(0,indexOf('=')).toString()
        val weight = subSequence(indexOf('=')+1,length).toString().toInt()
        return Item(name,weight)
    }
    return null
}