package com.leyunone.godsearch.core.bean.data;

import com.leyunone.godsearch.core.bean.bo.UserAccessWeight;
import com.leyunone.godsearch.core.bean.bo.UserLikeFollow;
import com.leyunone.godsearch.core.bean.info.UserBaseInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * :)
 * 用户数据：
 *  基本信息
 *  访问权重历史
 *  喜好关键
 *
 * @Author pengli
 * @Date 2023/12/28 17:39
 */
@Getter
@Setter
public class UserData {

    /**
     * 用户基本信息
     */
    private UserBaseInfo userBaseInfo;

    /**
     * 用户访问权重
     */
    private UserAccessWeight userAccessWeight;

    /**
     * 用户喜好关注
     */
    private UserLikeFollow userLikeFollow;
}
