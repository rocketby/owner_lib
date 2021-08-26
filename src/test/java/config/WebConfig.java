package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${runMode}.properties"
})

public interface WebConfig extends Config {
    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("isRemote")
    Boolean isRemote();
}
