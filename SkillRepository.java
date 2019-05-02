package com.sreeluck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreeluck.demo.entity.Skill;


/**
 * @author sxm147
 *
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
}
