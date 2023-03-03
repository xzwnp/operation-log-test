package com.example.operationlogtest.component;

import icu.ynu.log.bean.Operator;
import icu.ynu.log.operator.IOperatorGetService;
import org.springframework.stereotype.Component;

/**
 * com.example.operationlogtest.component
 *
 * @author xzwnp
 * 2023/3/2
 * 22:59
 */
@Component
public class CustomOperatorGetService implements IOperatorGetService {
	@Override
	public Operator getOperator() {
		return new Operator("1234", "王小虎");
	}
}
