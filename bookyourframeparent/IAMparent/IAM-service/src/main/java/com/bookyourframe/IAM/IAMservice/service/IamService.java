package com.bookyourframe.IAM.IAMservice.service;

import com.bookyourframe.IAM.IAMservice.dto.UserDTO;
import com.bookyourframe.IAM.IAMservice.exception.UserNotFoundException;

/**
 * Created by mac on 20/03/2020.
 */
public interface IamService {

    public UserDTO authetifyUser(String logging, String password) throws UserNotFoundException;
}
