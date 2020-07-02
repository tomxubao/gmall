package com.gmall.xb.gmalluser.service.impl;

import com.gmall.xb.gmalluser.bean.UmsMember;
import com.gmall.xb.gmalluser.bean.UmsMemberReceiveAddress;
import com.gmall.xb.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.xb.gmalluser.mapper.UserMapper;
import com.gmall.xb.gmalluser.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        //创建实体类
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
//       // List<UmsMemberReceiveAddress> umsMemberReceiveAddressMappers = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddressMappers = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressMappers = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddressMappers;


    }
}
