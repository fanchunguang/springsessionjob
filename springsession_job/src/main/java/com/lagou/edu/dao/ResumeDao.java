package com.lagou.edu.dao;

import com.lagou.edu.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Jpa接口
 */
public interface ResumeDao extends JpaRepository<Resume,Long>, JpaSpecificationExecutor<Resume> {
    /**
     * 使用原生sql查询，将nativeQuery属性设置为true,默认为false
     * @return
     */
    @Query(value="select * from tb_resume",nativeQuery = true)
    List<Resume> findAll();

    /**
     * 方法命名规则
     */
    void deleteById(long id);

}
