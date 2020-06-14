package com.santosh.integrationtest.core.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author Santosh
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.santosh.integrationtest.repository"},
        entityManagerFactoryRef = "coreEMF",
        transactionManagerRef = "coreTM")
public class DatasourceConfig extends AbstractDataConfig {

    private static final String PU_NAME = "core";
    private static final String[] PACKAGES = {"com.santosh.integrationtest.model"};
    private static final String DATASOURCE_NAME = "v2DataSource";

    @Primary
    @Bean(name = DATASOURCE_NAME)
    public DataSource coreDataSource(final DBSetting dbSetting) {
        return buildDataSource(dbSetting);
    }

    @Primary
    @Bean(name = "coreEMF")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier(value = DATASOURCE_NAME) DataSource dataSource) {
        return buildEntityManagerFactory(dataSource, PU_NAME, PACKAGES);
    }

    @Primary
    @Bean(name = "coreTM")
    public PlatformTransactionManager transactionManager(@Qualifier(value = "coreEMF") EntityManagerFactory emf) {
        return buildTransactionManager(emf);
    }
}
