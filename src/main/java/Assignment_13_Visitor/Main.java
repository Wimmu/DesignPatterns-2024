package Assignment_13_Visitor;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("document.txt", 10);
        File file2 = new File("cat.jpg", 20);
        File file3 = new File("music.mp3", 15);
        File file4 = new File("video.mp4", 50);
        File file5 = new File("music2.mp3", 30);
        File file6 = new File("music3.mp3", 25);
        File file7 = new File("dog.jpg", 40);
        File file8 = new File("music4.mp3", 35);

        Directory dir1 = new Directory("Documents");
        Directory dir2 = new Directory("Media");

        dir1.addElement(file1);
        dir1.addElement(file2);
        dir2.addElement(file3);
        dir2.addElement(file4);
        dir2.addElement(file5);
        dir2.addElement(file6);
        dir1.addElement(file7);
        dir2.addElement(file8);

        Directory rootDir = new Directory("Root");
        rootDir.addElement(dir1);
        rootDir.addElement(dir2);

        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        rootDir.accept(sizeCalculator);
        System.out.println("Total size of all files: " + sizeCalculator.getTotalSize() + " MB");

        // Search for files containing ".mp3"
        SearchVisitor searchVisitor = new SearchVisitor(".mp3");
        rootDir.accept(searchVisitor);
        System.out.println("Files matching '.mp3':");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(" - " + file.getName());
        }

        // Search for files containing ".jpg"
        SearchVisitor searchVisitor2 = new SearchVisitor(".jpg");
        rootDir.accept(searchVisitor2);
        System.out.println("Files matching '.jpg':");
        for (File file : searchVisitor2.getMatchingFiles()) {
            System.out.println(" - " + file.getName());
        }
    }
}
