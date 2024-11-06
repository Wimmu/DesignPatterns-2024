package Assignment_12_Proxy;
import java.util.Date;

public interface IDocument {
    String getContent(User user) throws AccessDeniedException;
    Date getCreationDate();
}
