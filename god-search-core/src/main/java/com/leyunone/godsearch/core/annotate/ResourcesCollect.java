package com.leyunone.godsearch.core.annotate;

import com.leyunone.godsearch.common.enums.ResourcesEnum;

import java.lang.annotation.*;

/**
 * :)
 *
 * @author LeYunone
 * @email 365627310@qq.com
 * @date 2023/11/28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResourcesCollect {

    ResourcesEnum origin();
}
