package com.leyunone.godsearch.core.handler;

import com.leyunone.godsearch.common.enums.ResourcesEnum;
import com.leyunone.godsearch.core.annotate.ResourcesCollect;
import org.springframework.stereotype.Service;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2023/11/28
 */
@ResourcesCollect(origin = ResourcesEnum.BAIDU)
@Service
public class BaiduResourcesHandler implements ResourcesHandler{
    @Override
    public void handler() {

    }
}
