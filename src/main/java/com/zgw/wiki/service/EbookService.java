package com.zgw.wiki.service;

import com.zgw.wiki.domain.Ebook;
import com.zgw.wiki.domain.EbookExample;
import com.zgw.wiki.mapper.EbookMapper;
import com.zgw.wiki.req.EbookReq;
import com.zgw.wiki.resp.EbookResp;
import com.zgw.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
    public List<Ebook> list(String name){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+name+"%");
        return ebookMapper.selectByExample(ebookExample);
    }
    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList=ebookMapper.selectByExample(ebookExample);
        List<EbookResp> ebookResps = CopyUtil.copyList(ebookList, EbookResp.class);
        return ebookResps;
    }
}
