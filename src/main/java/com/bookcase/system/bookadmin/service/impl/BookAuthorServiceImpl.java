/**
 * Project Name:book-basemgmt
 * File Name:BookAuthorServiceImpl.java
 * Package Name:com.bookcase.system.bookbasemgmt.service.impl
 * Date:2017年5月24日下午8:51:38
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
import com.bookcase.system.bookadmin.client.BaseBookAuthorClient;
import com.bookcase.system.bookadmin.service.BookAuthorService;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookauthor.BookAuthorReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspBody;
import com.bookcase.system.bookbasemgmt.otd.bookcasetype.BookCaseTypeRspBody;

/**
 * ClassName:BookAuthorServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午8:51:38 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookAuthorServiceImpl implements BookAuthorService {

	@Autowired
	BaseBookAuthorClient baseBookAuthorClient;
	
	@Override
	public GeneralPagingResult<List<BookAuthorRspBody>> findBookAuthors(BookAuthorReqQuery query,
			String page, String size) {
		return baseBookAuthorClient.findBookAuthors(query,page,size);
	}

	@Override
	public GeneralContentResult<BookAuthorRspBody> findBookAuthorById(
			String authodId) {
		return baseBookAuthorClient.findBookAuthorById(authodId);
	}

	@Override
	public GeneralContentResult<String> createBookAuthor(
			BookAuthorReqBody bookAuthorReqBody) {
		return baseBookAuthorClient.createBookAuthor(bookAuthorReqBody);
	}

	@Override
	public GeneralResult updateBookAuthor(String authodId,
			BookAuthorReqBody bookAuthorReqBody) {
		return baseBookAuthorClient.updateBookAuthor(authodId,bookAuthorReqBody);
	}

	@Override
	public GeneralResult deleteBookAuthors(String anthorId) {
		return baseBookAuthorClient.deleteBookAuthors(anthorId);
	}

	@Override
	public GeneralContentResult<List<BookAuthorRspBody>> findBookAuthorByName(
			String name) {
		return baseBookAuthorClient.findBookAuthorByName(name);
	}

}

