package com.hky.wuyefeiguanli.dao;

import com.hky.wuyefeiguanli.model.DealList;
import com.hky.wuyefeiguanli.model.DealListExample;
import com.hky.wuyefeiguanli.model.DealListWithBLOBs;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeqMapper {
    public BigDecimal nextSeqOfHouseId();
    public BigDecimal nextSeqOfDealId();
}