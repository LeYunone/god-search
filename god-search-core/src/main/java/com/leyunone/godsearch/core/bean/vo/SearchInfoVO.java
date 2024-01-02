package com.leyunone.godsearch.core.bean.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * :)
 *  搜索信息
 * @Author pengli
 * @Date 2024/1/2 16:50
 */
@Getter
@Setter
public class SearchInfoVO {
    
    private List<WebSiteInfo> webSiteInfoList;
    
    
    @Getter
    @Setter
    public static class WebSiteInfo{
        /**
         * 站点
         */
        private String webSite;
        //站点名
        private String webSiteName;
        //图标
        private String icon;
        //描述
        private String describe;
    }
}
