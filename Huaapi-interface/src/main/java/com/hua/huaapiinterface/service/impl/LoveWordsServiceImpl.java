package com.hua.huaapiinterface.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.huaapiinterface.mapper.LoveWordsMapper;
import com.hua.huaapiinterface.model.entity.LoveWords;

import com.hua.huaapiinterface.service.LoveWordsService;
import org.springframework.stereotype.Service;

/**
* @author MA_dou
* @description 针对表【love_words(情话)】的数据库操作Service实现
* @createDate 2023-03-20 12:57:36
*/
@Service
public class LoveWordsServiceImpl extends ServiceImpl<LoveWordsMapper, LoveWords>
    implements LoveWordsService {

}




