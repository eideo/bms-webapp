package com.xmomen.module.base.entity;

import com.xmomen.framework.mybatis.model.BaseMybatisModel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "cd_bind")
public class CdBind extends BaseMybatisModel {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 微信唯一识别号
     */
    private String openId;

    @Column(name = "ID")
    @Id
    @GeneratedValue(generator = "UUIDGenerator")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        if(id == null){
              removeValidField("id");
              return;
        }
        addValidField("id");
    }

    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        if(phone == null){
              removeValidField("phone");
              return;
        }
        addValidField("phone");
    }

    @Column(name = "OPEN_ID")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
        if(openId == null){
              removeValidField("openId");
              return;
        }
        addValidField("openId");
    }
}