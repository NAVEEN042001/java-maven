package io.github.mariazevedo88.templatemethod;

import java.util.List;

import io.github.mariazevedo88.builder.Venda;

public abstract class Relatorio {
    
	protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void conteudo(List<Venda> vendas);

    public final void geraRelatorio(List<Venda> vendas) {
    	cabecalho();
    	conteudo(vendas);
    	rodape();
    }
    
}