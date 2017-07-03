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
import com.bookcase.system.bookadmin.client.CoredataBookCaseClient;
import com.bookcase.system.bookadmin.service.BookCaseService;
import com.bookcase.system.bookbasemgmt.otd.bookauthor.BookAuthorRspBody;
import com.bookcase.system.bookcoremgmt.dto.bookcase.BookCaseReqBody;
import com.bookcase.system.bookcoremgmt.dto.bookcase.BookCaseReqParam;
import com.bookcase.system.bookcoremgmt.otd.bookcase.BookCaseRspBody;

@Service
@Slf4j
public class BookCaseServiceImpl implements BookCaseService {

	@Autowired
	CoredataBookCaseClient coredataBookCaseClient;
	
	@Override
	public GeneralPagingResult<List<BookCaseRspBody>> findBookCases(
			String page, String size) {
		return coredataBookCaseClient.findBookCases(page,size);
	}

	@Override
	public GeneralContentResult<BookCaseRspBody> findBookCaseById(
			String bookcaseId) {
		return coredataBookCaseClient.findBookCaseById(bookcaseId);
	}

	@Override
	public GeneralContentResult<String> createBookCase(
			BookCaseReqBody bookCaseReqBody) {
		return coredataBookCaseClient.createBookCase(bookCaseReqBody);
	}

	@Override
	public GeneralResult updateBookCase(String bookcaseId,
			BookCaseReqBody bookCaseReqBody) {
		return coredataBookCaseClient.updateBookCase(bookcaseId,bookCaseReqBody);
	}

	@Override
	public GeneralResult deleteBookCases(String bookcaseId) {
		return coredataBookCaseClient.deleteBookCases(bookcaseId);
	}

}
