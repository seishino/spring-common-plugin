package com.dc.spring.boot.command.plugin;

import reactor.core.publisher.Mono;

import java.util.function.Function;

public interface CommandExecutor {
    <RX, I, O> Mono<RX> execute(Command<I, O> command, I input, Function<O, RX> output);
}
