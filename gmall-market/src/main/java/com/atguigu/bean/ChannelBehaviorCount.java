package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *
 *@Author:shy
 *@Date:2020/12/21 14:27
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChannelBehaviorCount {
    private String channel;
    private String behavior;
    private String windowEnd;
    private Long count;
}
