package com.dc.spring.boot.command.plugin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandExecutorAutoConfiguration {

    @Bean
    public CommandExecutor commandExecutor(){
        return new CommandExecutorImpl();
    }
}
