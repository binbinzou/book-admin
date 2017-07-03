/**
 * Project Name:book-basemgmt
 * File Name:BookCommonMsgServiceImpl.java
 * Package Name:com.bookcase.system.bookbasemgmt.service.impl
 * Date:2017年5月24日下午8:54:38
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
import com.bookcase.system.bookadmin.client.BaseBookCommonMsgClient;
import com.bookcase.system.bookadmin.service.BookCommonMsgService;
import com.bookcase.system.bookbasemgmt.dto.bookcommonmsg.BookCommonMsgReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcommonmsg.BookCommonMsgReqParam;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspBody;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspQuery;
import com.bookcase.system.bookbasemgmt.otd.bookcommonmsg.BookCommonMsgRspBody;

/**
 * ClassName:BookCommonMsgServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午8:54:38 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service
@Slf4j
public class BookCommonMsgServiceImpl implements BookCommonMsgService {

	@Autowired
	BaseBookCommonMsgClient baseBookCommonMsgClient;
	
	@Override
	public GeneralPagingResult<List<BookCommonMsgRspBody>> findBookCommonMsgs(BookAuthorRspQuery query,
			String page, String size) {
		return baseBookCommonMsgClient.findBookCommonMsgs(query,page,size);
	}

	@Override
	public GeneralContentResult<BookCommonMsgRspBody> findBookCommonMsgById(
			String bookCommonMsgId) {
		return baseBookCommonMsgClient.findBookCommonMsgById(bookCommonMsgId);
	}

	@Override
	public GeneralContentResult<String> createBookCommonMsg(
			BookCommonMsgReqBody bookCommonMsgReqBody) {
		return baseBookCommonMsgClient.createBookCommonMsg(bookCommonMsgReqBody);
	}

	@Override
	public GeneralResult updateBookCommonMsg(String bookCommonMsgId,
			BookCommonMsgReqBody bookCommonMsgReqBody) {
		return baseBookCommonMsgClient.updateBookCommonMsg(bookCommonMsgId,bookCommonMsgReqBody);
	}

	@Override
	public GeneralResult deleteBookCommonMsgs(
			 String bookCommonMsgId) {
		return baseBookCommonMsgClient.deleteBookCommonMsgs(bookCommonMsgId);
	}

	@Override
	public GeneralContentResult<List<BookCommonMsgRspBody>> findBookCommonMsgByName(
			String name) {
		return baseBookCommonMsgClient.findBookCommonMsgByName(name);
	}

}

