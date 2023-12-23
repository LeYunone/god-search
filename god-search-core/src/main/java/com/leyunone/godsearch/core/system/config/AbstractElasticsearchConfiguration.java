package com.leyunone.godsearch.core.system.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.config.ElasticsearchConfigurationSupport;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.convert.ElasticsearchConverter;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2023/11/27
 */
public abstract class AbstractElasticsearchConfiguration extends ElasticsearchConfigurationSupport {

        //需重写本方法
        public abstract RestHighLevelClient elasticsearchClient();

        @Bean(name = { "elasticsearchOperations", "elasticsearchTemplate" })
        public ElasticsearchOperations elasticsearchOperations(ElasticsearchConverter elasticsearchConverter) {
            return new ElasticsearchRestTemplate(elasticsearchClient(), elasticsearchConverter);
        }
    }