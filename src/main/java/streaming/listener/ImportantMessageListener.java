package streaming.listener;

import lombok.extern.java.Log;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import streaming.message.ImportantMessage;

@Log
public class ImportantMessageListener implements MessageListener<Integer, ImportantMessage> {

    @Override
    public void onMessage(ConsumerRecord<Integer, ImportantMessage> integerMessageConsumerRecord) {
        log.info("IMPORTANT MESSAGE: " + integerMessageConsumerRecord.value().toString());
    }
}
