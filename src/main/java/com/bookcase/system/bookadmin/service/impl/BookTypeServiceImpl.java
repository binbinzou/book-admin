/**
 * Project Name:book-basemgmt
 * File Name:BookTypeServiceImpl.java
 * Package Name:com.bookcase.system.bookbasemgmt.service.impl
 * Date:2017年5月24日下午8:57:00
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.service.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcase.common.bookcommon.contant.CommonResultCodeConstant;
import com.bookcase.common.system.bookframework.page.PageInfo;
import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookadmin.client.BaseBookTypeClient;
import com.bookcase.system.bookadmin.service.BookTypeService;
import com.bookcase.system.bookbasemgmt.dto.booktype.BookTypeReqBody;
import com.bookcase.system.bookbasemgmt.dto.booktype.BookTypeReqParam;
import com.bookcase.system.bookbasemgmt.dto.booktype.BookTypeReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspBody;
import com.bookcase.system.bookbasemgmt.otd.booktype.BookTypeRspBody;

/**
 * ClassName:BookTypeServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午8:57:00 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookTypeServiceImpl implements BookTypeService {

	@Autowired
	BaseBookTypeClient baseBooktypeClient;
	
	@Override
	public GeneralPagingResult<List<BookTypeRspBody>> findBookTypes(BookTypeReqQuery query,
			String page, String size) {
		return baseBooktypeClient.findBookTypes(query,page,size);
	}

	@Override
	public GeneralContentResult<BookTypeRspBody> findBookTypeById(
			String bookTypeId) {
		return baseBooktypeClient.findBookTypeById(bookTypeId);
	}

	@Override
	public GeneralContentResult<String> createBookType(
			BookTypeReqBody bookTypeReqBody) {
		return baseBooktypeClient.createBookType(bookTypeReqBody);
	}

	@Override
	public GeneralResult updateBookType(String bookTypeId,
			BookTypeReqBody bookTypeReqBody) {
		return baseBooktypeClient.updateBookType(bookTypeId,bookTypeReqBody);
	}

	@Override
	public GeneralResult deleteBookTypes(String bookTypeId) {
		return baseBooktypeClient.deleteBookTypes(bookTypeId);
	}

	@Override
	public GeneralContentResult<List<BookTypeRspBody>> findBookTypeByName(String name) {
		return baseBooktypeClient.findBookTypeByName(name);
	}

}

