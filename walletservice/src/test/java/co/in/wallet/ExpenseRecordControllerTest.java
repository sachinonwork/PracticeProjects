/* * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */



package co.in.wallet;


import co.in.wallet.controller.ExpenseRecordController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Response;
import java.util.List;

public class ExpenseRecordControllerTest {

	@Autowired
	private ExpenseRecordController expenseRecordController;


	@Test
	public void shouldGetListOfTransactions() throws Exception {
		Response<List> response = expenseRecordController.getAllExpenses();
	}

}
