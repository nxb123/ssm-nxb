package com.jk.service;

import com.jk.model.Post;
import com.jk.model.Shop;

import java.util.List;

/**
 * Created by 微星 on 2018/5/7.
 */
public interface PostService {

    List<Post> queryPost();

    void insertPost(Post post);

    List queryShop(Shop shop);
}
