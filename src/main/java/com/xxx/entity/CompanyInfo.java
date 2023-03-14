package com.xxx.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class CompanyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idQyrz;

    private String qyType;

    private Date qyrzTime;

    private Date zldqTime;

    private String idLy;

    private String idRoom;

    private Double rzArea;

    private Double rzPrice;

    private Integer lsLive;

    private Date qyblTime;

    @TableField(fill = FieldFill.INSERT) //插入时填充字段
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE) //插入和更新时填充字段
    private LocalDateTime updateTime;

}
