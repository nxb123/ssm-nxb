package com.jk.service.Impl;

import com.jk.mapper.PostMapper;
import com.jk.model.Post;
import com.jk.model.Shop;
import com.jk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 微星 on 2018/5/7.
 */
@Service
public class PostServiceImpl implements PostService{


    @Autowired
    private PostMapper postmapper;


    @Override
    public List<Post> queryPost() {


        return postmapper.queryPost();
    }

    @Override
    public void insertPost(Post post) {

        postmapper.insertPost(post);
    }

    @Override
    public List queryShop(Shop shop) {
        return postmapper.queryShop(shop);
    }
}
