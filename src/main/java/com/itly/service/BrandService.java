package com.itly.service;

import com.itly.pojo.Brand;
import com.itly.pojo.PageBean;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有
     * @return
     */
    List<Brand> selectAll();

    /**
     * 添加数据
     * @param brand
     */
    void add(Brand brand);


    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(int[] ids);

    /**
     * 通过id删除
     * @param id
     */
    void deleteByid(int id);

    /**
     * 修改数据
     * @param brand
     */
    void update(Brand brand);

    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param pageSize  每页展示条数
     * @return
     */
    PageBean<Brand> selectByPage(int currentPage,int pageSize);
}
