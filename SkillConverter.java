package com.sreeluck.demo.converter;

import com.sreeluck.demo.dto.SkillDto;
import com.sreeluck.demo.entity.Skill;

/**
 * @author sxm147
 *
 */
public class SkillConverter {
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}
}
