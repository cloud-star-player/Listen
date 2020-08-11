package com.systop.demo.service;

import com.systop.demo.pojo.Collect;

public interface RelationshipService {
    int readd(Integer relationship_user_id,Integer relationship_author_id);
    int redel(Integer relationship_user_id,Integer relationship_author_id);
}
