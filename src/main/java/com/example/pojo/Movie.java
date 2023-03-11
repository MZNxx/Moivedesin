package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("zyj")
public class Movie {
    @TableId("mid")
    @ApiModelProperty("编号")
    private Integer mid;
    @ApiModelProperty("电影名称")
    private String mname;
    @ApiModelProperty("电影海报")
    private String mposter;
    @ApiModelProperty("电影mv")
    private String  mmv;
    @ApiModelProperty("电影评分")
    private float  score;
//    @ApiModelProperty("电影类别")
//    private String  basicInfo;
//    @ApiModelProperty("上线日期")
//    private Date releaseDate;
    @ApiModelProperty("电影内容")
    private String content;
    @ApiModelProperty("资讯链接")
    private String url;

}
