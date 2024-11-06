package Assignment_13_Visitor;

interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
