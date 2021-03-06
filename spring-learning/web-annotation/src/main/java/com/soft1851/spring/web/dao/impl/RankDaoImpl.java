package com.soft1851.spring.web.dao.impl;

import com.soft1851.spring.web.dao.RankDao;
import com.soft1851.spring.web.entity.Rank;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author CRQ
 */
@Repository
public class RankDaoImpl implements RankDao {


    private final JdbcTemplate jdbcTemplate;

    /**
     *
     * @param jdbcTemplate
     */
    public RankDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int[] batchInsert(List<Rank> ranks) {
        final List<Rank> rankList=ranks;
        String sql="INSERT INTO t_rank(author,pic,title,duration)"+
                "VALUES (?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                Rank rank = rankList.get(i);
                preparedStatement.setString(1, rank.getAuthor());
                preparedStatement.setString(2, rank.getPic());
                preparedStatement.setString(3, rank.getTitle());
                preparedStatement.setString(4, rank.getDuration());

            }

            @Override
            public int getBatchSize() {
                return rankList.size();
            }

        });
}
}
