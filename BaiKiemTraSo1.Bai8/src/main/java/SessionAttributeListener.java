import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.logging.Logger;

public class SessionAttributeListener implements HttpSessionAttributeListener {
    private static final Logger logger = Logger.getLogger(SessionAttributeListener.class.getName());

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        logger.info("Thuộc tính thêm: " + event.getName() + " = " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        logger.info("Thuộc tính xóa: " + event.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        logger.info("Thuộc tính cập nhật: " + event.getName() + " = " + event.getValue());
    }
}