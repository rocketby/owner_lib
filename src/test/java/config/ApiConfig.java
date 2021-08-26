package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:api.properties",
        "file:C:\\test\\api-local.properties"
})

public interface ApiConfig extends Config {
    @Config.Key("baseUrl")
    String baseUrl();

    @Config.Key("token")
    String token();
}
