/**
 * Project Name:book-basemgmt
 * File Name:BookCaseTypeServiceImpl.java
 * Package Name:com.bookcase.system.bookbasemgmt.service.impl
 * Date:2017年5月6日下午12:37:44
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
import com.bookcase.system.bookadmin.service.BookCaseTypeService;
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookcasetype.BookCaseTypeRspBody;

/**
 * ClassName:BookCaseTypeServiceImpl <br/>
 * Function: 图书柜类别service实现类. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年5月6日 下午12:37:44 <br/>
 * 
 * @author binbin
 * @version
 * @since JDK 1.8
 * @see
 */
@Service
@Slf4j
public class BookCaseTypeServiceImpl implements BookCaseTypeService {


	@Override
	public GeneralPagingResult<List<BookCaseTypeRspBody>> findBookCaseTypes(BookCaseTypeReqQuery query,
			String page, String size) {
				return null;
	}

	@Override
	public GeneralContentResult<BookCaseTypeRspBody> findBookCaseTypeById(
			String bookcasetypeId) {
				return null;
	}

	@Override
	public GeneralContentResult<String> createBookCaseType(
			BookCaseTypeReqBody bookCaseTypeReqBody) {
				return null;
	}

	@Override
	public GeneralResult updateBookCaseType(String bookcasetypeId,
			BookCaseTypeReqBody bookCaseTypeReqBody) {
				return null;
	}

	@Override
	public GeneralResult deleteBookCaseTypes(
			BookCaseTypeReqParam bookCaseTypeReqParam) {
				return null;
	}

	@Override
	public GeneralContentResult<List<BookCaseTypeRspBody>> findBookCaseTypeByName(
			String name) {
				return null;
	}

}
