/**
 * Project Name:book-admin
 * File Name:BaseBookcaseLayerinsidesizeClient.java
 * Package Name:com.bookcase.system.bookadmin.client
 * Date:2017年6月29日下午7:53:11
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
import com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize.BookCaseLayerInsideSizeReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize.BookCaseLayerInsideSizeReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize.BookCaseLayerInsideSizeReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookcaselayerinsidesize.BookCaseLayerInsideSizeRspBody;

/**
 * ClassName:BaseBookcaseLayerinsidesizeClient <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年6月29日 下午7:53:11 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@FeignClient(name="book-basemgmt")
public interface BaseBookcaseLayerinsidesizeClient {

	@RequestMapping(value = "/auth/bookcaselayerinsidesizes/page/{page}/size/{size}", method = RequestMethod.POST)
	public GeneralPagingResult<List<BookCaseLayerInsideSizeRspBody>> findBookCaseLayerInsideSizes(@RequestBody BookCaseLayerInsideSizeReqQuery query,
			@PathVariable("page") String page, @PathVariable("size") String size);

	@RequestMapping(value = "/auth/bookcaselayerinsidesizes/{bookCaseLayerInsideSizeId}", method = RequestMethod.GET)
	public GeneralContentResult<BookCaseLayerInsideSizeRspBody> findBookCaseLayerInsideSizeById(
			@PathVariable("bookCaseLayerInsideSizeId") String bookCaseLayerInsideSizeId);

	@RequestMapping(value = "/auth/bookcaselayerinsidesizes", method = RequestMethod.POST)
	public GeneralContentResult<String> createBookCaseLayerInsideSize(
			@RequestBody BookCaseLayerInsideSizeReqBody bookCaseLayerInsideSizeReqBody);

	@RequestMapping(value = "/auth/bookcaselayerinsidesizes/{bookCaseLayerInsideSizeId}", method = RequestMethod.PUT)
	public GeneralResult updateBookCaseLayerInsideSize(
			@PathVariable("bookCaseLayerInsideSizeId") String bookCaseLayerInsideSizeId,
			@RequestBody BookCaseLayerInsideSizeReqBody bookCaseLayerInsideSizeReqBody);
	
	@RequestMapping(value = "/auth/bookcaselayerinsidesizes/{bookCaseLayerInsideSizeId}", method = RequestMethod.DELETE)
	public GeneralResult deleteBookCaseLayerInsideSizes(
			@PathVariable("bookCaseLayerInsideSizeId") String bookCaseLayerInsideSizeId);
	
	@RequestMapping(value = "/auth/bookcaselayerinsidesizes/name/{name}", method = RequestMethod.GET)
	public GeneralContentResult<List<BookCaseLayerInsideSizeRspBody>> findBookCaseLayerInsideSizeByName(
			@PathVariable("name") String name);
	
	
}

