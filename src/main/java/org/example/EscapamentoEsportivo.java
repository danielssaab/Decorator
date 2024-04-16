package org.example;

class EscapamentoEsportivo extends CarroDecorator {
	public EscapamentoEsportivo(Carro carroDecorado) {
		super(carroDecorado);
	}

	@Override
	public double aceleracao() {
		return super.aceleracao() - 0.4;
	}
}