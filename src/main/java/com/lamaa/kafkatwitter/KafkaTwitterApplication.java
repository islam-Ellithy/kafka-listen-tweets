package com.lamaa.kafkatwitter;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaTwitterApplication {

	public static void main(String[] args) {

		new TweetProducer().run();  
		// SpringApplication.run(KafkaTwitterApplication.class, args);
	}

}
