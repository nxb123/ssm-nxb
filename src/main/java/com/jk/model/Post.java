package com.jk.model;

import java.io.Serializable;

/**
 * Created by 微星 on 2018/5/7.
 */
public class Post implements Serializable{

    private static final long serialVersionUID = 7060296054512533775L;
    private Integer postid;   //岗位id
    private String postname;   //岗位名称
    private Integer positionid; //  所属职务
    private String postnr;     //岗位描述
    private Integer userid;    //用户id
    private Integer bmid;      //部门id
    private Integer shanchuid;      //部门id

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public String getPostnr() {
        return postnr;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public Integer getShanchuid() {
        return shanchuid;
    }

    public void setShanchuid(Integer shanchuid) {
        this.shanchuid = shanchuid;
    }

    public Post(Integer postid, String postname, Integer positionid, String postnr, Integer userid, Integer bmid, Integer shanchuid) {
        this.postid = postid;
        this.postname = postname;
        this.positionid = positionid;
        this.postnr = postnr;
        this.userid = userid;
        this.bmid = bmid;
        this.shanchuid = shanchuid;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", postname='" + postname + '\'' +
                ", positionid=" + positionid +
                ", postnr='" + postnr + '\'' +
                ", userid=" + userid +
                ", bmid=" + bmid +
                ", shanchuid=" + shanchuid +
                '}';
    }
}
