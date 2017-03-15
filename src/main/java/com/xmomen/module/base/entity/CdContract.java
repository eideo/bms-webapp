package com.xmomen.module.base.entity;

import com.xmomen.framework.mybatis.model.BaseMybatisModel;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "cd_contract")
public class CdContract extends BaseMybatisModel {
    /**
     * 
     */
    private Integer id;

    /**
     * 合同编号
     */
    private String contractCode;

    /**
     * 合同名称
     */
    private String contractName;

    /**
     * 合同价的客户
     */
    private Integer cdMemberId;

    /**
     * 合同价的单位
     */
    private Integer cdCompanyId;

    /**
     * 1-部分产品，2-全部产品
     */
    private Integer scope;

    /**
     * 仅当适用范围为全部产品时适用
     */
    private BigDecimal contractPrice;

    /**
     * 合同开始时间
     */
    private Date beginTime;

    /**
     * 合同结束时间
     */
    private Date endTime;

    /**
     * 0-未作废，1-作废
     */
    private Integer isDel;

    /**
     * 0-未审核，1-审核
     */
    private Integer isAuditor;

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

    @Column(name = "CONTRACT_CODE")
    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
        if(contractCode == null){
              removeValidField("contractCode");
              return;
        }
        addValidField("contractCode");
    }

    @Column(name = "CONTRACT_NAME")
    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
        if(contractName == null){
              removeValidField("contractName");
              return;
        }
        addValidField("contractName");
    }

    @Column(name = "CD_MEMBER_ID")
    public Integer getCdMemberId() {
        return cdMemberId;
    }

    public void setCdMemberId(Integer cdMemberId) {
        this.cdMemberId = cdMemberId;
        if(cdMemberId == null){
              removeValidField("cdMemberId");
              return;
        }
        addValidField("cdMemberId");
    }

    @Column(name = "CD_COMPANY_ID")
    public Integer getCdCompanyId() {
        return cdCompanyId;
    }

    public void setCdCompanyId(Integer cdCompanyId) {
        this.cdCompanyId = cdCompanyId;
        if(cdCompanyId == null){
              removeValidField("cdCompanyId");
              return;
        }
        addValidField("cdCompanyId");
    }

    @Column(name = "SCOPE")
    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
        if(scope == null){
              removeValidField("scope");
              return;
        }
        addValidField("scope");
    }

    @Column(name = "CONTRACT_PRICE")
    public BigDecimal getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(BigDecimal contractPrice) {
        this.contractPrice = contractPrice;
        if(contractPrice == null){
              removeValidField("contractPrice");
              return;
        }
        addValidField("contractPrice");
    }

    @Column(name = "BEGIN_TIME")
    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
        if(beginTime == null){
              removeValidField("beginTime");
              return;
        }
        addValidField("beginTime");
    }

    @Column(name = "END_TIME")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
        if(endTime == null){
              removeValidField("endTime");
              return;
        }
        addValidField("endTime");
    }

    @Column(name = "IS_DEL")
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
        if(isDel == null){
              removeValidField("isDel");
              return;
        }
        addValidField("isDel");
    }

    @Column(name = "IS_AUDITOR")
    public Integer getIsAuditor() {
        return isAuditor;
    }

    public void setIsAuditor(Integer isAuditor) {
        this.isAuditor = isAuditor;
        if(isAuditor == null){
              removeValidField("isAuditor");
              return;
        }
        addValidField("isAuditor");
    }
}