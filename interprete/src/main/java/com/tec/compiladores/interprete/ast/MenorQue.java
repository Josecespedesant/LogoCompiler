package com.tec.compiladores.interprete.ast;

import java.util.Map;

public class MenorQue implements ASTNode {
	private ASTNode op1, op2;	

	public MenorQue(ASTNode op1, ASTNode op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return (float) op1.execute(symbolTable) < (float) op2.execute(symbolTable);
	}

}