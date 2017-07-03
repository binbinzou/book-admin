/**
 * Project Name:book-admin
 * File Name:BaseBookcaseTypeLayerinsideClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年6月29日下午8:31:58
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookadmin.client;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookcase.common.system.bookframework.returnresult.GeneralContentResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralPagingResult;
import com.bookcase.common.system.bookframework.returnresult.GeneralResult;
import com.bookcase.system.bookbasemgmt.dto.bookcasetypelayerinside.BookCaseTypeLayerInsideReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcasetypelayerinside.BookCaseTypeLayerInsideReqParam;
import com.bookcase.system.bookbasemgmt.otd.bookcasetypelayerinside.BookCaseTypeLayerInsideRspBody;

/**
 * ClassName:BaseBookcaseTypeLayerinsideClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年6月29日 下午8:31:58 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient(name="book-basemgmt")
public interface BaseBookcaseTypeLayerinsideClient {

	@RequestMapping(value = "/auth/bookcasetypelayerinsides/page/{page}/size/{size}", method = RequestMethod.GET)
	public GeneralPagingResult<List<BookCaseTypeLayerInsideRspBody>> findBookCaseTypeLayerInsides(
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookcasetypelayerinsides/{bookCaseTypeLayerInsideId}", method = RequestMethod.GET)
	public GeneralContentResult<BookCaseTypeLayerInsideRspBody> findBookCaseTypeLayerInsideById(
			@PathVariable("bookCaseTypeLayerInsideId") String bookCaseTypeLayerInsideId);

	@RequestMapping(value = "/auth/bookcasetypelayerinside", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookCaseTypeLayerInside(
			@RequestBody BookCaseTypeLayerInsideReqBody bookCaseTypeLayerInsideReqBody);

	@RequestMapping(value = "/auth/bookcasetypelayerinside/{bookCaseTypeLayerInsideId}", method = RequestMethod.PUT)
	public GeneralResult updateBookCaseTypeLayerInside(
			@PathVariable("bookCaseTypeLayerInsideId") String bookCaseTypeLayerInsideId,
			@RequestBody BookCaseTypeLayerInsideReqBody bookCaseTypeLayerInsideReqBody);
	
	@RequestMapping(value = "/auth/bookcasetypelayerinsides/{bookCaseTypeLayerInsideId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookCaseTypeLayerInsides(
			@PathVariable("bookCaseTypeLayerInsideId") String bookCaseTypeLayerInsideId);
	
}

