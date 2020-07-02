package com.gmall.xb.gmalluser.mapper;

import com.gmall.xb.gmalluser.bean.UmsMember;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
    @Select({" select t.*  from ums_member t"})
    List<UmsMember> selectAllUser2();
}
