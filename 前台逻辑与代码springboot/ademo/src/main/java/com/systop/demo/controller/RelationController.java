package com.systop.demo.controller;

import com.systop.demo.pojo.Relationship;
import com.systop.demo.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class RelationController {
    @Autowired
    private RelationshipService relationshipservice;
    @RequestMapping(value ="/readd/{relationship_user_id}/{relationship_author_id}", method = RequestMethod.POST)
    public @ResponseBody Integer relationshipadd(@PathVariable("relationship_user_id")Integer relationship_user_id,@PathVariable("relationship_author_id") Integer relationship_author_id)throws Exception {
        Integer row=relationshipservice.readd(relationship_user_id,relationship_author_id);
        return row;
    }
    @RequestMapping(value ="/redel/{relationship_user_id}/{relationship_author_id}", method = RequestMethod.POST)
    public @ResponseBody Integer relationshipdel(@PathVariable("relationship_user_id")Integer relationship_user_id,@PathVariable("relationship_author_id") Integer relationship_author_id)throws Exception {
        Integer row=relationshipservice.redel(relationship_user_id,relationship_author_id);
        return row;
    }
}
