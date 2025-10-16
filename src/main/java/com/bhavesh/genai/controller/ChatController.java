package com.bhavesh.genai.controller;

import com.bhavesh.genai.dto.InputMessageDTO;
import org.codehaus.groovy.tools.shell.IO;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
public class ChatController {

  private final ChatClient chatClient;

  @Autowired
  public ChatController(ChatClient.Builder builder) {
      this.chatClient = builder.build();
  }

//  @GetMapping("/ai/generate")
//  public String generate(@RequestBody InputMessageDTO inputMessageDTO) {
//      System.out.println("Received message: " + inputMessageDTO.getMessage());
//     return chatClient.prompt().user(inputMessageDTO.getMessage())
//             .system(inputMessageDTO.getSystemMessage())
//             .call().content();
//  }

    @PostMapping("/ai/generate")
    public String generate(@RequestBody InputMessageDTO inputMessageDTO) {
        System.out.println("Received message: " + inputMessageDTO.getMessage());
        return chatClient.prompt()
                .user(inputMessageDTO.getMessage())
                .system(inputMessageDTO.getSystemMessage())
                .call()
                .content();
    }


//    @PostMapping(value="/ai/generateStream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//  public Flux<String> generateStream(@RequestBody InputMessageDTO inputMessageDTO) {
//      return chatClient.prompt().user(inputMessageDTO.getMessage()).stream().content();
//  }

    @GetMapping(value="/ai/generateStream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> generateStream(@RequestParam String message,
                                       @RequestParam String systemMessage) {
        return chatClient.prompt()
                .user(message)
                .system(systemMessage)
                .stream()
                .content();
    }


}