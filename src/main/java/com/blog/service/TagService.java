package com.blog.service;/*
 *@author Goddran
 *@date   2020/9/23{TIME}
 *@version 1.0
 */

import com.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(Integer size);

    List<Tag> listTag(String ids);

    Tag updataTag(Long id, Tag tag);

    void deleteTag(Long id);
}
