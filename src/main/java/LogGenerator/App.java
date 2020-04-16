package LogGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;
import java.util.UUID;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {

        String[] message = {"This is a trace message",
                "This is a debug message",
                "This is an info message",
                "This is a warn message",
                "This is an error message",
                "This is a fatal message"};

        int messageArraySize = message.length;

        while (true) {
            int randomMessageArrayNumber = new Random().nextInt(messageArraySize);
            String uuid = UUID.randomUUID().toString();
            switch(randomMessageArrayNumber){
                case 0:
                    logger.trace(message[randomMessageArrayNumber]+ " | " +uuid);
                    break;
                case 1:
                    logger.debug(message[randomMessageArrayNumber]+ " | " +uuid);
                    break;
                case 2:
                    logger.info(message[randomMessageArrayNumber]+ " | " +uuid);
                    break;
                case 3:
                    logger.warn(message[randomMessageArrayNumber]+ " | " +uuid);
                    break;
                case 4:
                    logger.error(message[randomMessageArrayNumber]+ " | " +uuid);
                    break;
                case 5:
                    logger.fatal(message[randomMessageArrayNumber]+ " | " +uuid);
                    break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
