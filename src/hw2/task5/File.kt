package hw2.task5

class File(parent: AbstractFileSystemNode?, name: String) : AbstractFileSystemNode(parent, name) {

    fun getExtension() : String {
        val nameArray = this.getName()!!.split("\\.")
        return nameArray[nameArray.size - 1]
    }
}