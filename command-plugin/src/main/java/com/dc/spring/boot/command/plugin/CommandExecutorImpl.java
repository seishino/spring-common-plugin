package com.dc.spring.boot.command.plugin;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public <RX, I, O> Mono<RX> execute(Command<I, O> command, I input, Function<O, RX> output) {
        return Mono.fromSupplier(()->input)
                .flatMap(command::execute)
                .map(output);
    }
}
