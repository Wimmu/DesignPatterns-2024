package Assignment_13_Visitor;

import java.util.ArrayList;
import java.util.List;

class SearchVisitor implements FileSystemVisitor {
    private String pattern;
    private List<File> matchingFiles;

    public SearchVisitor(String pattern) {
        this.pattern = pattern;
        this.matchingFiles = new ArrayList<>();
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(pattern)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // Directories are not matched by name, only traverse contents.
    }
}
