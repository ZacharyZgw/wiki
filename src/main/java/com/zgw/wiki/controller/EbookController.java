package com.zgw.wiki.controller;

import com.zgw.wiki.domain.Ebook;
import com.zgw.wiki.req.EbookReq;
import com.zgw.wiki.resp.CommonResp;
import com.zgw.wiki.resp.EbookResp;
import com.zgw.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        resp.setSuccess(true);
        return resp;

    }
    @GetMapping("/findByName")
    public CommonResp list(String name){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list(name);
        resp.setSuccess(true);
        resp.setContent(list);
        return resp;

    }

    @GetMapping("/getByObject")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setSuccess(true);
        resp.setContent(list);
        for (EbookResp ebookReq : list) {
            System.out.println(list);
        }
        return resp;
    }
}
