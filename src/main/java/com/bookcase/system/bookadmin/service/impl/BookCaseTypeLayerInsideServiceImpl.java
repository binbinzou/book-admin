/**
 * Project Name:book-basemgmt
 * File Name:BookCaseTypeLayerInsideServiceImpl.java
 * Package Name:com.bookcase.system.bookbasemgmt.service.impl
 * Date:2017年5月6日下午2:37:24
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
import com.bookcase.system.bookadmin.client.BaseBookcaseTypeLayerinsideClient;
import com.bookcase.system.bookadmin.service.BookCaseTypeLayerInsideService;
import com.bookcase.system.bookbasemgmt.dto.bookcasetype.BookCaseTypeReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookcasetypelayerinside.BookCaseTypeLayerInsideReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcasetypelayerinside.BookCaseTypeLayerInsideReqParam;
import com.bookcase.system.bookbasemgmt.otd.bookcasetype.BookCaseTypeRspBody;
import com.bookcase.system.bookbasemgmt.otd.bookcasetypelayerinside.BookCaseTypeLayerInsideRspBody;

/**
 * ClassName:BookCaseTypeLayerInsideServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月6日 下午2:37:24 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookCaseTypeLayerInsideServiceImpl implements BookCaseTypeLayerInsideService{

	@Autowired
	BaseBookcaseTypeLayerinsideClient baseBookcaseTypeLayerinsideClient;
	
	@Override
	public GeneralPagingResult<List<BookCaseTypeLayerInsideRspBody>> findBookCaseTypeLayerInsides(
			String page, String size) {
		return baseBookcaseTypeLayerinsideClient.findBookCaseTypeLayerInsides(page,size);
	}

	@Override
	public GeneralContentResult<BookCaseTypeLayerInsideRspBody> findBookCaseTypeLayerInsideById(
			String bookCaseTypeLayerInsideId) {
		return baseBookcaseTypeLayerinsideClient.findBookCaseTypeLayerInsideById(bookCaseTypeLayerInsideId);
	}

	@Override
	public GeneralContentResult<String> createBookCaseTypeLayerInside(
			BookCaseTypeLayerInsideReqBody bookCaseTypeLayerInsideReqBody) {
		return baseBookcaseTypeLayerinsideClient.createBookCaseTypeLayerInside(bookCaseTypeLayerInsideReqBody);
	}

	@Override
	public GeneralResult updateBookCaseTypeLayerInside(
			String bookCaseTypeLayerInsideId,
			BookCaseTypeLayerInsideReqBody bookCaseTypeLayerInsideReqBody) {
		return baseBookcaseTypeLayerinsideClient.updateBookCaseTypeLayerInside(bookCaseTypeLayerInsideId,bookCaseTypeLayerInsideReqBody);
	}

	@Override
	public GeneralResult deleteBookCaseTypeLayerInsides(
			String bookCaseTypeLayerInsideId) {
		return baseBookcaseTypeLayerinsideClient.deleteBookCaseTypeLayerInsides(bookCaseTypeLayerInsideId);
	}

}

