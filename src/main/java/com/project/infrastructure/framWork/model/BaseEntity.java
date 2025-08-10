package com.project.infrastructure.framWork.model;

import java.util.Date;

public class BaseEntity<T> {

    private T id;
    private Integer ip;
    private Long createdBy;
//  private BasePersonel personnel; TODO
    private Date createdAt;
    private Date updatedAt;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
