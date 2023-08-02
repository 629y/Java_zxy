package cn.zxy.model;

import lombok.Data;

@Data
public class StudentInfoQuery {

    private Integer id;
    private Integer[] ids;
    private String name;
    private String gender;
    private String tel;

//    private Integer pageNum;
//    private Integer pageSize;


}
