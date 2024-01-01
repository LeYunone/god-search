package com.leyunone.godsearch.core.bean.info;

import lombok.Getter;
import lombok.Setter;

/**
 * :)
 *  用户基本信息
 * @Author pengli
 * @Date 2023/12/28 17:39
 */
@Getter
@Setter
public class UserBaseInfo {

    private String account;
    
    private String email;

    /**
     * 唯一id
     */
    private String sessionId;

    /**
     * TODO 手机号 名字
     */
}
