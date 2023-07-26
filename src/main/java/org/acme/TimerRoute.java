package org.acme;
import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.Exchange;

public class TimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Consume from the message broker queue
        from("jms:queue:orders")
            .log("received ${body} from JMS queue");


    }
}