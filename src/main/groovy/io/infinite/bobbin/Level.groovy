package io.infinite.bobbin

import groovy.transform.CompileStatic

@CompileStatic
enum Level {
    TRACE("trace"),
    DEBUG("debug"),
    INFO("info"),
    WARN("warn"),
    ERROR("error")
    private final String level

    Level(String level) {
        this.level = level
    }

    String value() {
        return level
    }
}