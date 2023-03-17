package com.example.service.impl;

import com.example.mapper.index.HotmoviceMapper;
import com.example.mapper.index.SwipperMapper;
import com.example.pojo.Hotmovie;
import com.example.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    private SwipperMapper swipperMapper;
    @Resource
    private HotmoviceMapper hotmoviceMapper;

    @Override
    public List<String> selectByC() {
        return swipperMapper.selectByC();
    }

    @Override
    public List<Hotmovie> selectAll() {
        return hotmoviceMapper.selectList(null);
    }


}
