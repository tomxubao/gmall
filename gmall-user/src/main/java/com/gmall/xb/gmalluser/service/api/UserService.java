package com.gmall.xb.gmalluser.service.api;

import com.gmall.xb.gmalluser.bean.UmsMember;
import com.gmall.xb.gmalluser.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
