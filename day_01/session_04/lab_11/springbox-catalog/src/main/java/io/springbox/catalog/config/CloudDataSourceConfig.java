package io.springbox.catalog.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.service.PooledServiceConnectorConfig;
import org.springframework.cloud.service.relational.DataSourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by agnisa on 31.08.2016.
 */
@Profile("cloud")
@Configuration
public class CloudDataSourceConfig extends AbstractCloudConfig {

    @Bean
    public DataSource dataSource() {
        PooledServiceConnectorConfig.PoolConfig poolConfig =
                new PooledServiceConnectorConfig.PoolConfig(5, 200);

        DataSourceConfig.ConnectionConfig connectionConfig =
                new DataSourceConfig.ConnectionConfig("characterEncoding=UTF-8");
        DataSourceConfig serviceConfig = new DataSourceConfig(poolConfig, connectionConfig);

        return connectionFactory().dataSource("springbox-catalog-db-ag", serviceConfig);
    }
}
