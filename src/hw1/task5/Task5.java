package hw1.task5;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2.png");
        File file3 = new File("file3.jpg");
        File file4 = new File("file1.webp");
        File file5 = new File("file1.bz2");

        Folder folder1 = new Folder("folder1", file1, file2);
        Folder folder2 = new Folder("folder2", file3, file4, file5);

        Folder root = new Folder("root", folder1, folder2);

        System.out.println(file4.getPath());

        ArrayList<FileSystemNode> folder1Children = folder1.getChildren();
        File fileWithExtension = (File) folder1Children.get(1);
        File fileWithoutExtension = (File) folder1Children.get(0);
        System.out.println(fileWithExtension.getExtension());
        System.out.println(fileWithoutExtension.getExtension());
    }
}
