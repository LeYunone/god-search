package com.leyunone.godsearch.core.service.impl;

import com.leyunone.godsearch.core.bean.info.RecommendWebSiteInfo;
import com.leyunone.godsearch.core.service.DefaultConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * :)
 *  网站站点推荐
 * @Author pengli
 * @Date 2023/12/28 17:18
 */
@Service
public class DefaultRecommendWebSiteServiceImpl implements DefaultConfigService<RecommendWebSiteInfo> {
    
    
    @Override
    public List<RecommendWebSiteInfo> defaultInfos() {
        return null;
    }
}
