package com.jk.mapper;

import com.jk.model.Post;
import com.jk.model.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 微星 on 2018/5/7.
 */
@Mapper
public interface PostMapper {


    @Select("select * from t_post")
    List<Post> queryPost();

    @Insert("insert into t_post values(#(postname),#(positionid),#(postnr),#(userid),#(bmid),#(shanchuid))")
    void insertPost(@Param("post") Post post);


    @Select("select * from t_shop")
    List queryShop(Shop shop);
}
