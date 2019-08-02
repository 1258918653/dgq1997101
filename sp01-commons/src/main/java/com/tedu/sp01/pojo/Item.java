package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get/set,必要的构造方法,toString(),
@Data
@NoArgsConstructor   //无参构造方法
@AllArgsConstructor  //全参构造
public class Item {
	private Integer id;
	private String name;
	private Integer number;

}
