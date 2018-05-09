package com.jk.controller;

import com.jk.model.Post;
import com.jk.model.Shop;
import com.jk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 微星 on 2018/5/7.
 */

@Controller
@RequestMapping("postController")
//@RestController    Controller+ResponseBody  两个注解的集合
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("queryPost")
    @ResponseBody
    public String queryPost(){
        List<Post> querylist = postService.queryPost();


        return null;
    }

    public void insertPost(Post post){


        postService.insertPost(post);
    }

    @RequestMapping("queryShop")
    @ResponseBody
    public List queryShop(Shop shop){
        List querylist = postService.queryShop(shop);

        return querylist;

    }


}
