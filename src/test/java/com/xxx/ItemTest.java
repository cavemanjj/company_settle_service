package com.xxx;

import com.xxx.entity.CompanyInfo;
import com.xxx.mapper.CompanyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemTest {

    @Autowired
    private CompanyMapper companyMapper;

    @Test
    public void testSelectList(){
        List<CompanyInfo> companyInfos = companyMapper.selectList(null);
        for (CompanyInfo companyInfo : companyInfos) {

            System.out.println("companyInfo = " + companyInfo);
        }
    }

}
