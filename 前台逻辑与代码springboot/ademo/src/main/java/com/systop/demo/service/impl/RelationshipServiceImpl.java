package com.systop.demo.service.impl;

import com.systop.demo.mapper.RelationshipMapper;
import com.systop.demo.pojo.Relationship;
import com.systop.demo.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.RelationService;

@Service
@Transactional
public class RelationshipServiceImpl implements RelationshipService {
    @Autowired
    private RelationshipMapper relationshipMapper;


    @Override
    public int readd(Integer relationship_user_id, Integer relationship_author_id) {
        return relationshipMapper.readd(relationship_user_id,relationship_author_id);
    }

    @Override
    public int redel(Integer relationship_user_id, Integer relationship_author_id) {
        return relationshipMapper.redel(relationship_user_id,relationship_author_id);
    }

}
