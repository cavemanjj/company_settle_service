package com.xxx.controller;


import com.xxx.common.R;
import com.xxx.entity.CompanyInfo;
import com.xxx.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    /**
     * 新增企业信息
     * @param companyInfo
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody CompanyInfo companyInfo){
        companyService.save(companyInfo);
        return R.success("新增企业信息成功");
    }

    @PutMapping
    public R<String> update(@RequestBody CompanyInfo companyInfo){
        companyService.updateById(companyInfo);
        return R.success("修改企业信息成功");
    }
}
