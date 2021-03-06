package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entity.Forum;

import java.util.List;

/**
 * @author CRQ
 */
public abstract class ForumDAO {
    /**
     * 新增Forum
     * @param forum
     * @return
     */
    public abstract int insert(Forum forum);

    /**
     * 批量新增Forum
     * @param forums
     * @return
     */
    public abstract int[] batchInsert(List<Forum> forums);

    /**
     * 根据id删除Forum
     * @param forumId
     * @return
     */
    public abstract int delete(int forumId);

    /**
     * 修改Forum
     * @param forum
     * @return
     */
    public abstract int update(Forum forum);

    /**
     * 根据id查询Forum
     * @param forumId
     * @return
     */
    public abstract Forum get(int forumId);

    /**
     * 查询所有论坛信息
     * @return
     */
    public abstract List<Forum> selectAll();
}
