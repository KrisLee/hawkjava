package com.hawk.cdk.http.handler;

import java.io.IOException;
import java.util.Map;

import net.sf.json.JSONObject;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.hawk.cdk.CdkServices;
import com.hawk.cdk.http.CdkHttpServer;
import com.hawk.cdk.http.param.DelTypeParam;

/**
 * cdk类型删除
 * 
 * @author hawk
 */
public class DelTypeHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange httpExchange) throws IOException {
		int status = CdkServices.CDK_PARAM_ERROR;
		JSONObject jsonObject = new JSONObject();

		Map<String, String> params = CdkHttpServer.parseHttpParam(httpExchange);
		DelTypeParam cdkparam = new DelTypeParam();
		if (cdkparam.initParam(params)) {
			cdkparam.toLowerCase();
			CdkServices.getInstance().delCdkType(cdkparam);
			status = CdkServices.CDK_STATUS_OK;
		}

		jsonObject.put("status", String.valueOf(status));
		CdkHttpServer.response(httpExchange, jsonObject);
	}
}
