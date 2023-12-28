package com.leyunone.godsearch.core.bean.info;

import lombok.Getter;
import lombok.Setter;

/**
 * :)
 *  推荐工具信息
 * @Author pengli
 * @Date 2023/12/28 17:27
 */
@Getter
@Setter
public class RecommendToolInfo {

    private String webSiteUrl;
    
    private String toolName;
    
    //是否直接使用
    private boolean directUse;
    
    private String toolText;

    @Getter
    @Setter
    public static class Tool{
        
        private String input;
        
        private String html;
        
        private String api;
    }
}
