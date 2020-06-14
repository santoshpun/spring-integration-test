package com.santosh.integrationtest.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author Santosh
 */
@Getter
@Setter
@Component
@ConfigurationProperties("datasource.v2")
public class DBSetting extends AbstractDBSetting {

}
