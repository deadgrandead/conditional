package com.deadgrandead.conditional.config;

import com.deadgrandead.conditional.interfaces.SystemProfile;
import com.deadgrandead.conditional.realizations.DevProfile;
import com.deadgrandead.conditional.realizations.ProductionProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name = "deadgrandead.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "deadgrandead.profile.dev", havingValue = "false", matchIfMissing = true)
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
