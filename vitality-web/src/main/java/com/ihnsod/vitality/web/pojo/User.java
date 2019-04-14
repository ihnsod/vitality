package com.ihnsod.vitality.web.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @author: Ihnsod
 * @create: 2019/04/06 21:57
 **/
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
