package hw2.task5

interface FileSystemNode {
    fun setParent(parent: FileSystemNode)
    fun getParent(): FileSystemNode?
    fun getName(): String?
    fun getPath(): String
}