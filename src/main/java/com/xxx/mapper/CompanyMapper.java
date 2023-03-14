package com.xxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.entity.CompanyInfo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CompanyMapper extends BaseMapper<CompanyInfo> {
}
