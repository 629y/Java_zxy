package cn.zxy.service;

import cn.zxy.mapper.StudentInfoMapper;
import cn.zxy.model.StudentInfo;
import cn.zxy.model.StudentInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoService {
    @Autowired
    private StudentInfoMapper studentInfoMapper;


    public List<StudentInfo> select(StudentInfoQuery query){
        List<StudentInfo> selectList = studentInfoMapper.select(query);
        return selectList;
    }

    public Integer insert(StudentInfo studentInfo){
        return studentInfoMapper.insert(studentInfo);
    }

    public Integer update(StudentInfo studentInfo){
        return studentInfoMapper.update(studentInfo);
    }

    public Integer delete(Integer id){
        return studentInfoMapper.delete(id);
    }


}
