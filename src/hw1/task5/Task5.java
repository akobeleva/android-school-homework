package hw1.task5;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        File file1 = new File(null, "file1.txt");
        File file2 = new File(null, "file2.png");
        File file3 = new File(null, "file3.jpg");
        File file4 = new File(null, "file1.webp");
        File file5 = new File(null, "file1.bz2");

        Folder folder1 = new Folder(null, "folder1", file1, file2);
        Folder folder2 = new Folder(null, "folder2", file3, file4, file5);

        Folder root = new Folder(null, "root", folder1, folder2);

        System.out.println(file4.getPath());

        ArrayList<BaseFileSystemNode> folder1Children = folder1.getChildren();
        File file = (File) folder1Children.get(1);
        System.out.println(file.getExtension());
    }
}
