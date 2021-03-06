package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author CRQ
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer courseId;
    private String courseName;
    private List<Student> students;
}
