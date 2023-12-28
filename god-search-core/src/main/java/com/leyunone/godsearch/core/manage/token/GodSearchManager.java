package com.leyunone.godsearch.core.manage.token;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.server.HttpServerRequest;
import com.leyunone.godsearch.core.manage.base.TokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * :)
 * 本项目的用户token指令集
 *
 * @Author pengli
 * @Date 2023/12/28 17:36
 */
@Component
public class GodSearchManager implements TokenManager {

    @Autowired
    private HttpServerRequest request;

    public void getUser() {
        if (ObjectUtil.isNull(request)) {
            //本地缓存的伪用户信息
        } else {
            //云端信息
        }
    }

}
