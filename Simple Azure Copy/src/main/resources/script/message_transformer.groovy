import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.*;

def Message processData(Message message) {

def body = message.getBody();


map = message.getProperties();
String fileName = '/Message_' + String.format('%tY-%<tm-%<td_%<tH%<tM%<tS', new Date()) + '.txt';
message.setProperty("path", fileName);

return message;

}