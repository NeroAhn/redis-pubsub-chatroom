package com.example.PubSubChat;

import com.example.PubSubChat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class PubSubChatApplication implements CommandLineRunner {

	private final ChatService chatService;

	public static void main(String[] args) {
		SpringApplication.run(PubSubChatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplication started...");

		chatService.enterChatRoom("chat1");
	}
}
