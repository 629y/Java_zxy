package cn.zxy.mapper;

import cn.zxy.annotation.Pagex;
import cn.zxy.model.StudentInfo;
import cn.zxy.model.StudentInfoQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentInfoMapper {

//    @Pagex
    List<StudentInfo> select(StudentInfoQuery query);

    int insert(StudentInfo studentInfo);
    //为了方便测试，所有用int类型做返回，一般不返回值

    int update(StudentInfo studentInfo);
    int delete(Integer id);

}
