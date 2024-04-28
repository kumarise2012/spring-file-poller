package com.spring.poller.example.integration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.MessageChannel;

/**
 * Channel Definitions
 *
 * @author Santosh kumar
 */
@Configuration
public class ApplicationConfiguration {

    public static final String INBOUND_CHANNEL = "inbound-channel";


    @Bean(name = INBOUND_CHANNEL)
    public MessageChannel inboundFilePollingChannel() {
        return MessageChannels.direct().get();
    }

}
