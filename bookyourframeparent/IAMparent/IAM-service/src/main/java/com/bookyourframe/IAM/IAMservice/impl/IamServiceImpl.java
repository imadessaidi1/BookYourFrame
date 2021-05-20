package com.bookyourframe.IAM.IAMservice.impl;

import com.bookyourframe.IAM.IAMdao.domain.BaseEntity;
import com.bookyourframe.IAM.IAMservice.dto.UserDTO;
import com.bookyourframe.IAM.IAMservice.exception.UserNotFoundException;
import com.bookyourframe.IAM.IAMservice.service.IamService;
import org.springframework.stereotype.Service;

/**
 * Created by mac on 20/03/2020.
 */
@Service
public class IamServiceImpl implements IamService{
    @Override
    public UserDTO authetifyUser(String logging, String password) throws UserNotFoundException {
        BaseEntity baseEntity = new BaseEntity();
        return new UserDTO();
    }
}
