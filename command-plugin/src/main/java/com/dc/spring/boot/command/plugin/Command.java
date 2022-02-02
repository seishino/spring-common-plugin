package com.dc.spring.boot.command.plugin;

import reactor.core.publisher.Mono;

public interface Command<I, O> {
    Mono<O> execute(I input);
}
