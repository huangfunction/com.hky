package com.hky.wuyefeiguanli.dao;

import com.hky.wuyefeiguanli.model.HouseAccount;
import com.hky.wuyefeiguanli.model.HouseAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    long countByExample(HouseAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    int deleteByExample(HouseAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    int insert(HouseAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    int insertSelective(HouseAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    List<HouseAccount> selectByExample(HouseAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") HouseAccount record, @Param("example") HouseAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HOUSE_ACCOUNT
     *
     * @mbg.generated Sun Aug 20 20:51:56 CST 2017
     */
    int updateByExample(@Param("record") HouseAccount record, @Param("example") HouseAccountExample example);
}