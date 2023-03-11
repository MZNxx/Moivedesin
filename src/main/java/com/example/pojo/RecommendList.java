package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

@TableName("recommend")
public class RecommendList {
    @TableId("rid")
    private int rid;
    @ApiModelProperty("榜单排行")
    private String rno;
    @ApiModelProperty("图片地址")
    private String rimg;
    @ApiModelProperty("电影标题")
    private String rtitle;
    @ApiModelProperty("电影详解")
    private String rcontent;

    @Override
    public String toString() {
        return "RecommendList{" +
                "rid=" + rid +
                ", rno='" + rno + '\'' +
                ", rimg='" + rimg + '\'' +
                ", rtitle='" + rtitle + '\'' +
                ", rcontent='" + rcontent + '\'' +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getRimg() {
        return rimg;
    }

    public void setRimg(String rimg) {
        this.rimg = rimg;
    }

    public String getRtitle() {
        return rtitle;
    }

    public void setRtitle(String rtitle) {
        this.rtitle = rtitle;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }
}
