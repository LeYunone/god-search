package com.leyunone.godsearch.core.service.impl;

import com.leyunone.godsearch.core.bean.vo.SearchInfoVO;
import com.leyunone.godsearch.core.service.SearchService;
import org.springframework.stereotype.Service;

/**
 * :)
 *  首页默认搜索服务
 * @Author pengli
 * @Date 2024/1/2 15:23
 */
@Service
public class HomePageSearchServiceImpl implements SearchService<SearchInfoVO> {

    /**
     * 首页搜索逻辑：
     *  根据用户 计算搜索权重
     *  推荐网点前置
     *  垃圾网站过滤
     *  ChatGPT赋能
     * @param content
     * @return
     */
    @Override
    public SearchInfoVO search(String content) {
        
        
        return null;
    }
}
