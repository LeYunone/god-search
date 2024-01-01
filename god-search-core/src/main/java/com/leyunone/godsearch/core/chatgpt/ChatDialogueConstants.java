package com.leyunone.godsearch.core.chatgpt;

import com.theokanning.openai.completion.chat.ChatMessage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * :)
 *  对话聊天
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2024/1/1
 */
public class ChatDialogueConstants {

    /**
     * 聊天框列表
     */
    public static Map<String, List<ChatMessage>> chatList = new ConcurrentHashMap<>();

    public static String CHAT_MODEL = "";
}
