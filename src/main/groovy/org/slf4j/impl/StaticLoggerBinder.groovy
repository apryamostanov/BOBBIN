package org.slf4j.impl

import io.infinite.bobbin.factories.BobbinFactory
import org.slf4j.ILoggerFactory
import org.slf4j.spi.LoggerFactoryBinder

public class StaticLoggerBinder implements LoggerFactoryBinder {

    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder()

    public static final StaticLoggerBinder getSingleton() {
        return SINGLETON
    }

    public static String REQUESTED_API_VERSION = "1.6.99" // !final

    private static final String loggerFactoryClassStr = BobbinFactory.class.getName()

    private final ILoggerFactory loggerFactory

    private StaticLoggerBinder() {
        loggerFactory = new BobbinFactory()
    }

    public ILoggerFactory getLoggerFactory() {
        return loggerFactory
    }

    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr
    }
}