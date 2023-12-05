/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg.test;

import it.csi.siac.siacintegser.frontend.webservice.msg.base.BaseResponse;

public class TestResponse extends BaseResponse {
	private Test testInteg;

	public Test getTestInteg() {
		return testInteg;
	}

	public void setTestInteg(Test testInteg) {
		this.testInteg = testInteg;
	}
}
