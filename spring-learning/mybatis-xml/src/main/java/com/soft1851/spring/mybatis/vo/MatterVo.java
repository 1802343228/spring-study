package com.soft1851.spring.mybatis.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CRQ
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatterVo {
    private String teacherName;
    private String clazzName;
    private String studentName;
    private String hometown;
    private String birthday;
}
