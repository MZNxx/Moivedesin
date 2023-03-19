package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("swipper")
public class Swipper {
    @TableId("sid")
    @ApiModelProperty("轮播图id")
    private int sid;
    @ApiModelProperty("轮播图名称")
    private String sname;
    @ApiModelProperty("轮播图url")
    private String simg;
    @ApiModelProperty("轮播图资讯url")
    private String surl;
    @ApiModelProperty("轮播图关联文章id")
    private int said;
}
