package com.kulesko.colors;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class LABPuppiesApplicationLifeCycle {

    private static final Logger LOG = LoggerFactory.getLogger(LABPuppiesApplicationLifeCycle.class);

    protected void onStart(@Observes StartupEvent event) {
        LOG.info(" ___       ________  ________                 ________  ___  ___  ________  ________  ___  _______   ________      \n" +
                "|\\  \\     |\\   __  \\|\\   __  \\               |\\   __  \\|\\  \\|\\  \\|\\   __  \\|\\   __  \\|\\  \\|\\  ___ \\ |\\   ____\\     \n" +
                "\\ \\  \\    \\ \\  \\|\\  \\ \\  \\|\\ /_  ____________\\ \\  \\|\\  \\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\ \\   __/|\\ \\  \\___|_    \n" +
                " \\ \\  \\    \\ \\   __  \\ \\   __  \\|\\____________\\ \\   ____\\ \\  \\\\\\  \\ \\   ____\\ \\   ____\\ \\  \\ \\  \\_|/_\\ \\_____  \\   \n" +
                "  \\ \\  \\____\\ \\  \\ \\  \\ \\  \\|\\  \\|____________|\\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\___|\\ \\  \\___|\\ \\  \\ \\  \\_|\\ \\|____|\\  \\  \n" +
                "   \\ \\_______\\ \\__\\ \\__\\ \\_______\\              \\ \\__\\    \\ \\_______\\ \\__\\    \\ \\__\\    \\ \\__\\ \\_______\\____\\_\\  \\ \n" +
                "    \\|_______|\\|__|\\|__|\\|_______|               \\|__|     \\|_______|\\|__|     \\|__|     \\|__|\\|_______|\\_________\\\n" +
                "                                                                                                       \\|_________|");
        LOG.info("The LAB-puppies application is starting with profile " + ProfileManager.getActiveProfile());
    }

    protected void onStop(@Observes ShutdownEvent event) {
        LOG.info("LAB-puppies is shutting down...");
    }

}
