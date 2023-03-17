package com.example.service;

import com.example.pojo.Hotmovie;

import java.util.List;

public interface IndexService {
    /**
     * 表：swipper
     * 用途：该方法用于查找swipper表中的simg数据
     * @author xx
     */
    List<String> selectByC();

    /**
     * 表：hotmovie
     * 用途：拿到hotmovie中的所有数据
     */
    List<Hotmovie> selectAll();
}
