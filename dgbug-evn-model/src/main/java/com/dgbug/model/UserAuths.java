package com.dgbug.model;

import java.util.Date;

public class UserAuths {
    private Long id;

    private Long userId;

    private String identityType;

    private String identifier;

    private String credential;

    private Boolean authsType;

    private Boolean verified;

    private Date verifiedTime;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    public Boolean getAuthsType() {
        return authsType;
    }

    public void setAuthsType(Boolean authsType) {
        this.authsType = authsType;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Date getVerifiedTime() {
        return verifiedTime;
    }

    public void setVerifiedTime(Date verifiedTime) {
        this.verifiedTime = verifiedTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}