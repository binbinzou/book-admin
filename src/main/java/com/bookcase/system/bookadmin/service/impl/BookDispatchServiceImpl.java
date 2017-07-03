/**
 * Project Name:book-coredatemgmt
 * File Name:BookDispatchServiceImpl.java
 * Package Name:com.bookcase.system.bookcoredatamgmt.service.impl
 * Date:2017年5月23日上午8:07:43
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
import com.bookcase.system.bookadmin.client.CoredataBookDispatchClient;
import com.bookcase.system.bookadmin.service.BookDispatchService;
import com.bookcase.system.bookcoremgmt.dto.bookdispatch.BookDispatchReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookdispatch.BookDispatchReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookcase.BookCaseRspBody;
import com.bookcase.system.bookcoremgmt.otd.bookdispatch.BookDispatchRspBody;

/**
 * ClassName:BookDispatchServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 上午8:07:43 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookDispatchServiceImpl implements BookDispatchService {

	@Autowired
	CoredataBookDispatchClient coredataBookDispatchClient;
	
	@Override
	public GeneralPagingResult<List<BookDispatchRspBody>> findBookDispatchs(
			String page, String size) {
		return coredataBookDispatchClient.findBookDispatchs(page,size);
	}

	@Override
	public GeneralContentResult<BookDispatchRspBody> findBookDispatchById(
			String bookDispatchId) {
		return coredataBookDispatchClient.findBookDispatchById(bookDispatchId);
	}

	@Override
	public GeneralContentResult<String> createBookDispatch(
			BookDispatchReqBody bookDispatchReqBody) {
		return coredataBookDispatchClient.createBookDispatch(bookDispatchReqBody);
	}

	@Override
	public GeneralResult updateBookDispatch(String bookDispatchId,
			BookDispatchReqBody bookDispatchReqBody) {
		return coredataBookDispatchClient.updateBookDispatch(bookDispatchId,bookDispatchReqBody);
	}

	@Override
	public GeneralResult deleteBookDispatchs(
			String bookDispatchId) {
		return coredataBookDispatchClient.deleteBookDispatchs(bookDispatchId);
	}

}

