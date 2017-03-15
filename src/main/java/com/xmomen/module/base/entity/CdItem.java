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
@Table(name = "cd_item")
public class CdItem extends BaseMybatisModel {
    /**
     * 
     */
    private Integer id;

    /**
     * 产品编号
     */
    private String itemCode;

    /**
     * 产品归属的类别
     */
    private Integer cdCategoryId;

    /**
     * 产品名称
     */
    private String itemName;

    /**
     * 产品描述
     */
    private String itemDescribe;

    /**
     * 产品类型(1-常规商品，2-组合商品)
     */
    private Integer itemType;

    /**
     * 生产地
     */
    private String yieldly;

    /**
     * 产品规格
     */
    private String spec;

    /**
     * 基础价格
     */
    private BigDecimal basePrice;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    /**
     * 计价方式
     */
    private String pricingManner;

    /**
     * 0-下架 1-上架
     */
    private Integer sellStatus;

    /**
     * 销售单位
     */
    private String sellUnit;

    /**
     * 销售金额
     */
    private BigDecimal sellPrice;

    /**
     * 0-未审核，1-审核
     */
    private Integer isAudit;

    /**
     * 录入时间
     */
    private Date createDateTime;

    /**
     * 录入人
     */
    private String createUserCode;

    /**
     * 采摘人
     */
    private String caizaiUser;

    /**
     * 检测人
     */
    private String jianceUser;

    /**
     * 农残率
     */
    private String nongCanLv;

    /**
     * 营养成分
     */
    private String yiYangChenFen;

    /**
     * 保质期
     */
    private Integer baoZhiQi;

    /**
     * 适应人群
     */
    private String shiYiRenQun;

    /**
     * 限时抢购
     */
    private Integer xianShiQiangGou;

    /**
     * 新品尝鲜
     */
    private Integer xinPinChangXian;

    /**
     * 热卖推荐
     */
    private Integer reMaiTuiJian;

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

    @Column(name = "CD_CATEGORY_ID")
    public Integer getCdCategoryId() {
        return cdCategoryId;
    }

    public void setCdCategoryId(Integer cdCategoryId) {
        this.cdCategoryId = cdCategoryId;
        if(cdCategoryId == null){
              removeValidField("cdCategoryId");
              return;
        }
        addValidField("cdCategoryId");
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

    @Column(name = "ITEM_DESCRIBE")
    public String getItemDescribe() {
        return itemDescribe;
    }

    public void setItemDescribe(String itemDescribe) {
        this.itemDescribe = itemDescribe;
        if(itemDescribe == null){
              removeValidField("itemDescribe");
              return;
        }
        addValidField("itemDescribe");
    }

    @Column(name = "ITEM_TYPE")
    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
        if(itemType == null){
              removeValidField("itemType");
              return;
        }
        addValidField("itemType");
    }

    @Column(name = "YIELDLY")
    public String getYieldly() {
        return yieldly;
    }

    public void setYieldly(String yieldly) {
        this.yieldly = yieldly;
        if(yieldly == null){
              removeValidField("yieldly");
              return;
        }
        addValidField("yieldly");
    }

