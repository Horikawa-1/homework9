package com.raisetech.homework9.mapper;


import java.util.List;
import java.util.Optional;
import com.raisetech.homework9.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper    // MyBatisのMapperである⽬印として@Mapperアノテーションを付与する
public interface NameMapper {     // classではなくinterfaceで定義する

  @Select("SELECT * FROM names")
  List<Name> findAll();

  @Select("SELECT * FROM names WHERE id = #{id}")
  Optional<Name> findById(int id);
}
