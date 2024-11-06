package Assignment_12_Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, IDocument> documents = new HashMap<>();

    public void addUnprotectedDocument(String id, String content) {
        documents.put(id, new Document(id, content));
    }

    public void addProtectedDocument(String id, String content) {
        Document realDocument = new Document(id, content);
        DocumentProxy proxy = new DocumentProxy(realDocument);
        documents.put(id, proxy);
    }

    public IDocument getDocument(String id) {
        return documents.get(id);
    }
}
