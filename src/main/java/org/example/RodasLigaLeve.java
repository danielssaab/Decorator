package org.example;

class RodasLigaLeve extends CarroDecorator {
	public RodasLigaLeve(Carro carroDecorado) {
		super(carroDecorado);
	}

	@Override
	public double aceleracao() {
		return super.aceleracao() - 0.8;
	}
}
