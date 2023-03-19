package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("article")
public class Article {
    @TableId("aid")
    @ApiModelProperty("文章id")
    private int aid;
    @TableField("aimg")
    @ApiModelProperty("文章图片url")
    private String aimg;
    @TableField("author")
    @ApiModelProperty("文章作者")
    private String author;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField("createtime")
    @ApiModelProperty("发布时间")
    private Date createtime;
    @TableField("atitle")
    @ApiModelProperty("文章标题")
    private String atitle;
    @TableField("acontent")
    @ApiModelProperty("文章内容")
    private String acontent;
}
