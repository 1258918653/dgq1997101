package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get/set,��Ҫ�Ĺ��췽��,toString(),
@Data
@NoArgsConstructor   //�޲ι��췽��
@AllArgsConstructor  //ȫ�ι���
public class Item {
	private Integer id;
	private String name;
	private Integer number;

}
