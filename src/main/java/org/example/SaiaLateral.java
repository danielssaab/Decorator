package org.example;

class SaiaLateral extends CarroDecorator {
	public SaiaLateral(Carro carroDecorado) {
		super(carroDecorado);
	}

	@Override
	public double aceleracao() {
		return super.aceleracao() - 0.3;
	}
}