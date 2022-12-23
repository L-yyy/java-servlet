package com.itly.mapper;

import com.itly.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /**
     * 添加数据
     * @param brand
     */
    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(@Param("ids") int[] ids);


    /**
     * 根据id删除
     * @param id
     */
    void deleteById(int id);


    /**
     * 修改数据
     * @param brand
     */
    void update(Brand brand);

    /**
     * 分页查询,现在弃用
     * @param begin
     * @param size
     * @return
     */
    @Select("select * from tb_brand limit #{begin} , #{size}")
    @ResultMap("brandResultMap")
    List<Brand> selectByPage(@Param("begin") int begin,@Param("size") int size);


    // 加上查询，这里就是动态SQL，需要使用XML来编写
    List<Brand> selectByPageAndCondition(@Param("begin") int begin,@Param("size") int size,@Param("brand") Brand brand);

    /**
     * 查询总记录数,现在弃用
     * @return
     */
    @Select("select count(*) from tb_brand")
    int selectTotalCount();

    //更改后对应SQL也在XML中写，根据条件查询总记录数
    int selectTotalCountByCondition(Brand brand);
}
