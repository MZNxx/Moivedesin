package com.example.pojo.dto.recommend;


/**
 * 排行榜dto：返回推荐id、榜单排行、图片地址、电影名称、电影详解
 */
public class Rlistdto {
    private int rid;
    private String rno;
    private String rimg;
    private String rtitle;
    private String rcontent;

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
