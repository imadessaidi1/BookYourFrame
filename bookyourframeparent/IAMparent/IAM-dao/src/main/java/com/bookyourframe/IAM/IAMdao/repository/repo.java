package com.bookyourframe.IAM.IAMdao.repository;

import com.bookyourframe.IAM.IAMdao.domain.BaseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mac on 13/04/2020.
 */
@Repository
public interface repo extends CrudRepository<BaseEntity, Integer> {

    BaseEntity findById(long id);
}