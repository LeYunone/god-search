package com.leyunone.godsearch.core.system.config;

import lombok.Data;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2023/11/27
 */
@ConfigurationProperties(prefix = "elasticsearch")
@Configuration
@Data
public class EsConfig extends AbstractElasticsearchConfiguration {

    private String host;
    private Integer port;

    //重写父类方法
    @Override
    public RestHighLevelClient elasticsearchClient() {
        RestClientBuilder builder = RestClient.builder(new HttpHost(host, port));
        RestHighLevelClient restHighLevelClient = new
                RestHighLevelClient(builder);
        return restHighLevelClient;
    }
}