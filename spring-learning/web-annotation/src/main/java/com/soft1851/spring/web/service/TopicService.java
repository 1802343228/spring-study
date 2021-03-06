package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Topic;

import java.util.List;

/**
 * @author CRQ
 */
public interface TopicService {
    /**
     * 查询所有
     * @return List<Topic>
     */
    List<Topic> queryAll();

    /**
     * 新增
     * @param topic
     */
    void addTopic(Topic topic);

    /**
     * 批量插入
     * @param topics
     * @return
     */
    int[] batchInsert(List<Topic> topics);

}
