package Assignment_13_Visitor;

interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
