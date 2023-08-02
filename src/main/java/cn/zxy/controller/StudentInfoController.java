package cn.zxy.controller;

import cn.zxy.model.StudentInfo;
import cn.zxy.model.StudentInfoQuery;
import cn.zxy.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/StudentInfo")
public class StudentInfoController {

    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping
    public List<StudentInfo> select(StudentInfoQuery query){
        return studentInfoService.select(query);
    }

    @PostMapping
    public Integer insert(@RequestBody StudentInfo studentInfo){
        return studentInfoService.insert(studentInfo);
    }

    @PutMapping
    public Integer update(@RequestBody StudentInfo studentInfo){
        return studentInfoService.update(studentInfo);
    }

    @DeleteMapping
    public Integer delete(Integer id){
        return studentInfoService.delete(id);
    }
}
