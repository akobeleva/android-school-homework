package hw2.task5

object Task5 {

    @JvmStatic
    fun main(args: Array<String>) {
        val file1 = File(null, "file1.txt")
        val file2 = File(null, "file2.png")
        val file3 = File(null, "file3.jpg")
        val file4 = File(null, "file1.webp")
        val file5 = File(null, "file1.bz2")

        val folder1 = Folder(null, "folder1", file1, file2)
        val folder2 = Folder(null, "folder2", file3, file4, file5)

        val root = Folder(null, "root", folder1, folder2)

        println(file4.getPath())

        val folder1Children: Array<out FileSystemNode> = folder1.getChildren()
        val file = folder1Children[1] as File
        println(file.getExtension())
    }
}