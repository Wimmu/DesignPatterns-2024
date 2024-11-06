package Assignment_12_Proxy;

import java.util.Date;

public class Document implements IDocument {
    private String id;
    private Date creationDate;
    private String content;

    protected Document(String id, String content) {
        this.id = id;
        this.creationDate = new Date();
        this.content = content;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }
}
