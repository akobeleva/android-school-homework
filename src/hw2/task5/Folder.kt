package hw2.task5


class Folder(parent: AbstractFileSystemNode?, name: String, vararg childrenArray: FileSystemNode) :
    AbstractFileSystemNode(parent, name) {
    private var children = childrenArray

    init {
        children.map { it.setParent(this) }.toTypedArray()
    }

    fun getChildren(): Array<out FileSystemNode> {
        return children
    }
}