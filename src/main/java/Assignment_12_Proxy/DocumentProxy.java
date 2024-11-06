package Assignment_12_Proxy;

import java.util.Date;

public class DocumentProxy implements IDocument {
    private Document document;
    private String documentId;

    public DocumentProxy(Document document) {
        this.document = document;
        this.documentId = document.getId();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        AccessControlService accessService = AccessControlService.getInstance();
        if (accessService.isAllowed(documentId, user.getUsername())) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied to document: " + documentId);
        }
    }

    @Override
    public Date getCreationDate() {
        return document.getCreationDate();
    }
}
