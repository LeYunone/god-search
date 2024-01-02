package com.leyunone.godsearch.core.service.impl;

import com.leyunone.godsearch.core.bean.data.UserData;
import com.leyunone.godsearch.core.chatgpt.ChatDialogueConstants;
import com.leyunone.godsearch.core.manage.token.ChatGPTTokenManager;
import com.leyunone.godsearch.core.manage.token.GodSearchManager;
import com.leyunone.godsearch.core.service.GptAIService;
import com.leyunone.godsearch.core.util.TokenUtils;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionResult;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.image.CreateImageRequest;
import com.theokanning.openai.image.ImageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2024/1/1
 */
@Service
public class GptAIServiceImpl implements GptAIService {

    @Autowired
    private GodSearchManager godSearchManager;
    @Autowired
    private ChatGPTTokenManager chatGPTTokenManager;

    /**
     * 开始聊天
     * @param startStatus 开始状态 true  结束状态 false
     * @param newChat 新的聊天
     */
    public void chat(boolean startStatus,String newChat,Integer index) {
        UserData user = TokenUtils.getUser();
        Map<String, List<ChatMessage>> chatCache = ChatDialogueConstants.chatList;
        String key = user.getUserBaseInfo().getSessionId()+"#"+index;
        List<ChatMessage> chatList = null;
        if(startStatus) {
            chatList = new ArrayList<>();
            chatCache.put(key,chatList);
        }else{
            ChatDialogueConstants.chatList.remove(key);
        }
        ChatMessage newMessage=new ChatMessage();
//        newMessage.setRole(role);
        newMessage.setContent(newChat);
        chatList.add(newMessage);
        String result = aiChatting(chatList);
    }

    /**
     * 生成描述图片
     * @param imageChat
     */
    public void chatImage(String imageChat) {
        CreateImageRequest createImageRequest= CreateImageRequest.builder()
                //所需图像的文本描述。最大长度为 1000 个字符。
                .prompt(imageChat)
                //生成图像的大小。必须是256x256、512x512或1024x1024
                .size("1024x1024")
                //响应格式,生成的图像返回的格式。必须是url或b64_json,默认为url,url将在一小时后过期。
                .responseFormat("url")
                //要生成的图像数。必须介于 1 和 10 之间。
                .n(1)
                .build();
        ImageResult result=chatGPTTokenManager.getOpenApi().createImage(createImageRequest);
        Map<String,String> r=new HashMap<>();
        String url=result.getData().get(0).getUrl();
    }

    private String aiChatting(List<ChatMessage> chatList) {
        // 如果是助手角色，也就是chatGPT的回答结果，则不用发送request，只是用于存入chatList，不做其他工作
//        if (roleAssistant.equals(role)) {
//            return null;
//        }
        ChatCompletionRequest chatCompletionRequest= ChatCompletionRequest.builder()
                .model(ChatDialogueConstants.CHAT_MODEL)
                .messages(chatList)
                .build();
        ChatCompletionResult result=chatGPTTokenManager.getOpenApi().createChatCompletion(chatCompletionRequest);
        //根据响应的结构（可以在官网查看，也可以自行输出查看），获取返回结果中的第一个结果中的内容
        String content=result.getChoices().get(0).getMessage().getContent();
        return content;
    }
}
