package com.leyunone.godsearch.core.service.impl;

import com.leyunone.godsearch.core.bean.info.RecommendToolInfo;
import com.leyunone.godsearch.core.service.DefaultConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * :)
 *  推荐工具
 * @Author pengli
 * @Date 2023/12/28 17:26
 */
@Service
public class DefaultRecommendToolsServiceImpl implements DefaultConfigService<RecommendToolInfo> {
    
    @Override
    public List<RecommendToolInfo> defaultInfos() {
        return null;
    }
}
