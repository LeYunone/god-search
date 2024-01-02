package com.leyunone.godsearch.core.util;

import com.leyunone.godsearch.core.bean.data.UserData;
import com.leyunone.godsearch.core.manage.token.GodSearchManager;

/**
 * :)
 *
 * @Author pengli
 * @Date 2024/1/2 17:31
 */
public class TokenUtils {

    public static UserData getUser() {
        GodSearchManager bean = ApplicationContextProvider.getBean(GodSearchManager.class);
        return bean.getUser();
    }
}
