package com.xmomen.module.order.entity;

import com.xmomen.framework.mybatis.model.BaseMybatisModel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tb_return_order_item")
public class TbReturnOrderItem extends BaseMybatisModel {
    /**
     * 
     */
    private Integer id;

    /**
     * 退货订单表主键
     */
    private Integer returnOrderId;

    /**
     * 商品代码
     */
    private String itemCode;

    /**
     * 商品退货数量
     */
    private Integer itemNumber;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 0-不需要 1-需要
     */
    private Integer isNeed;

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

    @Column(name = "RETURN_ORDER_ID")
    public Integer getReturnOrderId() {
        return returnOrderId;
    }

    public void setReturnOrderId(Integer returnOrderId) {
        this.returnOrderId = returnOrderId;
        if(returnOrderId == null){
              removeValidField("returnOrderId");
              return;
        }
        addValidField("returnOrderId");
    }

    @Column(name = "ITEM_CODE")
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
        if(itemCode == null){
              removeValidField("itemCode");
              return;
        }
        addValidField("itemCode");
    }

    @Column(name = "ITEM_NUMBER")
    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
        if(itemNumber == null){
              removeValidField("itemNumber");
              return;
        }
        addValidField("itemNumber");
    }

    @Column(name = "ITEM_NAME")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        if(itemName == null){
              removeValidField("itemName");
              return;
        }
        addValidField("itemName");
    }

    @Column(name = "IS_NEED")
    public Integer getIsNeed() {
        return isNeed;
    }

    public void setIsNeed(Integer isNeed) {
        this.isNeed = isNeed;
        if(isNeed == null){
              removeValidField("isNeed");
              return;
        }
        addValidField("isNeed");
    }
}