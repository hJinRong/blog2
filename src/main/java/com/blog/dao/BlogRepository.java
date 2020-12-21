package com.blog.dao;/*
 *@author Goddran
 *@date   2020/9/23{TIME}
 *@version 1.0
 */

import com.blog.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {

    @Query("select  b from  Blog b where b.recommend = true")
    List<Blog> findTop(Pageable pageable);

    //1表示传值给第一个参数
    @Query("select b from Blog b where b.title like ?1 or b.content like?1")
    Page<Blog> findByQuery(String query, Pageable pageable);

}
