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
import com.bookcase.system.bookadmin.client.BaseBookcaseLayerinsidesizeClient;
import com.bookcase.system.bookadmin.service.BookCaseLayerInsideSizeService;
import com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize.BookCaseLayerInsideSizeReqBody;
import com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize.BookCaseLayerInsideSizeReqParam;
import com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize.BookCaseLayerInsideSizeReqQuery;
import com.bookcase.system.bookbasemgmt.otd.bookcaselayerinsidesize.BookCaseLayerInsideSizeRspBody;

@Service
@Slf4j
public class BookCaseLayerInsideSizeServiceImpl implements
		BookCaseLayerInsideSizeService {

	@Autowired
	BaseBookcaseLayerinsidesizeClient baseBookcaseLayerinsidesizeClient;

	@Override
	public GeneralPagingResult<List<BookCaseLayerInsideSizeRspBody>> findBookCaseLayerInsideSizes(
			BookCaseLayerInsideSizeReqQuery query, String page, String size) {
		return baseBookcaseLayerinsidesizeClient.findBookCaseLayerInsideSizes(query,page,size);
	}

	@Override
	public GeneralContentResult<BookCaseLayerInsideSizeRspBody> findBookCaseLayerInsideSizeById(
			String bookCaseLayerInsideSizeId) {
		return baseBookcaseLayerinsidesizeClient.findBookCaseLayerInsideSizeById(bookCaseLayerInsideSizeId);
	}

	@Override
	public GeneralContentResult<String> createBookCaseLayerInsideSize(
			BookCaseLayerInsideSizeReqBody bookCaseLayerInsideSizeReqBody) {
		return baseBookcaseLayerinsidesizeClient.createBookCaseLayerInsideSize(bookCaseLayerInsideSizeReqBody);
	}

	@Override
	public GeneralResult updateBookCaseLayerInsideSize(
			String bookCaseLayerInsideSizeId,
			BookCaseLayerInsideSizeReqBody bookCaseLayerInsideSizeReqBody) {
		return baseBookcaseLayerinsidesizeClient.updateBookCaseLayerInsideSize(bookCaseLayerInsideSizeId,bookCaseLayerInsideSizeReqBody);
	}

	@Override
	public GeneralResult deleteBookCaseLayerInsideSizes(
			String bookCaseLayerInsideSizeId) {
		return baseBookcaseLayerinsidesizeClient.deleteBookCaseLayerInsideSizes(bookCaseLayerInsideSizeId);
	}

	@Override
	public GeneralContentResult<List<BookCaseLayerInsideSizeRspBody>> findBookCaseLayerInsideSizeByName(
			String name) {
		return baseBookcaseLayerinsidesizeClient.findBookCaseLayerInsideSizeByName(name);
	}

}
