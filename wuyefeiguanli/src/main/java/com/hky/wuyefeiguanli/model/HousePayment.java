package com.hky.wuyefeiguanli.model;

import java.math.BigDecimal;

public class HousePayment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOUSE_PAYMENT.HOUSE_ID
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    private BigDecimal houseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOUSE_PAYMENT.MOUTH
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    private String mouth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOUSE_PAYMENT.NEED_PAY
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    private BigDecimal needPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOUSE_PAYMENT.ACT_PAY
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    private BigDecimal actPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOUSE_PAYMENT.DEAL_ID
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    private BigDecimal dealId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOUSE_PAYMENT.HOUSE_ID
     *
     * @return the value of HOUSE_PAYMENT.HOUSE_ID
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public BigDecimal getHouseId() {
        return houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOUSE_PAYMENT.HOUSE_ID
     *
     * @param houseId the value for HOUSE_PAYMENT.HOUSE_ID
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public void setHouseId(BigDecimal houseId) {
        this.houseId = houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOUSE_PAYMENT.MOUTH
     *
     * @return the value of HOUSE_PAYMENT.MOUTH
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public String getMouth() {
        return mouth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOUSE_PAYMENT.MOUTH
     *
     * @param mouth the value for HOUSE_PAYMENT.MOUTH
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOUSE_PAYMENT.NEED_PAY
     *
     * @return the value of HOUSE_PAYMENT.NEED_PAY
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public BigDecimal getNeedPay() {
        return needPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOUSE_PAYMENT.NEED_PAY
     *
     * @param needPay the value for HOUSE_PAYMENT.NEED_PAY
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public void setNeedPay(BigDecimal needPay) {
        this.needPay = needPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOUSE_PAYMENT.ACT_PAY
     *
     * @return the value of HOUSE_PAYMENT.ACT_PAY
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public BigDecimal getActPay() {
        return actPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOUSE_PAYMENT.ACT_PAY
     *
     * @param actPay the value for HOUSE_PAYMENT.ACT_PAY
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public void setActPay(BigDecimal actPay) {
        this.actPay = actPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOUSE_PAYMENT.DEAL_ID
     *
     * @return the value of HOUSE_PAYMENT.DEAL_ID
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public BigDecimal getDealId() {
        return dealId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOUSE_PAYMENT.DEAL_ID
     *
     * @param dealId the value for HOUSE_PAYMENT.DEAL_ID
     *
     * @mbg.generated Sun Aug 20 20:51:55 CST 2017
     */
    public void setDealId(BigDecimal dealId) {
        this.dealId = dealId;
    }
}