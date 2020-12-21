package com.blog.dao;/*
 *@author Goddran
 *@date   2020/9/21{TIME}
 *@version 1.0
 */

import com.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Long> {


    Type findByName(String name);


    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);

}
