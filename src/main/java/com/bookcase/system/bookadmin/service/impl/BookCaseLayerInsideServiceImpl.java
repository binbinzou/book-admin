/**
 * Project Name:book-coredatemgmt
 * File Name:BookTypelaer.java
 * Package Name:com.bookcase.system.bookcoredatamgmt.service.impl
 * Date:2017年5月23日上午8:11:47
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.service.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcase.common.system.bookframework.page.PageInfo;
import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookadmin.client.CoredataBookcaseLayerinsideClient;
import com.bookcase.system.bookadmin.service.BookCaseLayerInsideService;
import com.bookcase.system.bookcoremgmt.dto.bookcaselayerinside.BookCaseLayerInsideReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookcaselayerinside.BookCaseLayerInsideReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookcase.BookCaseRspBody;
import com.bookcase.system.bookcoremgmt.otd.bookcaselayerinside.BookCaseLayerInsideRspBody;

/**
 * ClassName:BookTypelaer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 上午8:11:47 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookCaseLayerInsideServiceImpl implements BookCaseLayerInsideService{

	@Autowired
	CoredataBookcaseLayerinsideClient coredataBookcaseLayerinsideClient;
	
	@Override
	public GeneralPagingResult<List<BookCaseLayerInsideRspBody>> findBookCaseLayerInsides(
			String page, String size) {
		return coredataBookcaseLayerinsideClient.findBookCaseLayerInsides(page,size);
	}

	@Override
	public GeneralContentResult<BookCaseLayerInsideRspBody> findBookCaseLayerInsideById(
			String bookCaseLayerInsideId) {
		return coredataBookcaseLayerinsideClient.findBookCaseLayerInsideById(bookCaseLayerInsideId);
	}

	@Override
	public GeneralContentResult<String> createBookCaseLayerInside(
			BookCaseLayerInsideReqBody layerInsideReqBody) {
		return coredataBookcaseLayerinsideClient.createBookCaseLayerInside(layerInsideReqBody);
	}

	@Override
	public GeneralResult updateBookCaseLayerInside(String bookCaseLayerInsideId,
			BookCaseLayerInsideReqBody layerInsideReqBody) {
		return coredataBookcaseLayerinsideClient.updateBookCaseLayerInside(bookCaseLayerInsideId,layerInsideReqBody);
	}

	@Override
	public GeneralResult deleteBookCaseLayerInsides(
			String bookCaseLayerInsideId) {
		return coredataBookcaseLayerinsideClient.deleteBookCaseLayerInsides(bookCaseLayerInsideId);
	}

}

