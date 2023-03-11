package com.example.pojo.dto.index;

import java.util.ArrayList;
import java.util.List;

/**
 * 轮播图dto：返回zyj表中的mposter值
 */
public class MposterDTO {
    private String mposter;

    public List<String> setM(List<String> list){
        List<String> List = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List.add(list.get(i));
        }
        return List;
    }
    public String getMposter() {
        return mposter;
    }

    public void setMposter(String mposter) {
        this.mposter = mposter;
    }
}
