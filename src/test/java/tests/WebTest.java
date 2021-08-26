package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    @Test
    public void WebLocalTest() {

        // in terminal execute: gradle clean test -DrunMode=local
        System.setProperty("runMode", "local");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("chrome");
        assertThat(config.browserVersion()).isEqualTo("92.0");
        assertThat(config.isRemote()).isEqualTo(false);
    }

    @Test
    public void WebRemoteTest() {

        // in terminal execute: gradle clean test -DrunMode=remote
        System.setProperty("runMode", "remote");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("firefox");
        assertThat(config.browserVersion()).isEqualTo("89.0");
        assertThat(config.isRemote()).isEqualTo(true);
    }
}
