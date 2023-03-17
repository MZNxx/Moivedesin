package com.example.pojo.dto.index;

import java.util.ArrayList;
import java.util.List;

/**
 * 轮播图dto：返回swipper表中的simg值
 */
public class SwipperDTO {
    private String simg;

    public List<String> setM(List<String> list){
        List<String> List = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List.add(list.get(i));
        }
        return List;
    }
    public String getMposter() {
        return simg;
    }

    public void setMposter(String mposter) {
        this.simg = simg;
    }
}
