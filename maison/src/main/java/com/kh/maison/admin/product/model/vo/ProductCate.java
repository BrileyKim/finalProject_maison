package com.kh.maison.admin.product.model.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ProductCate {

	private int productNo;
	private String productName;
	private String productSummary;
	private String productContent;
	private String productImg;
	private String productStatus;
	private int productStock;
	private int price;
	private String mediumCate;
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date productDate;
	private int defCycle;
	private String mcName;
	private String largeCate;
}
