package com.ncu.building.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ncu.building.model.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 角色
 *
 * @author Knox 2020/11/7
 */
@Mapper
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {
}
