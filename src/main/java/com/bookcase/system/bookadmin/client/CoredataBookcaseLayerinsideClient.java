/**
 * Project Name:book-admin
 * File Name:CoredataBookcaseLayerinsideClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年7月1日下午4:49:04
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.client;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookcoremgmt.dto.bookcaselayerinside.BookCaseLayerInsideReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookcaselayerinside.BookCaseLayerInsideReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookcaselayerinside.BookCaseLayerInsideRspBody;

/**
 * ClassName:CoredataBookcaseLayerinsideClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月1日 下午4:49:04 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public interface CoredataBookcaseLayerinsideClient {

	@RequestMapping(value = "/auth/bookcaselayerinsides/page/{page}/size/{size}", method = RequestMethod.GET)
	public GeneralPagingResult<List<BookCaseLayerInsideRspBody>> findBookCaseLayerInsides(
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookcaselayerinsides/{bookCaseLayerInsideId}", method = RequestMethod.GET)
	public GeneralContentResult<BookCaseLayerInsideRspBody> findBookCaseLayerInsideById(
			@PathVariable("bookCaseLayerInsideId") String bookCaseLayerInsideId);

	@RequestMapping(value = "/auth/bookcaselayerinsides", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookCaseLayerInside(
			@RequestBody BookCaseLayerInsideReqBody bookCaseReqBody);

	@RequestMapping(value = "/auth/bookcaselayerinsides/{bookCaseLayerInsideId}", method = RequestMethod.PUT)
	public GeneralResult updateBookCaseLayerInside(
			@PathVariable("bookCaseLayerInsideId") String bookCaseLayerInsideId,
			@RequestBody BookCaseLayerInsideReqBody bookCaseReqBody);
	
	@RequestMapping(value = "/auth/bookcaselayerinsides/{bookCaseLayerInsideId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookCaseLayerInsides(
			@PathVariable("bookCaseLayerInsideId") String bookCaseLayerInsideId);
	
}

