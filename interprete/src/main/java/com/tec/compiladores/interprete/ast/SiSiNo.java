package com.tec.compiladores.interprete.ast;

import java.util.List;
import java.util.Map;

public class SiSiNo implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elsebody;
	
	public SiSiNo(ASTNode condition, List<ASTNode> body, List<ASTNode> elsebody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elsebody = elsebody;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		if((boolean) condition.execute(symbolTable)) {
			for(ASTNode n : body) {
				n.execute(symbolTable);
			}
		}else {
			for(ASTNode n : elsebody) {
				n.execute(symbolTable);
			}
		}
		return null;
	}

}
