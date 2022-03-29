package hw2.task5

import java.lang.StringBuilder

abstract class AbstractFileSystemNode(
    private var parent: FileSystemNode?,
    private val name: String?
) : FileSystemNode {

    override fun setParent(parent: FileSystemNode) {
        this.parent = parent as AbstractFileSystemNode
    }

    final override fun getParent(): FileSystemNode? = parent

    override fun getName(): String? = name

    final override fun getPath(): String {
        var parent = getParent()
        val sb = StringBuilder()
        while (parent != null) {
            sb.insert(0, "/").insert(1, parent.getName())
            parent = parent.getParent()
        }
        sb.append("/").append(getName())
        return sb.toString()
    }
}