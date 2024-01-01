package com.leyunone.godsearch.core.manage.token;

import com.theokanning.openai.OpenAiApi;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2024/1/1
 */
@Component
public class ChatGPTTokenManager {

    @Value("${chatgpt.token:}")
    private String token;

    public OpenAiService getOpenApi() {
        OpenAiService service = new OpenAiService(token);
        return service;
    }
}
