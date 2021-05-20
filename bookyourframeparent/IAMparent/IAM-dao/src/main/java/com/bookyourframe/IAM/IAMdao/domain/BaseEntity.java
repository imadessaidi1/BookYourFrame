package com.bookyourframe.IAM.IAMdao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mac on 25/03/2020.
 */
@Entity
public class BaseEntity {
    @Id
    Integer id;
    @Column
    Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