    @Column(name = "SPEC")
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
        if(spec == null){
              removeValidField("spec");
              return;
        }
        addValidField("spec");
    }

    @Column(name = "BASE_PRICE")
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        if(basePrice == null){
              removeValidField("basePrice");
              return;
        }
        addValidField("basePrice");
    }

    @Column(name = "MEMBER_PRICE")
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
        if(memberPrice == null){
              removeValidField("memberPrice");
              return;
        }
        addValidField("memberPrice");
    }

    @Column(name = "PRICING_MANNER")
    public String getPricingManner() {
        return pricingManner;
    }

    public void setPricingManner(String pricingManner) {
        this.pricingManner = pricingManner;
        if(pricingManner == null){
              removeValidField("pricingManner");
              return;
        }
        addValidField("pricingManner");
    }

    @Column(name = "SELL_STATUS")
    public Integer getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
        if(sellStatus == null){
              removeValidField("sellStatus");
              return;
        }
        addValidField("sellStatus");
    }

    @Column(name = "SELL_UNIT")
    public String getSellUnit() {
        return sellUnit;
    }

    public void setSellUnit(String sellUnit) {
        this.sellUnit = sellUnit;
        if(sellUnit == null){
              removeValidField("sellUnit");
              return;
        }
        addValidField("sellUnit");
    }

    @Column(name = "SELL_PRICE")
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
        if(sellPrice == null){
              removeValidField("sellPrice");
              return;
        }
        addValidField("sellPrice");
    }

    @Column(name = "IS_AUDIT")
    public Integer getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
        if(isAudit == null){
              removeValidField("isAudit");
              return;
        }
        addValidField("isAudit");
    }

    @Column(name = "CREATE_DATE_TIME")
    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
        if(createDateTime == null){
              removeValidField("createDateTime");
              return;
        }
        addValidField("createDateTime");
    }

    @Column(name = "CREATE_USER_CODE")
    public String getCreateUserCode() {
        return createUserCode;
    }

    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
        if(createUserCode == null){
              removeValidField("createUserCode");
              return;
        }
        addValidField("createUserCode");
    }

    @Column(name = "CAIZAI_USER")
    public String getCaizaiUser() {
        return caizaiUser;
    }

    public void setCaizaiUser(String caizaiUser) {
        this.caizaiUser = caizaiUser;
        if(caizaiUser == null){
              removeValidField("caizaiUser");
              return;
        }
        addValidField("caizaiUser");
    }

    @Column(name = "JIANCE_USER")
    public String getJianceUser() {
        return jianceUser;
    }

    public void setJianceUser(String jianceUser) {
        this.jianceUser = jianceUser;
        if(jianceUser == null){
              removeValidField("jianceUser");
              return;
        }
        addValidField("jianceUser");
    }

    @Column(name = "NONG_CAN_LV")
    public String getNongCanLv() {
        return nongCanLv;
    }

    public void setNongCanLv(String nongCanLv) {
        this.nongCanLv = nongCanLv;
        if(nongCanLv == null){
              removeValidField("nongCanLv");
              return;
        }
        addValidField("nongCanLv");
    }

    @Column(name = "YI_YANG_CHEN_FEN")
    public String getYiYangChenFen() {
        return yiYangChenFen;
    }

    public void setYiYangChenFen(String yiYangChenFen) {
        this.yiYangChenFen = yiYangChenFen;
        if(yiYangChenFen == null){
              removeValidField("yiYangChenFen");
              return;
        }
        addValidField("yiYangChenFen");
    }

    @Column(name = "BAO_ZHI_QI")
    public Integer getBaoZhiQi() {
        return baoZhiQi;
    }

    public void setBaoZhiQi(Integer baoZhiQi) {
        this.baoZhiQi = baoZhiQi;
        if(baoZhiQi == null){
              removeValidField("baoZhiQi");
              return;
        }
        addValidField("baoZhiQi");
    }

    @Column(name = "SHI_YI_REN_QUN")
    public String getShiYiRenQun() {
        return shiYiRenQun;
    }

    public void setShiYiRenQun(String shiYiRenQun) {
        this.shiYiRenQun = shiYiRenQun;
        if(shiYiRenQun == null){
              removeValidField("shiYiRenQun");
              return;
        }
        addValidField("shiYiRenQun");
    }

    @Column(name = "XIAN_SHI_QIANG_GOU")
    public Integer getXianShiQiangGou() {
        return xianShiQiangGou;
    }

    public void setXianShiQiangGou(Integer xianShiQiangGou) {
        this.xianShiQiangGou = xianShiQiangGou;
        if(xianShiQiangGou == null){
              removeValidField("xianShiQiangGou");
              return;
        }
        addValidField("xianShiQiangGou");
    }

    @Column(name = "XIN_PIN_CHANG_XIAN")
    public Integer getXinPinChangXian() {
        return xinPinChangXian;
    }

    public void setXinPinChangXian(Integer xinPinChangXian) {
        this.xinPinChangXian = xinPinChangXian;
        if(xinPinChangXian == null){
              removeValidField("xinPinChangXian");
              return;
        }
        addValidField("xinPinChangXian");
    }

    @Column(name = "RE_MAI_TUI_JIAN")
    public Integer getReMaiTuiJian() {
        return reMaiTuiJian;
    }

    public void setReMaiTuiJian(Integer reMaiTuiJian) {
        this.reMaiTuiJian = reMaiTuiJian;
        if(reMaiTuiJian == null){
              removeValidField("reMaiTuiJian");
              return;
        }
        addValidField("reMaiTuiJian");
    }
}